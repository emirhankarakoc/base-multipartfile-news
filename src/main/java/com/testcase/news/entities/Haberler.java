package com.testcase.news.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Haberler extends Etkinlik{
    private String haberLinki;

}
