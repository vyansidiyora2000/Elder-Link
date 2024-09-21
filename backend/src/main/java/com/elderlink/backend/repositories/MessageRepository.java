package com.elderlink.backend.repositories;

import com.elderlink.backend.domains.entities.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity,Long>{

    List<MessageEntity> findBySenderIdAndReceiverId(Long senderId, Long receiverId);

}
