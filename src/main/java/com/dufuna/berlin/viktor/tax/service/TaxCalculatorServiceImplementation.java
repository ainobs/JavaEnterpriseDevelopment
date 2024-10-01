package com.dufuna.berlin.viktor.tax.service;

import com.dufuna.berlin.viktor.tax.TaxBracket;
import com.dufuna.berlin.viktor.tax.repository.TaxBracketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxCalculatorServiceImplementation implements TaxCalculatorService {

    //@Autowired
    //private TaxBracketRepository taxBracketRepository;
    private final TaxBracketRepository taxBracketRepository;

    @Autowired
    public TaxCalculatorServiceImplementation(TaxBracketRepository taxBracketRepository) {
        this.taxBracketRepository = taxBracketRepository;
    }
    @Override
    public List<TaxBracket> getAllTaxBracket() {
        return taxBracketRepository.findAll();
    }
    @Override
    public TaxBracket getTaxBracketById(Long id) {
        Optional<TaxBracket> taxBracketOptional = taxBracketRepository.findById(id);
        if (taxBracketOptional.isPresent()) {
            return taxBracketOptional.get();
        }
        throw new RuntimeException(" TaxBracket is not found by id");
    }

    @Override
    public double calculateTax(double income) {
        List<TaxBracket> brackets = getAllTaxBracket();
        double tax = 0.0;
        for (TaxBracket bracket : brackets) {
            if (income > bracket.getLowerBound()) {
                double taxableIncome = Math.min(income, bracket.getUpperBound()) - bracket.getLowerBound();
                tax += taxableIncome * bracket.getRate();
            }
        }
        return tax;
    }
}
