package com.rational.model.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {

    @Id @Column(name="item_id") private int id;
    @Column(name="item_name") private String name;
    @Column(name="item_min_level") private int minLevel;
    @Column(name="item_max_level") private int maxLevel;
    @Column(name="item_base_xp") private int baseXP;
    @Column(name="item_incremental_xp") private int incrementalXP;
    @Column(name="item_xp_offset") private int xpOffset;
    @Column(name="item_catalyst") @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) private Catalyst catalyst;
    @Column(name="item_special_property") private String specialProperty;
    @Column(name="item_synthesis_group") private String synthesisGroup;
    @Column(name="item_shop") private String shop;
    @Column(name="item_buy_price") private int buyPrice;
    @Column(name="item_sell_price") private int sellPrice;
    @Column(name="item_item_group") private String itemGroup;
    @Column(name="item_upgrade") @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) private Item upgrade;

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

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getBaseXP() {
        return baseXP;
    }

    public void setBaseXP(int baseXP) {
        this.baseXP = baseXP;
    }

    public int getIncrementalXP() {
        return incrementalXP;
    }

    public void setIncrementalXP(int incrementalXP) {
        this.incrementalXP = incrementalXP;
    }

    public int getXpOffset() {
        return xpOffset;
    }

    public void setXpOffset(int xpOffset) {
        this.xpOffset = xpOffset;
    }

    public Catalyst getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Catalyst catalyst) {
        this.catalyst = catalyst;
    }

    public String getSpecialProperty() {
        return specialProperty;
    }

    public void setSpecialProperty(String specialProperty) {
        this.specialProperty = specialProperty;
    }

    public String getSynthesisGroup() {
        return synthesisGroup;
    }

    public void setSynthesisGroup(String synthesisGroup) {
        this.synthesisGroup = synthesisGroup;
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

    public Item getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(Item upgrade) {
        this.upgrade = upgrade;
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }
}
