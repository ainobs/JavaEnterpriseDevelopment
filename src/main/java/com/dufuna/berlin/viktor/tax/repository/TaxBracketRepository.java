package com.dufuna.berlin.viktor.tax.repository;

import com.dufuna.berlin.viktor.tax.TaxBracket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
    List<TaxBracket> findAll();
}
