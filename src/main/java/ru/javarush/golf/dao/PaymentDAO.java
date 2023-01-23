package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import ru.javarush.golf.entity.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
