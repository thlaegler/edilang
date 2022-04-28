# edilang

Xtext DSL to edit, parse, and serialize EDIFACT messages.

Xtext language definition: [/edilang/src/io/thlaegler/edifact/Edilang.xtext](/edilang/src/io/thlaegler/edifact/Edilang.xtext)

More info on EDIFACT:

* [https://service.unece.org/trade/untdid/d00a/trsd/trsdi1.htm](https://service.unece.org/trade/untdid/d00a/trsd/trsdi1.htm).
* [http://docs.oasis-open.org/ubl/UBL-IFTM-Mapping/v1.0/cn01/UBL-IFTM-Mapping-v1.0-cn01.html](http://docs.oasis-open.org/ubl/UBL-IFTM-Mapping/v1.0/cn01/UBL-IFTM-Mapping-v1.0-cn01.html)
* [https://unece.org/fileadmin/DAM/trade/edifact/untdid/d422_s.htm](https://unece.org/fileadmin/DAM/trade/edifact/untdid/d422_s.htm)

## Usage

### Eclipse application

Launch submodule `edilang` as Eclipse application/plugin.

### Web application

Launch a Jetty server and open EDIFACT editor in browser: http://localhost:8080

```
$ cd edilang.web
$ mvn jetty:run
```

### Java library/dependency

Use the library `edilang.mapper` in your project (either as fat-jar or plain jar).


## SerDe

### Serialize

```
EdiModel edifactModel = new EdiModel ...;
String edifactMessage = new EdifactMapper().writeValueAsString(edifactModel);
```

### Deserialize

```
String edifactString = "UNB+IATB:1+1APPC+NZ0AV+200120:2136+039I42XXTK0001+++0'" +
  "UNH+1+PAOREQ:96:2:IA+00012432090782'" +
  ... +
  "UNT+9+1'" +
  "UNZ+1+039I42XXTK0001'";
EdiModel edifactModel = new EdifactMapper().readValue(edifactString);
```

## EDIFACT Segments

| Segment | Implemented | Segment description |
|--|--|--|
| Headers |||
| UNA | x | Service String advice header |
| UNB | x | Interchange Header with Interchange Trailer UNZ |
| UNH | x | Header with trailer UNT |
| UNG | x | Functional Group Header |
| |||
| Segment directory Batch (EDSD) |||
| https://service.unece.org/trade/untdid/d20b/trsd/trsdi2.htm |||
| ADR | x | Address |
| AGR | x | Agreement identification |
| AJT | x | Adjustment details |
| ALC | x | Allowance or charge |
| ALI | x | Additional information |
| APP | x | Applicability |
| APR | x | Additional price information |
| ARD | x | Monetary amount function |
| ARR | x | Array information |
| ASI | x | Array structure identification |
| ATT | x | Attribute |
| AUT | x | Authentication result |
| BAS | x | Basis |
| BGM | x | Beginning of message |
| BII | x | Structure identification |
| BUS | x | Business function |
| CAV | x | Characteristic value |
| CCD | x | Credit cover details |
| CCI | x | Characteristic/class id |
| CDI | x | Physical or logical state |
| CDS | x | Code set identification |
| CDV | x | Code value definition |
| CED | x | Computer environment details |
| CIN | x | Clinical information |
| CLA | x | Clause identification |
| CLI | x | Clinical intervention |
| CMP | x | Composite data element identification |
| CNI | x | Consignment information |
| CNT | x | Control total |
| COD | x | Component details |
| COM | x | Communication contact |
| COT | x | Contribution details |
| CPI | x | Charge payment instructions |
| CPS | x | Consignment packing sequence |
| CPT | x | Account identification |
| CST | x | Customs status of goods |
| CTA | x | Contact information |
| CUX | x | Currencies |
| DAM | x | Damage |
| DFN | x | Definition function |
| DGS | x | Dangerous goods |
| DII | x | Directory identification |
| DIM | x | Dimensions |
| DLI | x | Document line identification |
| DLM | x | Delivery limitations |
| DMS | x | Document/message summary |
| DOC | x | Document/message details |
| DRD | x | Data representation details |
| DSG | x | Dosage administration |
| DSI | x | Data set identification |
| DTM | x | Date/time/period |
| EDT | x | Editing details |
| EFI | x | External file link identification |
| ELM | x | Simple data element details |
| ELU | x | Data element usage details |
| ELV | x | Element value definition |
| EMP | x | Employment details |
| EQA | x | Attached equipment |
| EQD | x | Equipment details |
| EQN | x | Number of units |
| ERP | x | Error point details |
| ERC | x | Application error information |
| EVE | x | Event |
| EVT | x | Event |
| FCA | x | Financial charges allocation |
| FII | x | Financial institution information |
| FNS | x | Footnote set |
| FNT | x | Footnote |
| FOR | x | Formula |
| FSQ | x | Formula sequence |
| FTX | x | Free text |
| GDS | x | Nature of cargo |
| GEI | x | Processing information |
| GID | x | Goods item details |
| GIN | x | Goods identity number |
| GIR | x | Related identification numbers |
| GIS | x | General indicator |
| GOR | x | Governmental requirements |
| GRU | x | Segment group usage details |
| HAN | x | Handling instructions |
| HYN | x | Hierarchy information |
| ICD | x | Insurance cover description |
| IDE | x | Identity |
| IFD | x | Information detail |
| IHC | x | Person characteristic |
| IMD | x | Item description |
| IND | x | Index details |
| INP | x | Parties and instruction |
| INV | x | Inventory management related details |
| IRQ | x | Information required |
| LAN | x | Language |
| LIN | x | Line item |
| LOC | x | Place/location identification |
| MEA | x | Measurements |
| MEM | x | Membership details |
| MKS | x | Market/sales channel information |
| MOA | x | Monetary amount |
| MSG | x | Message type identification |
| NAD | x | Name and address |
| NAT | x | Nationality |
| PAC | x | Package |
| PAI | x | Payment instructions |
| PAS | x | Attendance |
| PAT | x | Payment terms basis |
| PCC | x | Premium calculation component details |
| PCD | x | Percentage details |
| PCI | x | Package identification |
| PDI | x | Person demographic information |
| PER | x | Period related details |
| PGI | x | Product group information |
| PIA | x | Additional product id |
| PNA | x | Party identification |
| POC | x | Purpose of conveyance call |
| PRC | x | Process identification |
| PRI | x | Price details |
| PRV | x | Proviso details |
| PSD | x | Physical sample description |
| PTY | x | Priority |
| PYT | x | Payment terms |
| QRS | x | Query and response |
| QTY | x | Quantity |
| QUA | x | Qualification |
| QVR | x | Quantity variances |
| RCS | x | Requirements and conditions |
| REL | x | Relationship |
| RFF | x | Reference |
| RJL | x | Accounting journal identification |
| RNG | x | Range details |
| ROD | x | Risk object type |
| RSL | x | Result |
| RTE | x | Rate details |
| SAL | x | Remuneration type identification |
| SCC | x | Scheduling conditions |
| SCD | x | Structure component definition |
| SEG | x | Segment identification |
| SEL | x | Seal number |
| SEQ | x | Sequence details |
| SFI | x | Safety information |
| SGP | x | Split goods placement |
| SGU | x | Segment usage details |
| SPR | x | Organisation classification details |
| SPS | x | Sampling parameters for summary statistics |
| STA | x | Statistics |
| STC | x | Statistical concept |
| STG | x | Stages |
| STS | x | Status |
| STX | x | Start of Interchange |
| TAX | x | Duty/tax/fee details |
| TCC | x | Transport charge/rate calculations |
| TDT | x | Details of transport |
| TEM | x | Test method |
| TMD | x | Transport movement details |
| TMP | x | Temperature |
| TOD | x | Terms of delivery or transport |
| TPL | x | Transport placement |
| TRU | x | Technical rules |
| TSR | x | Transport service requirements |
| UCI | x | ? |
| VLI | x | Value list identification |
| |||
| Segment directory Interactive (IDSD) |||
| https://service.unece.org/trade/untdid/d20b/tisd/tisdi2.htm |||
| AAI |  | Accommodation allocation information | |
| ALS |  | Additional location information |
| ODS |  | Additional product details |
| APD |  | Additional transport details |
| ADS |  | Address |
| ERI |  | Application error information |
| ATR |  | Attribute |
| BCD |  | Benefit and coverage detail |
| BLI |  | Billable information |
| MOV |  | Car delivery instruction |
| CLT |  | Clear terminate information |
| CMN |  | Commission information |
| CNX |  | Connection details |
| CRI |  | Consumer reference information |
| CON |  | Contact information |
| CNY |  | Country information |
| CUR |  | Currencies |
| DAV |  | Daily availability |
| DTI |  | Date and time information |
| DNT |  | Dental information |
| DIS |  | Discount information |
| SER |  | Facility information |
| FRM |  | Follow-up action |
| FRQ |  | Frequency |
| FTI |  | Frequent traveller information |
| HDI |  | Hardware device information |
| HDR |  | Header information |
| ADI |  | Health care claim adjudication information |
| HDS |  | Health diagnosis service and delivery |
| ITD |  | Information type data |
| ITC |  | Institutional claim |
| ICI |  | Insurance cover information |
| IFT |  | Interactive free text |
| ITM |  | Item number |
| LNG |  | Language |
| LKP |  | Level indication |
| POR |  | Location and/or related time information |
| MES |  | Measurements |
| MSD |  | Message action details |
| MAP |  | Message application product information |
| NME |  | Name |
| NAA |  | Name and address |
| NUN |  | Number of units |
| ODI | x | Origin and destination details |
| ORG | x | Originator of request details |
| OTI |  | Other insurance |
| PRT |  | Party information |
| PMT |  | Payment information |
| POP |  | Period of operation |
| POS |  | Point of sale information |
| PRE |  | Price details |
| PRD |  | Product identification |
| PDT |  | Product information |
| PLI |  | Product location information |
| PRO |  | Promotions |
| QTI |  | Quantity |
| RPI |  | Quantity and action details |
| RTI |  | Rate details |
| RTC |  | Rate types |
| RFR |  | Reference |
| RLS |  | Relationship |
| RCI |  | Reservation control information |
| RUL |  | Rule information |
| SDT |  | Selection details |
| ASD |  | Service details |
| PSI |  | Service information |
| SSR |  | Special requirement details |
| TFF |  | Tariff information |
| TXS |  | Taxes |
| TCE |  | Time and certainty |
| TIZ |  | Time zone information |
| ATI |  | Tour information |
| TRF |  | Traffic restriction details |
| TVL | x | Travel product information |
| TDI |  | Traveller document information |
| TIF |  | Traveller information |
| VEH |  | Vehicle |
| |||
| Trailers |||
| UNS | x | Section Control Trailer for header UNS |
| UNZ | x | Interchange Trailer for header UNB |
| UNT | x | Message Trailer |
| UNE | x | Functional Group Trailer
