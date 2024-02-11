package org.chat.chat_project.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;
    private String name;

    @Builder
    public Room(String name) {
        this.name = name;
    }

    /**
     * 채팅방 생성
     * @param name 방 이름
     * @return Room Entity
     */


    public static Room createRoom(String name) {
        return Room.builder()
                   .name(name)
                   .build();
    }
}
