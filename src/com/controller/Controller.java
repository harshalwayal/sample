package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.model.Staff;
import com.service.Service;

public class Controller {
void m1() throws ClassNotFoundException, SQLException {
	Service s= new Service();
	ArrayList<Staff> al = s.m1();
	for (Staff staff : al) {
		System.out.println(staff);
	}
}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Controller cc = new Controller();
	cc.m1();
			}
}
