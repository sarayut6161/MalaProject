package org.itsci.malaproject.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name = "beverage")
public class Beverage {
    @Id
    @Column(name = "BeverageID",nullable = false)
    private String BeverageID;
    @Column(name = "BeverageName")
    private String BeverageName;
    @Column(name = "Bprice")
    private int Bprice;

    public Beverage(String beverageID, String beverageName, int bprice) {
        BeverageID = beverageID;
        BeverageName = beverageName;
        Bprice = bprice;
    }

    public Beverage() {

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
