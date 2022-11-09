package org.itsci.malaproject.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mala")
public class Mala {
    @Id
    @Column(name = "MalaID",nullable = false)
    private String MalaID;
    @Column(name = "Malaname",nullable = false)
    private String Malaname;
    @Column(name = "Mprice",nullable = false)
    private int Mprice;

    public Mala(String malaID, String malaname, int mprice) {
        MalaID = malaID;
        Malaname = malaname;
        Mprice = mprice;
    }

    public Mala() {

    }

    public String getMalaID() {
        return MalaID;
    }

    public void setMalaID(String malaID) {
        MalaID = malaID;
    }

    public String getMalaname() {
        return Malaname;
    }

    public void setMalaname(String malaname) {
        Malaname = malaname;
    }

    public int getMprice() {
        return Mprice;
    }

    public void setMprice(int mprice) {
        Mprice = mprice;
    }
}
