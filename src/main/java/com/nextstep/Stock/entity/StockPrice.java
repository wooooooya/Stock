package com.nextstep.Stock.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name="StockPrice")
@Table(name="stock_price")

public class StockPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StockPriceID;

    @Column(columnDefinition = "varchar(15) NOT NULL") //길이 15, 빈칸 비 허용
    private String ShortCode;

    @Column(nullable = false) // 빈칸 비 허용
    private int ClosingPrice;

    @Column(nullable = false) // 빈칸 비 허용
    private int PriceChange;

    @Column(nullable = false,  precision = 5, scale = 2) // decimal(5,2) 매핑, 빈칸 비 허용
    private BigDecimal PriceChangeRate;

    @Column(nullable = false) // 빈칸 비 허용
    private int OpeningPrice;

    @Column(nullable = false) // 빈칸 비 허용
    private int HighestPrice;

    @Column(nullable = false) // 빈칸 비 허용
    private int LowestPrice;

    @Column(nullable = false)
    private Long TradingVolume;

    @Column(nullable = false)
    private Long TradingValue;

    @Column(nullable = false)
    private Long MarketCap;

    @Column(nullable = false)
    private Long ListedStockNum;
}
