package com.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CatMain {
    public static void main(String[] args) {
    	
        SessionFactory sf = CatHibernateUtil.getSessionFactory();
        
        Session session = sf.openSession();
        Session session1 = sf.openSession();
        
  Cat c= session.get(Cat.class,3);
        System.out.println(c);

       Cat c1= session1.get(Cat.class, 3);
        System.out.println(c1);
     
        session.close();
       // session1.close();
        sf.close();
}
}    
        
    
/* Cat c = new Cat();
c.setCatId(1);    
c.setCatBreed("pixie");
c.setFood("fish");

session.save(c);

Transaction tx = session.beginTransaction();
tx.commit();*/