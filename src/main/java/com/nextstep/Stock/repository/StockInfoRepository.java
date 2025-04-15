package com.nextstep.stock.repository;

import com.nextstep.stock.entity.StockInfo;
import com.nextstep.stock.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoRepository extends JpaRepository<StockInfo, String> {
}
