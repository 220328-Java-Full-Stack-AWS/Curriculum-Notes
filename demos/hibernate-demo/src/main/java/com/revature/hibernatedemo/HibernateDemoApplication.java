package com.revature.hibernatedemo;

import com.revature.hibernatedemo.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;


@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);

		Configuration config = new Configuration();
		//config.configure().buildSessionFactory();//This is for XML

		//config.configure().addAnnotatedClass(User.class);//for XML config
		config.addAnnotatedClass(User.class);//this is for .properties config

		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();

		User kyle = new User("kplummer", "password", "Kyle", "Plummer");
		session.save(kyle);

		System.out.println(kyle.getId());

//		kyle.setLastName("Johansen");
//		session.update(kyle);
//
//		session.flush();
//
//
//		Transaction tx = session.beginTransaction();
//		kyle.setFirstName("Jonny");
//		tx.commit();
//
//		List<User> myList = new LinkedList<>();
//		myList.add(new User( "kstrohm", "password", "Kenneth", "Strohm"));
//		myList.add(new User( "tcrawford", "password", "Terrell", "Crawford"));
//		myList.add(new User( "kettaleb", "password", "Khalid", "Ettaleb"));
//
//		for (User u : myList) {
//			session.save(u);
//		}








	}
}
