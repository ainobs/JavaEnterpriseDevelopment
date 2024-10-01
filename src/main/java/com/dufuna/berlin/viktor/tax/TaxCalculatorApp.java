package com.dufuna.berlin.viktor.tax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping()
public class TaxCalculatorApp {

    public static void main(String[] args) {
        SpringApplication.run(TaxCalculatorApp.class, args);
    }
}
