package com.injavawetrust;

import org.apache.avro.Protocol;

public class ProtocolMain {

    public static void main(String[] args) {

        // Avro Protocols describe RPC interfaces. Like schemas, they are defined with JSON text.

        // Define the protocol
        Protocol protocol = Protocol.parse(
                "{\n" +
                        "    \"namespace\": \"com.example\",\n" +
                        "    \"protocol\": \"SampleProtocol\",\n" +
                        "    \"doc\": \"Sample Avro Protocol\",\n" +
                        "    \"types\": [\n" +
                        "        { \"name\": \"SampleRecord\", \"type\": \"record\",\n" +
                        "          \"fields\": [\n" +
                        "            { \"name\": \"id\", \"type\": \"int\" },\n" +
                        "            { \"name\": \"name\", \"type\": \"string\" },\n" +
                        "            { \"name\": \"email\", \"type\": \"string\" }\n" +
                        "          ]\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"messages\": {\n" +
                        "        \"sendMessage\": {\n" +
                        "            \"request\": [{ \"name\": \"message\", \"type\": \"string\" }],\n" +
                        "            \"response\": \"string\",\n" +
                        "            \"doc\": \"Sends a message and returns a response\"\n" +
                        "        }\n" +
                        "    }\n" +
                        "}"
        );

        // Accessing protocol details
        System.out.println("Protocol Name: " + protocol.getName());
        System.out.println("Protocol Namespace: " + protocol.getNamespace());
        System.out.println("Protocol Documentation: " + protocol.getDoc());

        // Accessing record details
        Protocol.Message message = protocol.getMessages().get("sendMessage");
        System.out.println("Message Name: " + message.getName());
        System.out.println("Message Request: " + message.getRequest());
        System.out.println("Message Response: " + message.getResponse());
        System.out.println("Message Documentation: " + message.getDoc());
    }
}