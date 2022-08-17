package com.org.tav.day6;

import java.lang.module.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.SessionFactory;

public class HibernateUtil {
 
    private HibernateUtil() {

    }

    private static SessionFactory sessionFactory;

    public static synchronized SessionFactory getInstnce() {
        if(sessionFactory ==null) {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//
//            sessionFactory = configuration.
            ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration)
        }

        return sessionFactory;
    }
}