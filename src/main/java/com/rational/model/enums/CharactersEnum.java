package com.rational.model.enums;

import java.util.Arrays;
import java.util.List;

public enum CharactersEnum {
    LIGHTNING("Lightning"),
    SAHZ("Sahz"),
    HOPE("Hope"),
    VANILLE("Vanille"),
    FANG("Fang"),
    SNOW("Snow");

    private String name;

    private CharactersEnum(String type) {
        this.name = type;
    }


    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getValues() {
        return Arrays.asList(LIGHTNING.name, SAHZ.name, HOPE.name, VANILLE.name, FANG.name, SNOW.name);
    }

}
