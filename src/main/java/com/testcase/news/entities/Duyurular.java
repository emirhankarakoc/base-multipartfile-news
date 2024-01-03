package com.testcase.news.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Entity@Data
public class Duyurular extends Etkinlik{
   private String filePath;
}
