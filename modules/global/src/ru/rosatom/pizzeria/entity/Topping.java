package ru.rosatom.pizzeria.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZERIA_TOPPING")
@Entity(name = "pizzeria_Topping")
@NamePattern("%s|name")
public class Topping extends StandardEntity {
    private static final long serialVersionUID = 2602466030984629600L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @NotNull
    @Column(name = "SPICY", nullable = false)
    private Boolean spicy = false;

    public Boolean getSpicy() {
        return spicy;
    }

    public void setSpicy(Boolean spicy) {
        this.spicy = spicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}