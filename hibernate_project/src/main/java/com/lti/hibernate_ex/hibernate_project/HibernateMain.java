package com.lti.hibernate_ex.hibernate_project;

import javax.security.auth.login.AppConfigurationEntry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class HibernateMain
{
    public static void main( String[] args )
    {
        Configuration conf=new Configuration().configure();
        StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
        SessionFactory fact=conf.buildSessionFactory(builder.build());
        Session session=fact.openSession();
        Employee emp=new Employee();
        emp.setName("name");
        emp.setBranch("bangalore");
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
    }
}
