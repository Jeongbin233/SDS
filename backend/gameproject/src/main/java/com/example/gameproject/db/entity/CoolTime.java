package com.example.gameproject.db.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class CoolTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int turn;

    @ManyToOne
    private MyCharacter myCharacter;

    @ManyToOne
    private Skill skill;



}
