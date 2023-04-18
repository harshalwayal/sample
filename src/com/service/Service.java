package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Dao;
import com.model.Staff;

public class Service {

	public ArrayList<Staff> m1() throws ClassNotFoundException, SQLException {
		Dao d = new Dao();
		ArrayList<Staff>al = d.m1();
		return al;
	}
}
