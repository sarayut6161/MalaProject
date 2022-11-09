package org.itsci.malaproject.dao;

import org.itsci.malaproject.model.Login;
import org.itsci.malaproject.model.Order;

public interface OrderDao {

    String SaveOrder (Order order);
    boolean loginUser (Login login);
}
