package com.example.api;

import com.example.Entity.Tblhitrecords;
import com.example.dao.HitRecordDao;
import com.example.testConnect.RestTemplateConfig;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@EnableAutoConfiguration
@Import(value = {RestTemplateConfig.class})
@CrossOrigin(origins = "*")
public class RecordAjaxApi {

    @Autowired
    private HitRecordDao hitRecordDao;
    @Autowired
    RestTemplate restTemplate;

    //get hitRecord from db, show in console log
    @RequestMapping(value = "/hitRecord", method = RequestMethod.GET)
    public List<Tblhitrecords> hitRecord() {
        List<Tblhitrecords> hitRecords = new ArrayList<Tblhitrecords>();
        hitRecords = hitRecordDao.findAll();
        System.out.println(hitRecords);
        return hitRecords;
    }

    //post hitRecords data to 8775/getMember, and show on system out
    @RequestMapping("/post")
    public Object testPost() {
        List<Tblhitrecords> hitRecords = new ArrayList<Tblhitrecords>();
        hitRecords = hitRecordDao.findAll();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        //send json to url
        String url = "http://localhost:8775/getMember";
        JSONObject json = restTemplate.postForEntity(url, hitRecords, JSONObject.class).getBody();

        return hitRecords;
    }
}

