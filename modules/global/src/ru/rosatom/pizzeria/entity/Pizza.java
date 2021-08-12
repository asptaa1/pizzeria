package ru.rosatom.pizzeria.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "PIZZERIA_PIZZA")
@Entity(name = "pizzeria_Pizza")
@NamePattern("%s|name")
public class Pizza extends StandardEntity {
    private static final long serialVersionUID = 3863615611333939429L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "CALORIES")
    @DecimalMin("0")
    private BigDecimal calories;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    @DecimalMin("0")
    private BigDecimal price;

    @NotNull
    @Column(name = "SIZE_", nullable = false)
    private String size;

    @Column(name = "DESCRIPTION", length = 1024)
    private String description;

    @OneToMany(mappedBy = "pizza")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    private List<Ingredient> ingredients;

    public SizePizzaEnum getSize() {
        return size == null ? null : SizePizzaEnum.fromId(size);
    }

    public void setSize(SizePizzaEnum size) {
        this.size = size == null ? null : size.getId();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCalories() {
        return calories;
    }

    public void setCalories(BigDecimal calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}