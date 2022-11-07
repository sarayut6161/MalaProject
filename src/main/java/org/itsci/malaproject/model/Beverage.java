package org.itsci.malaproject.model;
import java.util.*;
public class Beverage {
    private String BeverageID;
    private String BeverageName;
    private int Bprice;

    public Beverage(String beverageID, String beverageName, int bprice) {
        BeverageID = beverageID;
        BeverageName = beverageName;
        Bprice = bprice;
    }

    public String getBeverageID() {
        return BeverageID;
    }

    public void setBeverageID(String beverageID) {
        BeverageID = beverageID;
    }

    public String getBeverageName() {
        return BeverageName;
    }

    public void setBeverageName(String beverageName) {
        BeverageName = beverageName;
    }

    public int getBprice() {
        return Bprice;
    }

    public void setBprice(int bprice) {
        Bprice = bprice;
    }
}
