package io.thlaegler.edifact.generator;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.trace.TraceNotFoundException;

import io.thlaegler.edifact.edilang.AbstractEdiFunction;
import io.thlaegler.edifact.edilang.AbstractEdiSegment;
import io.thlaegler.edifact.edilang.EdiModel;

/**
 * Generates code from your model files on save.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class EdilangGenerator extends AbstractGenerator {

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		EdiModel model = resource.getContents().stream().filter(c -> c instanceof EdiModel).map(m -> (EdiModel) m)
				.findFirst().orElseThrow(() -> new IllegalStateException("No model found"));

		String summary = "Parsed EDIFACT model:" + System.lineSeparator() + System.lineSeparator()
				+ model.getSegments().stream().map(s -> {
					String details = "";
					try {
						details = ediSegment(s);
					} catch (Exception ex) {
						System.out.println("Failed to print EDIFACT model (2): " + ex.getMessage());
						details = "\t" + ex.getMessage();
					}
					return s.getSegment() + " segment:" + System.lineSeparator() + details;
				}).filter(Objects::nonNull)
						.collect(Collectors.joining(System.lineSeparator() + System.lineSeparator()));

		fsa.generateFile("edifact_parse_details_" + System.currentTimeMillis() + ".txt", summary);
	}

	private String ediSegment(AbstractEdiSegment segment) {
		return Arrays.asList(segment.getClass().getDeclaredMethods()).stream()
				.filter(m -> m.getName().startsWith("get")).map(m -> {
					try {
						Object result = m.invoke(segment);
						if (result == null) {
							return null;
						}
						if (result instanceof AbstractEdiFunction) {
							String ediFunction = ediFunction((AbstractEdiFunction) result);
							return "\t" + m.getName().replaceFirst("get", "") + "=(" + ediFunction + ")";
						} else if (result instanceof List) {
							if (((List) result).isEmpty()) {
								return null;
							}
							return "\t" + m.getName().replaceFirst("get", "") + "=[(" + ((List<Object>) result).stream()
									.map(o -> ediFunction((AbstractEdiFunction) o)).collect(Collectors.joining("), ("))
									+ ")]";
						} else {
							return "\t" + m.getName().replaceFirst("get", "") + "=" + result.toString();
						}
					} catch (Exception ex) {
						System.out.println("Failed to print segment attributes (1): " + ex.getMessage());
						return "\t" + m.getName().replaceFirst("get", "") + "=" + ex.getMessage();
					}
				}).filter(Objects::nonNull).collect(Collectors.joining(System.lineSeparator()));
	}

	private String ediFunction(AbstractEdiFunction function) {
		return Arrays.asList(function.getClass().getDeclaredMethods()).stream()
				.filter(f -> f.getName().startsWith("get")).map(f -> {
					try {
						Object funcAttr = f.invoke(function);
						if (funcAttr == null) {
							return null;
						}
						return f.getName().replaceFirst("get", "") + "=" + funcAttr.toString();
					} catch (Exception ex) {
						System.out.println("Failed to print function attribute (0): " + ex.getMessage());
						return f.getName().replaceFirst("get", "") + "=" + ex.getMessage();
					}
				}).filter(Objects::nonNull).collect(Collectors.joining(", "));
	}
}
