package com.testcase.news.requests;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AddHaberRequest {
    private String konu;
    private String icerik;
    private String haberLinki;
    private LocalDate gecerlilikTarihi;
}
