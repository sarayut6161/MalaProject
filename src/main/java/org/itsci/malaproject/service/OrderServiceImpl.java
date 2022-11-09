package org.itsci.malaproject.service;

import org.itsci.malaproject.dao.OrderDao;
import org.itsci.malaproject.model.Login;
import org.itsci.malaproject.model.Order;
import org.itsci.malaproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderDao oderdao;

    @Override
    @Transactional
    public String saveProduct(Order order) {
        String result = oderdao.SaveOrder(order);
        return result;
    }

    @Override
    @Transactional
    public boolean loginUser(Login user) {
        boolean result = oderdao.loginUser(user);
        return result;
    }
}
