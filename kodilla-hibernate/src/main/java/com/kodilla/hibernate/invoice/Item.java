package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private Product product;
    private Invoice invoice;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    public Item() {
    }

    public Item(BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ITEM_NAME")
    public int getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn (name = "PRODUCTLIST_ID")
    public Product getProduct() {
        return product;
    }

    @ManyToOne
    @JoinColumn (name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Column(name = "ITEM_PRICE")
    @NotNull
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "ITEM_QUANTITY")
    @NotNull
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "ITEM_VALUE")
    @NotNull
    public BigDecimal getValue() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setValue(BigDecimal value) {
        this.value = value;
    }
}
