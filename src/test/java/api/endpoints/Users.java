package api.endpoints;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Users {
// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
    private int userId;
//    @JsonIgnore
    private int id;
    private String title;
    private String body;
}
