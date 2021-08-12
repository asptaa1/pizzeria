package ru.rosatom.pizzeria.web.screens.payment;

import com.haulmont.cuba.gui.screen.*;
import ru.rosatom.pizzeria.entity.Payment;

@UiController("pizzeria_Payment.browse")
@UiDescriptor("payment-browse.xml")
@LookupComponent("paymentsTable")
@LoadDataBeforeShow
public class PaymentBrowse extends StandardLookup<Payment> {
}