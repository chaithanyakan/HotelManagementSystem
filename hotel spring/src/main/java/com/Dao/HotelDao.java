package com.Dao;

import java.util.List;

import com.hotelModel.Hotels;

public interface HotelDao {
	public int addCustomer(Hotels h);
	public List<Hotels> Customerlist();
	public int deleteCustomerDetails(int cid);
}
