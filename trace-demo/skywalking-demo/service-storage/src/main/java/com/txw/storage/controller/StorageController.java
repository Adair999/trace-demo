package com.txw.storage.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StorageController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/storage", method = RequestMethod.GET)
    public String storage() {
        try {
            jdbcTemplate.update(
                    "update t_storage set count = count - ? where commodity_code = ?",
                    new Object[]{1, "C00321"});
            return "storage success";
        } catch (Exception e) {
            e.printStackTrace();
            return "storage fail";
        }
    }


}
