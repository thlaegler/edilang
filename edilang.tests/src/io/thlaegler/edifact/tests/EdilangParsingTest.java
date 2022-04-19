package io.thlaegler.edifact.tests;

import com.google.inject.Inject;

import io.thlaegler.edifact.edilang.BGMSegment;
import io.thlaegler.edifact.edilang.EdiModel;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(EdilangInjectorProvider.class)
class EdilangParsingTest {
	
	@Inject
	private ParseHelper<EdiModel> parseHelper;
	
	@Test
	public void loadModel() throws Exception {
		EdiModel result = parseHelper.parse("//UNA:+.? '\n"
				+ "UNB+UNOA:3+STYLUSSTUDIO:1+DATADIRECT:1+20051107:1159+6002'\n"
				+ "UNH+SSDD1+ORDERS:D:03B:UN:EAN008'\n"
				+ "BGM+220+BKOD99+9'\n"
				+ "DTM+137:20051107:102'\n"
				+ "NAD+BY+5412345000176::9'\n"
				+ "NAD+SU+4012345000094::9'\n"
				+ "LIN+1+1+0764569104:IB'\n"
				+ "QTY+1:25'\n"
				+ "FTX+AFM+1++XPath 2.0 Programmer?s Reference'\n"
				+ "LIN+2+1+0764569090:IB'\n"
				+ "QTY+1:25'\n"
				+ "FTX+AFM+1++XSLT 2.0 Programmer?s Reference'\n"
				+ "LIN+3+1+1861004656:IB'\n"
				+ "QTY+1:16'\n"
				+ "FTX+AFM+1++Java Server Programming'\n"
				+ "LIN+4+1+0596006756:IB'\n"
				+ "QTY+1:10'\n"
				+ "FTX+AFM+1++Enterprise Service Bus'\n"
				+ "UNS+S'\n"
				+ "CNT+2:4'\n"
				+ "UNT+22+SSDD1'\n"
				+ "UNZ+1+6002'");
		
		Assertions.assertNotNull(result);
		
		Assertions.assertEquals("220", result.getSegments().stream()
				.filter(s -> s.getSegment().equals("BGM"))
				.map(s -> (BGMSegment) s)
				.findFirst().get().getDocumentMessageName());
	}
}
