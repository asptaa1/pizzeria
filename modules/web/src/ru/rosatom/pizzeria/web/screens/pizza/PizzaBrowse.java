package ru.rosatom.pizzeria.web.screens.pizza;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Pizza;

@UiController("pizzeria_Pizza.browse")
@UiDescriptor("pizza-browse.xml")
@LookupComponent("pizzasTable")
@LoadDataBeforeShow
public class PizzaBrowse extends StandardLookup<Pizza> {
}