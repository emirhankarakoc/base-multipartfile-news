package com.testcase.news.requests;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class AddDuyuruRequest {
    private String konu;
    private String icerik;
    private LocalDate gecerlilikTarihi;
    private MultipartFile multipartFile;

}
