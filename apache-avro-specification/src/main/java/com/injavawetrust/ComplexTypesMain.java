package com.injavawetrust;

import com.injavawetrust.dto.ComplexTypes;
import com.injavawetrust.dto.Suit2;

import java.util.List;

public class ComplexTypesMain {

    public static void main(String[] args) {

        ComplexTypes complexTypes =
                ComplexTypes.newBuilder()
                        .setName("complex-name")
                        .setSuit(Suit2.CLUBS)
                        .setParameters(List.of("param1")).build();
    }
}
