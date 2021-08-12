package ru.rosatom.pizzeria.web.screens.topping;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Topping;

@UiController("pizzeria_Topping.edit")
@UiDescriptor("topping-edit.xml")
@EditedEntityContainer("toppingDc")
@LoadDataBeforeShow
public class ToppingEdit extends StandardEditor<Topping> {
}