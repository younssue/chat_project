package org.chat.chat_project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.chat.chat_project.domain.Chat;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    private Long roomId;
    private String sender;
    private String message;
    private LocalDateTime sendDate;

}
