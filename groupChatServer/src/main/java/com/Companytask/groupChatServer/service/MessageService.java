package com.Companytask.groupChatServer.service;


import com.Companytask.groupChatServer.dto.MessageContentDTO;
import com.Companytask.groupChatServer.entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MessageService {
    Message createMessage(Message message);
    List<Message> getAllMessages();
    List<MessageContentDTO> getAllMessageContents();


}