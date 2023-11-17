package com.vitthal.java.collection.mapdemo;

public class OSCheck {
    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            System.out.println("You are on Windows.");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            System.out.println("You are on Unix/Linux or macOS.");
        } else {
            System.out.println("Your operating system is not supported.");
        }
    }
}
