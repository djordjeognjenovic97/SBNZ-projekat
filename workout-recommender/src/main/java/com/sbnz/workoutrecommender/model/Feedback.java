package com.sbnz.workoutrecommender.model;

import javax.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private Rating rating;

    @OneToOne(mappedBy = "feedback", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Workout workout;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private RegisteredUser registeredUser;

    public Feedback() {
    }

    public Feedback(Long id, Rating rating, Workout workout, RegisteredUser registeredUser) {
        this.id = id;
        this.rating = rating;
        this.workout = workout;
        this.registeredUser = registeredUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }
}
