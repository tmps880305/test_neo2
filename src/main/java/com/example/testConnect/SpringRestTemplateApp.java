package com.example.testConnect;

import com.example.testConnect.RestTemplateConfig;
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


}
