package ru.javarush.golf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    private final SessionFactory sessionFactory;

    public Main() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}