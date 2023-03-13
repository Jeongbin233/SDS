package com.example.gameproject.db.entity.Vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder // Setter 개념
@Getter // Getter
@NoArgsConstructor
public class CoolTimeVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int turn;

    @ManyToOne
    private MyCharacterVo myCharacter;

    @ManyToOne
    private SkillVo skill;



}
