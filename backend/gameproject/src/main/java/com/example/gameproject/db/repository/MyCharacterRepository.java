package com.example.gameproject.db.repository;

import com.example.gameproject.db.entity.MyCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCharacterRepository extends JpaRepository<MyCharacter, Long> {

}

