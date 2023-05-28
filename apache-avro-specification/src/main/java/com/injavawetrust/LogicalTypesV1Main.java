package com.injavawetrust;

import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;

import java.math.BigDecimal;

public class LogicalTypesV1Main {

    public static void main(String[] args) {
        // Define the Avro schema with logical type for decimal
        Schema schema = SchemaBuilder.record("Product")
                .fields()
                .name("name").type().stringType().noDefault()
                .name("quantity").type().doubleType().noDefault()
                .name("price").type(LogicalTypes.decimal(10, 2).addToSchema(Schema.create(Schema.Type.BYTES))).noDefault()
                .endRecord();

        // Create a sample record
        GenericRecord product = new GenericData.Record(schema);
        product.put("name", "Example Product");
        product.put("quantity", 123);
        product.put("price", new BigDecimal("12.45"));


        // Print the schema in a pretty format
        System.out.println(schema.toString(true));

        // Print the sample record
        System.out.println(product);
    }
}
