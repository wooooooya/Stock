package com.nextstep.Stock.repository;

import com.nextstep.Stock.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoRepository extends JpaRepository<StockPrice, Long> {
    StockPrice findByShortCode(String shortCode);
}
