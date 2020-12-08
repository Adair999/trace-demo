package com.txw.order.controller;

import com.txw.order.feign.FeignStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@Slf4j
@RestController
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private FeignStorageService storageService;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String order() {
        //String result = restTemplate.getForEntity("http://service-storage/storage", String.class).getBody();
        String result = storageService.storage();
        log.info("扣减库存结果：" + result);
        String sql = "insert into t_order1(user_id,commodity_code,count,money) values('U100001','C00321',2,4)";
        jdbcTemplate.update(sql);
        return "order success";
    }
    @RequestMapping(value = "/hello/test", method = RequestMethod.GET)
    public String hello() {
        String result = storageService.storage();
        log.info("扣减库存结果：" + result);
        return "hello";
    }
}