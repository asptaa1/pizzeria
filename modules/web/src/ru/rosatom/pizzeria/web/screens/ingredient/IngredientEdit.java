package ru.rosatom.pizzeria.web.screens.ingredient;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Ingredient;

@UiController("pizzeria_Ingredient.edit")
@UiDescriptor("ingredient-edit.xml")
@EditedEntityContainer("ingredientDc")
@LoadDataBeforeShow
public class IngredientEdit extends StandardEditor<Ingredient> {
}