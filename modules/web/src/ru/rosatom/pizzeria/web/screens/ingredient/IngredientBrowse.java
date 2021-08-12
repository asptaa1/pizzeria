package ru.rosatom.pizzeria.web.screens.ingredient;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Ingredient;

@UiController("pizzeria_Ingredient.browse")
@UiDescriptor("ingredient-browse.xml")
@LookupComponent("ingredientsTable")
@LoadDataBeforeShow
public class IngredientBrowse extends StandardLookup<Ingredient> {
}