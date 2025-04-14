package com.nextstep.stock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="stock_price")
@Table(name="stock_price",indexes = {
            @Index(name = "idx_price_volume_value", columnList = "closing_price, price_change_rate, trading_value")
        })
public class StockPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StockPriceId;

    @ManyToOne
    @JoinColumn(name = "short_code", nullable = false, columnDefinition = "varchar(15)") //길이 15, 빈칸 비 허용
    private StockInfo stockInfo;

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
