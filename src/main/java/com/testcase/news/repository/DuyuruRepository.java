package com.testcase.news.repository;

import com.testcase.news.entities.Duyurular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuyuruRepository extends JpaRepository<Duyurular,String> {
}
