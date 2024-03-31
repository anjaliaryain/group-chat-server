package com.Companytask.groupChatServer.service;

import com.Companytask.groupChatServer.dto.MessageContentDTO;
import com.Companytask.groupChatServer.entity.Message;
import com.Companytask.groupChatServer.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public List<MessageContentDTO> getAllMessageContents() {
        return messageRepository.findAll().stream()
                .map(message -> new MessageContentDTO(message.getName(),message.getContent()))
                .collect(Collectors.toList());
    }
}
