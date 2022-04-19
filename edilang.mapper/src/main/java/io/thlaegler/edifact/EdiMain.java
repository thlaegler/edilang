package io.thlaegler.edifact;

import java.time.Instant;

import io.thlaegler.edifact.edilang.EdiModel;

public final class EdiMain {

	public static void main(String[] args) {
		EdifactMapper mapper = new EdifactMapper();
		
		String edifactString;
		
		if(args.length < 1) {
			edifactString = "UNB+UNOA:1+01010000253001+O0013000093SCHA-Z59+991006:1902+PAYO0012101221'\n"
					+ "UNH+1+INVOIC:D:97A:UN'\n"
					+ "BGM+381+1060113800026+9'\n"
					+ "DTM+137:199910060000:102'\n"
					+ "NAD+BT+VAUXHALL-MOTORS-LTD::91'\n"
					+ "RFF+VA:382324067'\n"
					+ "NAD+SU+2002993::92'\n"
					+ "RFF+VA:123844750'\n"
					+ "CUX+2:EUR'\n"
					+ "PAT+1'\n"
					+ "DTM+140:19991031:102'\n"
					+ "LIN+++090346642:IN'\n"
					+ "QTY+12:54:PCE'\n"
					+ "MOA+203:1960.29'\n"
					+ "PRI+AAA:3630.1724::NTP:100:C62'\n"
					+ "RFF+SI:165480'\n"
					+ "DTM+11:199909280000:102'\n"
					+ "RFF+ON:X18V00003'\n"
					+ "RFF+TN:AB1'\n"
					+ "TAX+7+VAT+++:::0'\n"
					+ "NAD+ST+023::92'\n"
					+ "UNS+S'\n"
					+ "MOA+77:1960.29'\n"
					+ "TAX+7+VAT'\n"
					+ "UNT+24+1'\n"
					+ "UNZ+1+PAYO0012101221'\n"
					+ "";
		} else {
			edifactString = args[0];
		}		
		
	    int start = Instant.now().getNano();
	    System.out.println(start);
		EdiModel model = mapper.readValue(edifactString);
	    int end = Instant.now().getNano();
	    System.out.println(end);
	    System.out.println(end-start);
		
		String backToString = mapper.writeValueAsString(model);
		System.out.println(backToString);
	}

}
