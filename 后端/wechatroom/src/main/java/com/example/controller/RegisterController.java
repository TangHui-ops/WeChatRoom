package com.example.controller;

import com.example.mbg.model.Register;
import com.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    //添加注册
    @PostMapping(value = "/addregister")
    public int insert(@RequestBody Register record) {
        int register = registerService.insert(record);
        if (register > 0){
            return 1;
        }else {
            return 0;
        }
    }

    //登录
    @PostMapping(value = "/loginForm")
    public Register selectTelPass(Integer registerCell, String registerPass){
        System.out.println ( "用户名:" + registerCell + "密码:" + registerPass );
        Register registerlist = registerService.selectTelPass(registerCell, registerPass);
        System.out.println(registerlist);
        return registerlist;
    }

}
