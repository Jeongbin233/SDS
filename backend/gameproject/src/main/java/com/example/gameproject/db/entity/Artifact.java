package com.example.gameproject.db.entity;

import com.example.gameproject.db.entity.Vo.ArtifactVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Artifact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean isRange;
    private int targetClass;
    private String stat;
    private int value;

    @OneToMany
    private List<UserArtifact> userArtifacts = new ArrayList<>();

    public Artifact(ArtifactVo artifactVo){
        this.id = artifactVo.getId();
        this.name = artifactVo.getName();
    }
}
