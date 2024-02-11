package org.chat.chat_project.repository;

import org.chat.chat_project.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
