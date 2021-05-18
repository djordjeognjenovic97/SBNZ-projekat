package com.sbnz.workoutrecommender.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Equipment equipment;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<MuscleGroup> targetedMuscles;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String description;

    @Enumerated(EnumType.ORDINAL)
    private ExerciseDifficultyLevel exerciseDifficultyLevel;

    public Exercise() {
    }

    public Exercise(Long id, Equipment equipment, List<MuscleGroup> targetedMuscles, String name, String description, ExerciseDifficultyLevel exerciseDifficultyLevel) {
        this.id = id;
        this.equipment = equipment;
        this.targetedMuscles = targetedMuscles;
        this.name = name;
        this.description = description;
        this.exerciseDifficultyLevel = exerciseDifficultyLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public List<MuscleGroup> getTargetedMuscles() {
        return targetedMuscles;
    }

    public void setTargetedMuscles(List<MuscleGroup> targetedMuscles) {
        this.targetedMuscles = targetedMuscles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExerciseDifficultyLevel getExerciseDifficultyLevel() {
        return exerciseDifficultyLevel;
    }

    public void setExerciseDifficultyLevel(ExerciseDifficultyLevel exerciseDifficultyLevel) {
        this.exerciseDifficultyLevel = exerciseDifficultyLevel;
    }
}
