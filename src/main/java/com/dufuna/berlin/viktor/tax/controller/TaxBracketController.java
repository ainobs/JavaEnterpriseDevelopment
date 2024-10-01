package com.dufuna.berlin.viktor.tax.controller;

import com.dufuna.berlin.viktor.tax.TaxBracket;
import com.dufuna.berlin.viktor.tax.service.TaxCalculatorService;
import com.dufuna.berlin.viktor.tax.service.TaxCalculatorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tax")
public class TaxBracketController {
    //@Autowired
    //private TaxCalculatorServiceImplementation taxCalculatorService;
    private final TaxCalculatorServiceImplementation taxCalculatorService;

    @Autowired
    public TaxBracketController(TaxCalculatorServiceImplementation taxCalculatorService) {
        this.taxCalculatorService = taxCalculatorService;
    }

    //get all tax brackets
    @GetMapping("/brackets")
    public ResponseEntity<List<TaxBracket>> getAllTaxBrackets() {
        List<TaxBracket> taxBrackets = taxCalculatorService.getAllTaxBracket();
        return ResponseEntity.ok(taxBrackets);
    }

    //get tax bracket by ID
    @GetMapping("/brackets/{id}")
    public ResponseEntity<TaxBracket> getTaxBracketById(@PathVariable("id") long id) {
        TaxBracket taxBracket = taxCalculatorService.getTaxBracketById(id);
        return taxBracket != null ? ResponseEntity.ok(taxBracket) : ResponseEntity.notFound().build();
    }

    //calculate tax by income
    @GetMapping("/calculate")
    public ResponseEntity<Double> calculateTax(@RequestParam("income") double income) {
        Double tax = taxCalculatorService.calculateTax(income);
        return ResponseEntity.ok(tax);
    }

}
