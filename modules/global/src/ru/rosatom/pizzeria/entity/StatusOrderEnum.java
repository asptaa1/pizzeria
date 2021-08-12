package ru.rosatom.pizzeria.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum StatusOrderEnum implements EnumClass<String> {

    CREATED("A"),
    PAID("B"),
    PREPARING("C"),
    READY("D"),
    DELIVERY("E"),
    DELIVERED("F"),
    CANCELED("G");

    private String id;

    StatusOrderEnum(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static StatusOrderEnum fromId(String id) {
        for (StatusOrderEnum at : StatusOrderEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}