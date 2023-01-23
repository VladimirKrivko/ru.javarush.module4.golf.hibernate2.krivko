package ru.javarush.golf.dao;

import org.hibernate.SessionFactory;
import ru.javarush.golf.entity.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
