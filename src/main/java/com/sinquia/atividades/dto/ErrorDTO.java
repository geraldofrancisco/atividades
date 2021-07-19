package com.sinquia.atividades.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorDTO {
    private String userMessage;
    private LocalDateTime timestamp;

    public ErrorDTO(String userMessage) {
        this.userMessage = userMessage;
        this.timestamp = LocalDateTime.now();
    }
}
