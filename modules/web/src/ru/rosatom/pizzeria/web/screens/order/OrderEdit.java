package ru.rosatom.pizzeria.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Order;

@UiController("pizzeria_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}