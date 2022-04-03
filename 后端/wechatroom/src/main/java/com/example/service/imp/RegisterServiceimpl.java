package com.example.service.imp;

import com.example.mbg.mapper.RegisterMapper;
import com.example.mbg.model.Register;
import com.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceimpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public int insert(Register record) {
        int register = registerMapper.insert(record);
        if(register > 0){
            System.out.println("----------添加成功！");
        }
        return register;
    }

    @Override
    public Register selectTelPass( Integer registerCell, String registerPass) {
        Register register = registerMapper.selectTelPass(registerCell, registerPass);
        return register;
    }

}
