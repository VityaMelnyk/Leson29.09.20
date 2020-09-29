package com.company;

public class SemiLux implements IAccaunting {
    private String name;
    private String description;
    private int basePrice;
    private int breakfastPrice;
    private int lunchPrice;
    private int dinnerPrice;
    private int barPrice;
    private int poolPrice;
    private int seaViewBalconyPrice;
    private int tvPrice;
    private int premiumWifiPrice;

    public SemiLux() {
    }

    public SemiLux(String name, String description, int basePrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
    }

    public SemiLux(String name, String description, int basePrice, boolean allIncluded) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        if (allIncluded == true) {
            this.breakfastPrice = 50;
            this.lunchPrice = 30;
            this.dinnerPrice = 100;
            this.barPrice = 40;
            this.poolPrice = 60;
            this.seaViewBalconyPrice = 90;
            this.tvPrice = 35;
            this.premiumWifiPrice = 150;
        }
    }

    public SemiLux(String name, String description, int basePrice, int breakfastPrice, int lunchPrice,
                   int dinnerPrice, int barPrice, int poolPrice,
                   int seaViewBalconyPrice, int tvPrice, int premiumWifiPrice) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.breakfastPrice = breakfastPrice;
        this.lunchPrice = lunchPrice;
        this.dinnerPrice = dinnerPrice;
        this.barPrice = barPrice;
        this.poolPrice = poolPrice;
        this.seaViewBalconyPrice = seaViewBalconyPrice;
        this.tvPrice = tvPrice;
        this.premiumWifiPrice = premiumWifiPrice;
    }

    @Override
    public int getTotalSum() {
        return this.getBarPrice() + this.getBasePrice() + this.getBreakfastPrice() + this.getDinnerPrice()
                + this.getLunchPrice() + this.getBreakfastPrice() + this.getSeaViewBalconyPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBreakfastPrice() {
        return breakfastPrice;
    }

    public void setBreakfastPrice(int breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }

    public int getLunchPrice() {
        return lunchPrice;
    }

    public void setLunchPrice(int lunchPrice) {
        this.lunchPrice = lunchPrice;
    }

    public int getDinnerPrice() {
        return dinnerPrice;
    }

    public void setDinnerPrice(int dinnerPrice) {
        this.dinnerPrice = dinnerPrice;
    }

    public int getBarPrice() {
        return barPrice;
    }

    public void setBarPrice(int barPrice) {
        this.barPrice = barPrice;
    }

    public int getPoolPrice() {
        return poolPrice;
    }

    public void setPoolPrice(int poolPrice) {
        this.poolPrice = poolPrice;
    }

    public int getSeaViewBalconyPrice() {
        return seaViewBalconyPrice;
    }

    public void setSeaViewBalconyPrice(int seaViewBalconyPrice) {
        this.seaViewBalconyPrice = seaViewBalconyPrice;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public int getPremiumWifiPrice() {
        return premiumWifiPrice;
    }

    public void setPremiumWifiPrice(int premiumWifiPrice) {
        this.premiumWifiPrice = premiumWifiPrice;
    }

    @Override
    public String toString() {
        return "SemiLux{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", basePrice=" + basePrice +
                ", breakfastPrice=" + breakfastPrice +
                ", lunchPrice=" + lunchPrice +
                ", dinnerPrice=" + dinnerPrice +
                ", barPrice=" + barPrice +
                ", poolPrice=" + poolPrice +
                ", seaViewBalconyPrice=" + seaViewBalconyPrice +
                ", tvPrice=" + tvPrice +
                ", premiumWifiPrice=" + premiumWifiPrice +
                '}';
    }
}
