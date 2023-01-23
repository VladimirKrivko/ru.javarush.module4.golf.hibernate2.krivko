package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import ru.javarush.golf.entity.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
