package ru.rosatom.pizzeria.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.OrderItem;

@UiController("pizzeria_OrderItem.browse")
@UiDescriptor("order-item-browse.xml")
@LookupComponent("orderItemsTable")
@LoadDataBeforeShow
public class OrderItemBrowse extends StandardLookup<OrderItem> {
}