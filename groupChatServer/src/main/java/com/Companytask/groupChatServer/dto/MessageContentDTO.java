package com.Companytask.groupChatServer.dto;

public class MessageContentDTO {
    private String username;
    private String content;


    public MessageContentDTO(String username, String content) {
        this.username = username;
        this.content = content;

    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
