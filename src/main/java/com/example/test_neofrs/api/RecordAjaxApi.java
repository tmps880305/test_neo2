package com.example.test_neofrs.api;

import com.example.test_neofrs.Entity.HitRecord;
import com.example.test_neofrs.dao.HitRecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
public class RecordAjaxApi {

    @Autowired
    HitRecordDao hitRecordDao;

    @RequestMapping(value = "record/getHitRecordAjax", method = RequestMethod.POST)
    public List<HitRecord> getHitRecordAjax(@RequestBody Integer id) {
        List<HitRecord> hitRecords = hitRecordDao.findAllById(id);

        System.out.println(hitRecords);
        return hitRecords;
    }


}
