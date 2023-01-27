package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.javarush.golf.entity.City;

public class CityDAO extends GenericDAO<City> {
    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(final String cityName) {
        Query<City> query = getCurrentSession().createQuery("from City where name = :NAME", City.class); // select c from City c where c.name = :NAME ?
        query.setParameter("NAME", cityName);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
