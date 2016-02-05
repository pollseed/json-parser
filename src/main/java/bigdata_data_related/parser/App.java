package bigdata_data_related.parser;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dto.GithubDto;
import dto.SampleDto;
import net.arnx.jsonic.JSON;

/**
 * Hello world!
 */
public class App {
    private static final String json = "{\"id\":1,\"name\":\"jquery\", \"owner\":{\"id\":1,\"login\":\"jquery\",\"test\":1}}";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        jackson();
    }

    // JSONIC
    public static void jsonic() {
        SampleDto dto = JSON.decode(json, SampleDto.class);
        System.out.println(dto.getId());
        System.out.println(dto.getName());
    }

    public static void jackson() throws IOException {
        ObjectMapper om = new ObjectMapper();
        GithubDto dto = om.readValue(json, GithubDto.class);
        System.out.println(dto);
    }
}
