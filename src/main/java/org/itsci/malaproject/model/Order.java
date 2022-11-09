package org.itsci.malaproject.model;
import java.util.*;
import javax.persistence.*;

@Entity
@Table (name= "OrderProduct")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idorder", nullable = false)
    private Integer idorder;

    @Column(name = "tableOrder", nullable = false)
    private Integer tableOrder;
    @Column(name = "total", nullable = false)
    private Integer total;

    @Column(name = "totalMala", nullable = false)
    private Integer totalMala;

    @Column(name = "totalBeverage", nullable = false)
    private Integer totalBeverage;

    public Order(Integer idorder, Integer tableOrder, Integer total, Mala mala, Beverage beverage) {
        this.idorder = idorder;
        this.tableOrder = tableOrder;
        this.total = total;

    }

    public Order() {

    }

    public Integer getId() {
        return idorder;
    }

    public void setId(Integer id) {
        this.idorder = id;
    }

    public Integer getIdorder() {
        return idorder;
    }

    public void setIdorder(Integer idorder) {
        this.idorder = idorder;
    }

    public Integer getTableOrder() {
        return tableOrder;
    }

    public void setTableOrder(Integer tableOrder) {
        this.tableOrder = tableOrder;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setTotalMala(Integer totalMala) {
        this.totalMala = totalMala;
    }

    public Integer getTotalBeverage() {
        return totalBeverage;
    }

    public void setTotalBeverage(Integer totalBeverage) {
        this.totalBeverage = totalBeverage;
    }

    public Integer getTotalMala() {
        return totalMala;
    }
}
