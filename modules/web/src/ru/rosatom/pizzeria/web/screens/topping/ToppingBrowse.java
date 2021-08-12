package ru.rosatom.pizzeria.web.screens.topping;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Topping;

@UiController("pizzeria_Topping.browse")
@UiDescriptor("topping-browse.xml")
@LookupComponent("toppingsTable")
@LoadDataBeforeShow
public class ToppingBrowse extends StandardLookup<Topping> {
}