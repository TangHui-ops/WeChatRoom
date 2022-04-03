package com.example.controller;

import com.example.mbg.model.MessageList;
import com.example.mbg.model.MessageListExample;
import com.example.service.MessageListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/messagelist")
public class MessageListController {

    @Autowired
    private MessageListService messageListService;

    @GetMapping(value = "/messageLists")
    public List<MessageList> selectByExample(MessageListExample example) {
        Map map = new HashMap();
        List<MessageList> messageLists = messageListService.selectByExample(example);
        map.put("messageLists",messageLists);
        System.out.println(messageLists);
        return messageLists;
    }


}
