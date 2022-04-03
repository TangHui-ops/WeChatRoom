package com.example.service;

import com.example.mbg.model.MessageList;
import com.example.mbg.model.MessageListExample;

import java.util.List;

public interface MessageListService {

    //查询所有消息列表信息
    List<MessageList> selectByExample(MessageListExample example);

}
