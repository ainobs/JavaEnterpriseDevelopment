package com.dufuna.berlin.viktor.tax.controller;

import com.dufuna.berlin.viktor.tax.service.TaxCalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaxBracketController.class)
public class TaxBracketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TaxCalculatorService taxCalculatorService;

    @Test
    public void getAllTaxBracketsTest() throws Exception {
        mockMvc.perform(get("/api/tax/brackets"))
                .andExpect(status().isOk());
    }

    @Test
    public void getTaxBracketByIdTest() throws Exception {
        mockMvc.perform(get("/api/tax/bracket/1"))
                .andExpect(status().isOk());
    }

    @Test
    public void calculateTaxTest() throws Exception {
        mockMvc.perform(get("/api/tax/calculate?income=60000"))
                .andExpect(status().isOk());
    }
}
