package org.itsci.malaproject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.itsci.malaproject.model.Login;
import org.itsci.malaproject.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class OrderDaolmpl implements OrderDao {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public String SaveOrder(Order order) {
        System.out.println("POO");
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(order);
        return "Y";
    }

    @Override
    public boolean loginUser(Login login) {
        System.out.println("1");
        Session session = sessionFactory.getCurrentSession();
        Query<Login> query = session.createQuery("select Username,Password from Login where Username=:user and Password=:pass");
//
        query.setParameter("user", login.getUsername());
        query.setParameter("pass", login.getPassword());
        List<Login> logins = query.getResultList();
        System.out.println("2");
        System.out.println(logins.size() + "logins.size()");

//        if (logins.size() == 1) {
//            return true;
//        } else {
//            return false;
//        }
        return logins.size() == 1;
     }
}
