package laboratorium1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStudent {
    final String name;
    final String number;
    final String section;
    @JsonCreator
    public NewStudent(@JsonProperty("name") String name,@JsonProperty("number") String number, @JsonProperty("sekcja") String section) {
        this.name = name;
        this.number = number;
        this.section = section;
    }
}
