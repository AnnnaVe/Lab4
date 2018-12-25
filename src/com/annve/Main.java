package com.annve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {

        Weather weather = new Weather(1, 100, 1036.3, 5);
        Weather weather1 = new Weather(5, 50, 1054.1, 10);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            output.writeObject(weather);
            output.writeObject(weather1);

            Weather weather2 = (Weather) input.readObject();
            System.out.println(weather2);
            Weather weather3 = (Weather) input.readObject();
            System.out.println(weather3);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
