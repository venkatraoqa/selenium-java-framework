package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Configreader {

    Properties prop;

    public Configreader() {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return prop.getProperty("url");
    }
}