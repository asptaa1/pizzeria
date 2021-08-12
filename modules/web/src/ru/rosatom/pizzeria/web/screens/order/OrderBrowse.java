package ru.rosatom.pizzeria.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Order;

@UiController("pizzeria_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}