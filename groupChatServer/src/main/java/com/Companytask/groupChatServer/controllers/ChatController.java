package com.Companytask.groupChatServer.controllers;

import com.Companytask.groupChatServer.dto.MessageContentDTO;
import com.Companytask.groupChatServer.entity.Message;
import com.Companytask.groupChatServer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {
    @Autowired
    private MessageService messageService;


    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        Message createdMessage = messageService.createMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMessage);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MessageContentDTO>> getAllMessageContents() {
        List<MessageContentDTO> messageContents = messageService.getAllMessageContents();
        return ResponseEntity.ok(messageContents);
    }

}









