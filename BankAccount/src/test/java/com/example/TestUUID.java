package com.example;
import java.util.UUID;
public class TestUUID {
    public static void main(String[] args) {
        System.out.println(generateString());
    }

    public static String generateString() {
        String uuid = UUID.randomUUID().toString().replace("-","");
        return "uuid = " + uuid;
    }
}
