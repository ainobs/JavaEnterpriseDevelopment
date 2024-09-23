package com.dufuna.berlin.viktor.tax.service;

import com.dufuna.berlin.viktor.tax.TaxBracket;

import java.util.List;

public interface TaxCalculatorService {
    List<TaxBracket> getAllTaxBracket();
    TaxBracket getTaxBracketById(Long id);
    double calculateTax(double income);
}
