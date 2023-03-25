package org.example.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties pro;

    static {
        try {
            String path = System.getProperty("user.dir") + "/configuration.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            pro = new Properties();
            pro.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return pro.getProperty(key);
    }
}
