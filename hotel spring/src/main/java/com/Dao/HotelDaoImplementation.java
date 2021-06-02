package com.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hotelModel.Hotels;
@Repository
@Component
public class HotelDaoImplementation  implements HotelDao{
@Autowired
SessionFactory factory;

public int addCustomer(Hotels h) {
	Session session =factory.openSession();

	Transaction trnx = session.beginTransaction();

	int primary = (Integer) session.save(h);

	System.out.println("primary = " + primary);

	trnx.commit();

	session.close();

	return primary;
}

public List<Hotels> Customerlist() {
	Session session = factory.openSession();

	List<Hotels> list = new ArrayList();

	Query query = session.createQuery("from Hotels");

	list = query.list();

	session.close();

	return list;
	

}

public int deleteCustomerDetails(int primary) {
	
	Session session = factory.openSession();

	Transaction trnx = session.beginTransaction();

	Hotels h1 = (Hotels) session.get(Hotels.class, primary);

	session.delete(h1);

	trnx.commit();

	session.close();

	return 0;
}
	

}
