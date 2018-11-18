package com.alan.controller;

import java.util.List;
import java.util.Map;
import com.alan.entity.MtoUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MtoUsersController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/mtousrs")
    private List<Map<String,Object>> MtoUsersList(){
        String sql = "select * from mto_users";
        List<Map<String,Object>> list
                =jdbcTemplate.queryForList(sql);
        return list;
    }
}
