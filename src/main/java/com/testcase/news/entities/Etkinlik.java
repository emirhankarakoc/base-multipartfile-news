package com.testcase.news.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@MappedSuperclass
@Data
public class Etkinlik {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String konu;
    private String icerik;
    @Column(name = "gecerlilik_tarihi")

    private LocalDate gecerlilikTarihi;
}
