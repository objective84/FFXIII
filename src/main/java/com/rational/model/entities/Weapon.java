package com.rational.model.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("W")
public class Weapon extends Item{

    @Column(name="weapon_strength_min") private int strengthMin;
    @Column(name="weapon_strength_max") private int strengthMax;
    @Column(name="weapon_strength_increment") private int strengthIncrement;
    @Column(name="weapon_magic_min") private int magicMin;
    @Column(name="weapon_magic_max") private int magicMax;
    @Column(name="weapon_magic_increment") private int magicIncrement;
    @Column(name="weapon_character") private String character;

    public int getStrengthMin() {
        return strengthMin;
    }

    public void setStrengthMin(int strengthMin) {
        this.strengthMin = strengthMin;
    }

    public int getStrengthMax() {
        return strengthMax;
    }

    public void setStrengthMax(int strengthMax) {
        this.strengthMax = strengthMax;
    }

    public int getStrengthIncrement() {
        return strengthIncrement;
    }

    public void setStrengthIncrement(int strengthIncrement) {
        this.strengthIncrement = strengthIncrement;
    }

    public int getMagicMin() {
        return magicMin;
    }

    public void setMagicMin(int magicMin) {
        this.magicMin = magicMin;
    }

    public int getMagicMax() {
        return magicMax;
    }

    public void setMagicMax(int magicMax) {
        this.magicMax = magicMax;
    }

    public int getMagicIncrement() {
        return magicIncrement;
    }

    public void setMagicIncrement(int magicIncrement) {
        this.magicIncrement = magicIncrement;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
