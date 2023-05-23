package com.injavawetrust;

import com.injavawetrust.dto.ComplexTypes;
import com.injavawetrust.dto.MD5;
import com.injavawetrust.dto.Suit2;

import java.util.List;
import java.util.Map;

public class ComplexTypesMain {

    public static void main(String[] args) {

        ComplexTypes complexTypes =
                ComplexTypes.newBuilder()
                        .setName("complex-name")
                        .setSuit(Suit2.CLUBS)
                        .setParameters(List.of("param1"))
                        .setProperties(Map.of("key", 100))
                        .setOptional("optional")
                        .setFixedType(new MD5("sample".getBytes()))
                        .build();


        // The key for an Avro map must be a string.
    }
}
