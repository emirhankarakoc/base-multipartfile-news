package com.testcase.news.controller;


import com.testcase.news.entities.Duyurular;
import com.testcase.news.entities.Haberler;
import com.testcase.news.repository.DuyuruRepository;
import com.testcase.news.repository.HaberRepository;
import com.testcase.news.requests.AddDuyuruRequest;
import com.testcase.news.requests.AddHaberRequest;
import jdk.jshell.spi.ExecutionControl;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api")

public class ApplicationController {
    private final HaberRepository haberRepository;
    private final DuyuruRepository duyuruRepository;
    @PostMapping("/haber")
    public Haberler addHaber(AddHaberRequest request){
        Haberler haber = new Haberler();
        haber.setIcerik(request.getIcerik());
        haber.setKonu(request.getKonu());
        haber.setGecerlilikTarihi(request.getGecerlilikTarihi());
        haber.setHaberLinki(request.getHaberLinki());
        haber.setId(UUID.randomUUID().toString());
        haberRepository.save(haber);
        return haber;

    }
    @PostMapping(value = "/duyuru", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Duyurular addDuyuru(AddDuyuruRequest request) {
        Duyurular duyuru = new Duyurular();
        duyuru.setIcerik(request.getIcerik());
        duyuru.setKonu(request.getKonu());
        duyuru.setGecerlilikTarihi(request.getGecerlilikTarihi());

        try {
            if(request.getMultipartFile().isEmpty()) {
                throw new RuntimeException("Empty file.");
            }
            Path destination = Paths.get("rootDir")
                    .resolve(request.getMultipartFile().getOriginalFilename())
                    .normalize().toAbsolutePath();


            Files.copy(request.getMultipartFile().getInputStream(), destination);
        } catch(IOException e) {
            throw new RuntimeException("Store exception");
        }

        duyuru.setFilePath("/rootDir/"+request.getMultipartFile().getOriginalFilename());

        duyuru.setId(UUID.randomUUID().toString());
        duyuruRepository.save(duyuru);
        return duyuru;

    }


}
