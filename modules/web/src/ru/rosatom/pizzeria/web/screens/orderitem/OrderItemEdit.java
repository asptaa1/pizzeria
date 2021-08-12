package ru.rosatom.pizzeria.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.OrderItem;

@UiController("pizzeria_OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {
}