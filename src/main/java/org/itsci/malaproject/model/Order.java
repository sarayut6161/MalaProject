package org.itsci.malaproject.model;
import java.util.*;
public class Order {
    private int OrderID;
    private int Table;
    private String Type;
    private int Total;

    public Order(int orderID, int table, String type, int total) {
        OrderID = orderID;
        Table = table;
        Type = type;
        Total = total;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getTable() {
        return Table;
    }

    public void setTable(int table) {
        Table = table;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }
}
