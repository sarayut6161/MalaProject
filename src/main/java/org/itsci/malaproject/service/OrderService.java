package org.itsci.malaproject.service;


import org.itsci.malaproject.model.Login;
import org.itsci.malaproject.model.Order;
import org.itsci.malaproject.model.User;

public interface OrderService {
    public String saveProduct(Order order);

    public boolean loginUser(Login user);
}
