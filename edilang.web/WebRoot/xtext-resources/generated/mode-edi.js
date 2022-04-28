define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "AAI|ADI|ADR|ADS|AGR|AJT|ALC|ALI|ALS|APD|APP|APR|ARD|ARR|ASD|ASI|ATI|ATR|ATT|AUT|BAS|BCD|BGM|BII|BLI|BUS|CAV|CCD|CCI|CDI|CDS|CDV|CED|CIN|CLA|CLI|CLT|CMN|CMP|CNI|CNT|CNX|CNY|COD|COM|CON|COT|CPI|CPS|CPT|CRI|CST|CTA|CUR|CUX|DAM|DAV|DFN|DGS|DII|DIM|DIS|DLI|DLM|DMS|DNT|DOC|DRD|DSG|DSI|DTI|DTM|EDT|EFI|ELM|ELU|ELV|EMP|EQA|EQD|EQN|ERC|ERI|ERP|EVE|EVT|FCA|FII|FNS|FNT|FOR|FRM|FRQ|FSQ|FTI|FTX|GDS|GEI|GID|GIN|GIR|GIS|GOR|GRU|HAN|HDI|HDR|HDS|HYN|ICD|ICI|IDE|IFD|IFT|IHC|IMD|IND|INP|INV|IRQ|ITC|ITD|ITM|LAN|LIN|LKP|LNG|LOC|MAP|MEA|MEM|MES|MKS|MOA|MOV|MSD|MSG|NA|NAD|NAT|NME|NUN|ODI|ODS|ORG|OTI|PAC|PAI|PAS|PAT|PCC|PCD|PCI|PDI|PDT|PER|PGI|PIA|PLI|PMT|PNA|POC|POP|POR|POS|PRC|PRE|PRI|PRO|PRRD|PRT|PRV|PSD|PSI|PTY|PYT|QRS|QTI|QTY|QUA|QVR|RCI|RCS|REL|RFF|RFR|RJL|RLS|RNG|ROD|RPI|RSL|RTC|RTE|RTI|RUL|SAL|SCC|SCD|SDT|SEG|SEL|SEQ|SER|SFI|SGP|SGU|SPR|SPS|SSR|STA|STC|STG|STS|STX|TAX|TCC|TCE|TDI|TDT|TEM|TFF|TIF|TIZ|TMD|TMP|TOD|TPL|TRF|TRU|TSR|TVL|TXS|UCI|UNA|UNB|UNE|UNG|UNH|UNS|UNT|UNZ|VEH|VLI";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/edi";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
