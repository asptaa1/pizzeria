package ru.rosatom.pizzeria.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Payment;

@UiController("pizzeria_Payment.edit")
@UiDescriptor("payment-edit.xml")
@EditedEntityContainer("paymentDc")
@LoadDataBeforeShow
public class PaymentEdit extends StandardEditor<Payment> {
}