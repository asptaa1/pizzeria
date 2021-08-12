package ru.rosatom.pizzeria.web.screens.pizza;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Pizza;

@UiController("pizzeria_Pizza.edit")
@UiDescriptor("pizza-edit.xml")
@EditedEntityContainer("pizzaDc")
@LoadDataBeforeShow
public class PizzaEdit extends StandardEditor<Pizza> {
}