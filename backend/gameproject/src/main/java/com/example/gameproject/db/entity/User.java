package com.example.gameproject.db.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.gameproject.dto.request.MapSaveRequest;

@Entity
@Getter
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String email;
    private int bestScore;
    private int stage;
    private int subStage;
    private int turn;
    private int finalScore; // 나중에 지울거 + maxStage, maxSubstage 있어야함.
    private int nowStage;
    private int nowSubStage;
    private int maxStage;
    private int maxSubStage;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MyCharacter> myCharacters = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserArtifact> userArtifacts = new ArrayList<>();

    public void gameOverUpdate(int bestScore){
        this.bestScore = bestScore;
        this.stage = 0;
        this.subStage = 0;
        this.turn = 0;
        this.finalScore = 0;
    }

    public void stageUpdate(int stage, int subStage) {
        this.stage = stage;
        this.subStage = subStage;
    }

    public void changeNowMap(MapSaveRequest mapSaveRequest){
        this.nowStage = mapSaveRequest.getNowStage();
        this.nowSubStage = mapSaveRequest.getNowSubStage();
    }

}
