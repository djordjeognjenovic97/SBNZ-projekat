package com.sbnz.workoutrecommender.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Admin extends User{

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Equipment> equipments;

    public Admin() {
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }
}
