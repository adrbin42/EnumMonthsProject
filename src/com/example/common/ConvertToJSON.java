package com.example.common;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by adrienne on 7/25/17.
 */
public class ConvertToJSON {
    public static void monthConversion(String monthEntered) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File( monthEntered+ ".json"), monthEntered);
        String jsonString = mapper.writeValueAsString("@JsonValue"+monthEntered);
        System.out.print("Your file will reflect the following month : "+ monthEntered);
    }
}
