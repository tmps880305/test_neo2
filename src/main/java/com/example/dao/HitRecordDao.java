package com.example.dao;

import com.example.Entity.HitRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HitRecordDao extends JpaRepository<HitRecord, String>, JpaSpecificationExecutor<HitRecord> {
    List<HitRecord> findAllById(Integer id);
}
