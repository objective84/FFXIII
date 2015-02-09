package com.rational.model.entities;

import javax.persistence.*;

@Entity
public class Catalyst {

    @Id @Column(name="catalyst_id") private int id;
    @Column(name="catalyst_name") private String name;
    @Column(name="catalyst_shop") private String shop;
    @Column(name="catalyst_buy_price") private int buyPrice;
    @Column(name="catalyst_sell_price") private int sellPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
