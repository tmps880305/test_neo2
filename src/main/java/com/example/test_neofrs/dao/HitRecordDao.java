package com.example.test_neofrs.dao;

import com.example.test_neofrs.Entity.HitRecord;
import com.example.test_neofrs.dto.HitRecordDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HitRecordDao extends JpaRepository<HitRecordDto, String>, JpaSpecificationExecutor<HitRecordDto> {
    List<HitRecord> findAllById(Integer id);
}
