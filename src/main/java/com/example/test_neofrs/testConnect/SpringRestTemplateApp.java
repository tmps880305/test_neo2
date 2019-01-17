package com.example.test_neofrs.testConnect;


import com.example.test_neofrs.Entity.Member;
import net.minidev.json.JSONObject;
//import org.json.JSONException;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@EnableAutoConfiguration
@Import(value = {RestTemplateConfig.class})
public class SpringRestTemplateApp {

    @Autowired
    RestTemplate restTemplate;

    /**********HTTP POST method**************/
    @RequestMapping("/post")
    public Object testPost() {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String url = "http://localhost:8775/getMember";
        JSONObject postData = new JSONObject();
        postData.put("Identify",new Member(1,"haha","bbbaaaa"));

        JSONObject json = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();

         System.out.println(json.toJSONString());
        return json.toJSONString();
    }
}
