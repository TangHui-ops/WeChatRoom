package com.example.service;

import com.example.mbg.model.Register;

public interface RegisterService {

    int insert(Register record);

    Register selectTelPass(Integer registerCell, String registerPass);

}
