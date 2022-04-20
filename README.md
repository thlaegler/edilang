# edilang

Xtext DSL to edit, parse, and serialize EDIFACT messages.

For all  EDIFACT segments see [https://service.unece.org/trade/untdid/d00a/trsd/trsdi1.htm](https://service.unece.org/trade/untdid/d00a/trsd/trsdi1.htm).

Xtext language definition: [/edilang/src/io/thlaegler/edifact/Edilang.xtext](/edilang/src/io/thlaegler/edifact/Edilang.xtext)


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
