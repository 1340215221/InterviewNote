package com.rh.code.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class JsonBool2Int extends JsonDeserializer<Integer> {

    /**
     * 空值时, 不会走这个方法
     */
    @Override
    public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        System.out.println(jsonParser.getValueAsBoolean());
        return jsonParser.getValueAsBoolean() ? 1 : 0;
    }
}
