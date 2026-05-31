package utils;

public class RandomData {

    public static String getEmail() {

        return "test"
                + System.currentTimeMillis()
                + "@gmail.com";
    }
}