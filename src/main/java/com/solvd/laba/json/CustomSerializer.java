package com.solvd.laba.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomSerializer extends StdSerializer <Date> {


    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public CustomSerializer() {
        this(null);
    }

    public CustomSerializer(Class<Date> t) {
        super(t);
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(dateFormat.format(date));
    }
}
