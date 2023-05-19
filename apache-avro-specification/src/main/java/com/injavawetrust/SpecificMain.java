package com.injavawetrust;

import com.injavawetrust.dto.User;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class SpecificMain {


    public static void main(String[] args) throws IOException {

        serialize();
        deserialize();
    }
    public static void serialize() throws IOException {

        User user1 = new User();
        user1.setName("Alyssa");
        user1.setFavoriteNumber(256);
        // Leave favorite color null

        // Alternate constructor
        User user2 = new User("Ben", 7, "red");

        // Construct via builder
        User user3 = User.newBuilder()
                .setName("Charlie")
                .setFavoriteColor("blue")
                .setFavoriteNumber(null)
                .build();

        // Serialize user1, user2 and user3 to disk
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        dataFileWriter.create(user1.getSchema(), new File("users-specific.avro"));
        dataFileWriter.append(user1);
        dataFileWriter.append(user2);
        dataFileWriter.append(user3);
        dataFileWriter.close();

        // We create a DatumWriter, which converts Java objects into an in-memory serialized format.
        // The SpecificDatumWriter class is used with generated classes
        // and extracts the schema from the specified generated type.
    }

    public static void deserialize() throws IOException {

        // Deserialize Users from disk
        DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(new File("users-specific.avro"), userDatumReader);
        User user = null;
        while (dataFileReader.hasNext()) {
            // Reuse user object by passing it to next(). This saves us from
            // allocating and garbage collecting many objects for files with
            // many items.
            user = dataFileReader.next(user);
            System.out.println(user);
        }

        // We create a SpecificDatumReader, analogous to the SpecificDatumWriter we used in serialization,
        // which converts in-memory serialized items into instances of our generated class, in this case User.
    }
}
