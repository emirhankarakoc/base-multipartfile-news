package com.testcase.news.repository;

import com.testcase.news.entities.Haberler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HaberRepository extends JpaRepository<Haberler,String> {
}
