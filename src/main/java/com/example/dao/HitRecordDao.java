package com.example.dao;

import com.example.Entity.Tblhitrecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface HitRecordDao extends JpaRepository<Tblhitrecords, Integer>, JpaSpecificationExecutor<Tblhitrecords> {
}
