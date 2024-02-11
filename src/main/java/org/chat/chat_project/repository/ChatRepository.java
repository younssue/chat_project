package org.chat.chat_project.repository;

import org.chat.chat_project.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat,Long> {
    List<Chat> findAllByRoomId(Long roomId);
}
