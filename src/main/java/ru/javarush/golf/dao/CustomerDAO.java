package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import ru.javarush.golf.entity.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
