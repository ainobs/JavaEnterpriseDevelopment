package com.dufuna.berlin.viktor.tax.repository;

import com.dufuna.berlin.viktor.tax.TaxBracket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
    List<TaxBracket> findAll();
}
