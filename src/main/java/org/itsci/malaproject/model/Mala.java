package org.itsci.malaproject.model;
import java.util.*;
public class Mala {
    private String MalaID;
    private String Malaname;
    private int Mprice;

    public Mala(String malaID, String malaname, int mprice) {
        MalaID = malaID;
        Malaname = malaname;
        Mprice = mprice;
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
