package com.example.service.imp;

import com.example.mbg.mapper.MessageListMapper;
import com.example.mbg.model.MessageList;
import com.example.mbg.model.MessageListExample;
import com.example.service.MessageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MessageListServiceimpl implements MessageListService {

    @Autowired
    private MessageListMapper messageListMapper;

    @Override
    public List<MessageList> selectByExample(MessageListExample example) {
        List<MessageList> messageLists = messageListMapper.selectByExample(example);
        return messageLists;
    }

}
