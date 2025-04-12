package com.nextstep.Stock.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity(name="StockInfo")
@Table(name="stock_info")
public class StockInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 기본키를 생성
    @Column(columnDefinition = "varchar(15) NOT NULL") //길이 15, 빈칸 비 허용
    private String ShortCode;

    @Column(columnDefinition = "varchar(30) NOT NULL") //길이 30, 빈칸 비 허용
    private String StandardCode;

    @Column(columnDefinition = "varchar(50) NOT NULL") //길이 50, 빈칸 비 허용
    private String KorStockName;

    @Column(columnDefinition = "varchar(20) NOT NULL") //길이 20, 빈칸 비 허용
    private String KorShortStockName;

    @Column(columnDefinition = "varchar(100) NOT NULL") //길이 100, 빈칸 비 허용
    private String EngStockName;

    @Temporal(TemporalType.TIMESTAMP) // YYYY-MM-DD HH : MM : SS
    @Column(nullable = false) //빈칸 비 허용
    private Date ListingDate;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    private String MarketType;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    private String CertificateType;

    @Column(columnDefinition = "varchar(100) NOT NULL") //길이 100, 빈칸 비 허용
    private String Department;

    @Enumerated(EnumType.STRING) // enum 타입 사용 선언
    private String StockType;

    @Column(nullable = false) //빈칸 비 허용
    private int FaceValue;

    @Column(columnDefinition = "bigint(20) NOT NULL") //길이 20, 빈칸 비 허용
    private Long ListedStockNum;
}
