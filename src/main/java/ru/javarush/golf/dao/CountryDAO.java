package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import ru.javarush.golf.entity.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
