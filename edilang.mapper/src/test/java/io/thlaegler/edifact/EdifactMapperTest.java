package io.thlaegler.edifact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.thlaegler.edifact.EdifactMapper;
import io.thlaegler.edifact.edilang.EdiModel;
import io.thlaegler.edifact.edilang.TVLSegment;
import io.thlaegler.edifact.edilang.UNBHeader;
import io.thlaegler.edifact.edilang.UNBSegment;
import io.thlaegler.edifact.edilang.impl.EdilangFactoryImpl;


public class EdifactMapperTest {

	private EdilangFactoryImpl modelFactory = new EdilangFactoryImpl();

	private EdifactMapper unitUnderTest;

	@BeforeEach
	public void beforeEach() {
		unitUnderTest = new EdifactMapper();
	}

	@DisplayName("Serialize Edifact model")
	@Test
	public void serialize() {
		EdiModel model = modelFactory.createEdiModel();
		UNBSegment unbSegment = modelFactory.createUNBSegment();
		UNBHeader header = modelFactory.createUNBHeader();
		header.setSyntax("IATB");
		unbSegment.setHeader(header);
		model.getSegments().add(unbSegment);
		String actualEdifactString = unitUnderTest.writeValueAsString(model);

		assertNotNull(actualEdifactString);
		assertEquals("UNB+IATB:1+1APPC+NZ0AV+200120:2136+039I42XXTK0001+++0'\n"
				+ "UNH+1+PAOREQ:96:2:IA+00012432090782'\n"
				+ "TVL+220120+BNE+ZQN+NZ+0860+1+1+P'\n"
				+ "TVL+230120+CHC+ZQN+NZ+5641+2+2+P'\n"
				+ "TVL+230120+CHC+ZQN+NZ+5641+3+2+P'\n" + "",
				actualEdifactString);
	}

	@DisplayName("Deserialize Edifact file")
	@Test
	public void deserialize() {
		String edifactString = "UNB+IATB:1+1APPC+NZ0AV+200120:2136+039I42XXTK0001+++0'\n"
				+ "UNH+1+PAOREQ:96:2:IA+00012432090782'\n" + "TVL+220120+BNE+ZQN+NZ+0860+1+1+P'\n"
				+ "TVL+230120+CHC+ZQN+NZ+5641+2+2+P'\n" + "TVL+230120+CHC+ZQN+NZ+5641+3+2+P'\n" + "";
		EdiModel actualModel = unitUnderTest.readValue(edifactString);

		assertNotNull(actualModel);
		assertNotNull(actualModel.getSegments());

		UNBSegment unbSegment = (UNBSegment) actualModel.getSegments().stream()
				.filter(s -> s.getSegment().equalsIgnoreCase("UNB")).findFirst().orElseThrow();
		assertEquals("IATB", unbSegment.getHeader().getSyntax());

		TVLSegment tvlSegment = (TVLSegment) actualModel.getSegments().stream()
				.filter(s -> s.getSegment().equalsIgnoreCase("TVL")).findFirst().orElseThrow();
		assertEquals("BNE", tvlSegment.getOriginCode());
	}
}
