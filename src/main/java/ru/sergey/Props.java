package ru.sergey;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class Props {
    private final Properties properties = new Properties();
    private static Props INSTANCE;

    private Props() {
        try {
            properties.load(Files.newInputStream(new File("./application.properties").toPath()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Props getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Props();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
