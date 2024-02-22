package org.frank.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. This application is going to transfer number from 0 to 999999999999.99 
 * */
@SpringBootApplication
public class ConversionApp {
    public static void main(String[] args) {
        SpringApplication.run(ConversionApp.class, args);
    }
}
