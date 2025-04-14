package com.nextstep.stock.entity;

import com.nextstep.stock.entity.enumeration.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="stock_info")
@Table(name="stock_info")
public class StockInfo {

    @Id
    @Column(length = 15,nullable = false) //길이 15, 빈칸 비 허용
    private String ShortCode;

    @Column(length = 30,nullable = false) //길이 30, 빈칸 비 허용
    private String StandardCode;

    @Column(length = 50,nullable = false) //길이 50, 빈칸 비 허용
    private String KorStockName;

    @Column(length = 20,nullable = false) //길이 20, 빈칸 비 허용
    private String KorShortStockName;

    @Column(length = 100,nullable = false) //길이 100, 빈칸 비 허용
    private String EngStockName;

    @Temporal(TemporalType.DATE) // YYYY-MM-DD
    @Column(nullable = false) //빈칸 비 허용
    private Date ListingDate;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    @Column(nullable = false)
    private MarketType MarketType;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    @Column(nullable = false)
    private CertificateType CertificateType;

    @Column(length = 100,nullable = false) //길이 100, 빈칸 비 허용
    private String Department;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    @Column(nullable = false)
    private StockType StockType;

    @Column(nullable = false) //빈칸 비 허용
    private int FaceValue;

    @Column(nullable = false) //길이 20, 빈칸 비 허용
    private Long ListedStockNum;

    @OneToMany(mappedBy = "stockInfo", fetch = FetchType.LAZY) //바로 로딩이 필요하면 EAGER로 변경
    private List<StockPrice> stockPrices;
}
