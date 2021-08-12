package ru.rosatom.pizzeria.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "PIZZERIA_ORDER")
@Entity(name = "pizzeria_Order")
@NamePattern("%s %s|number,createdDate")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 4083773869053112662L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    @PositiveOrZero
    private Long number;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;

    @NotNull
    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "order")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @NotNull
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "order")
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    private List<Payment> payments;

    @OneToOne(optional = false)
    @AssociationOverrides({
            @AssociationOverride(name = "courier", joinColumns = @JoinColumn(name = "DELIVER_COURIER_ID"))
    })
    private @Embedded
    @NotNull Delivery deliver;

    public void setDeliver(Delivery deliver) {
        this.deliver = deliver;
    }

    public Delivery getDeliver() {
        return deliver;
    }

    public StatusOrderEnum getStatus() {
        return status == null ? null : StatusOrderEnum.fromId(status);
    }

    public void setStatus(StatusOrderEnum status) {
        this.status = status == null ? null : status.getId();
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}