package com.dufuna.berlin.viktor.tax.service;

import com.dufuna.berlin.viktor.tax.TaxBracket;
import com.dufuna.berlin.viktor.tax.repository.TaxBracketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assertions;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TaxCalculatorServiceImplTest {
    List<TaxBracket> taxBrackets;

    @Mock
    private TaxBracketRepository taxBracketRepository;

    @InjectMocks
    private TaxCalculatorServiceImplementation taxCalculationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks before each test
        taxBrackets = Arrays.asList(
                new TaxBracket(1L, 0, 18200, 0),
                new TaxBracket(2L, 18201, 45000, 0.19),
                new TaxBracket(3L, 45001, 120000, 0.325),
                new TaxBracket(4L, 120001, 180000, 0.37),
                new TaxBracket(5L, 180001, 9999999.00, 0.45));
        
    }

    @Test
    public void testCalculateTax() {
        Mockito.when(taxBracketRepository.findAll()).thenReturn(taxBrackets);
        double income = 50000;
        double calculatedTax = taxCalculationService.calculateTax(income);
        assertEquals(6716.485, calculatedTax, 0.001);
        double income2 = 120000;
        double calculatedTax2 = taxCalculationService.calculateTax(income2);
        assertEquals(29466.485, calculatedTax2, 0.001);
        double income3 = 10000;
        double calculatedTax3 = taxCalculationService.calculateTax(income3);
        assertEquals(0, calculatedTax3, 0.001);

    }

    @Test
    public void getAllTaxBracketTest() {
        Mockito.when(taxBracketRepository.findAll()).thenReturn(taxBrackets);
        List <TaxBracket> allTaxBracket = taxCalculationService.getAllTaxBracket();

        Assertions.assertThat(allTaxBracket).isNotNull();
        assertEquals(5, allTaxBracket.size());
    }

    @Test
    public void getTaxBracketByIdTest(){
        Long id = 3L;
        TaxBracket taxBracket = new TaxBracket(1L,0.0,18200,0.0);

        Mockito.when(taxBracketRepository.findById(id)).thenReturn(Optional.of(taxBracket));
        TaxBracket taxBracketById = taxCalculationService.getTaxBracketById(id);
        assertEquals(taxBracket, taxBracketById);
    }


}
