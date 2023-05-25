package com.injavawetrust;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroJsonEncodingExampleMain {

    public static void main(String[] args) throws IOException {

        // Define the Avro schema
        Schema schema = new Schema.Parser().parse(
                "{\n" +
                        "    \"type\": \"record\",\n" +
                        "    \"name\": \"SampleRecord\",\n" +
                        "    \"fields\": [\n" +
                        "        { \"name\": \"id\", \"type\": \"int\" },\n" +
                        "        { \"name\": \"name\", \"type\": \"string\" },\n" +
                        "        { \"name\": \"email\", \"type\": \"string\" }\n" +
                        "    ]\n" +
                        "}"
        );

        // Create a generic record
        GenericRecord record = new GenericData.Record(schema);
        record.put("id", 1);
        record.put("name", "John Doe");
        record.put("email", "johndoe@example.com");

        // Encode the Avro record to JSON
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Encoder jsonEncoder = EncoderFactory.get().jsonEncoder(schema, outputStream);
        DatumWriter<GenericRecord> writer = new SpecificDatumWriter<>(schema);
        writer.write(record, jsonEncoder);
        jsonEncoder.flush();

        // Retrieve the JSON-encoded Avro data
        String json = outputStream.toString();

        // Print the JSON-encoded data
        System.out.println(json);

        // Close the output stream
        outputStream.close();
    }
}
