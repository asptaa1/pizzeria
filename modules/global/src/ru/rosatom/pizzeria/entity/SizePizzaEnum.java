package ru.rosatom.pizzeria.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SizePizzaEnum implements EnumClass<String> {

    SMALL("A"),
    MEDIUM("B"),
    BIG("C");

    private String id;

    SizePizzaEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SizePizzaEnum fromId(String id) {
        for (SizePizzaEnum at : SizePizzaEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}