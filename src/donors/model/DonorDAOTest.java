package donors.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class DonorDAOTest {

	DonorDAO aut=new DonorDAOImpl();
	
	@Test
	public void createTest() throws ParseException, SQLException
	{
		String firstname="Priya";
		String lastname="Sing";
		int age=41;
		String gender="FeMale";
		String dob="12-OCT-1978";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dob1=sdf.parse(dob);
		
		int height=160;
		
		int weight=74;
		String mail="priya.suresh@mail.com";
		String phn="9876321455";
		String Address="Delhi";
		String bldgrp="O+";
		String flag="Y";
		String lastdate="23-OCT-2019";
		Date lastd=sdf.parse(lastdate);
		Donors donor=new Donors(firstname,lastname,age,gender,dob1,height,weight,mail,phn,Address,bldgrp,flag,lastd);
		
		int res=aut.create(donor);
		assertEquals(1,res);
		
	}
	
	@Test
	public void readListTest() throws SQLException, ParseException
	{
		List<Donors> donorList=aut.read();
		assertFalse(donorList.isEmpty());
	}
	
	@Test
	public void updateTest() throws SQLException, ParseException
	{
		int id=81;
		Donors donor=aut.read(id);
		
		donor.setBloodgrp("A+");
		int res=aut.update(donor);
		assertEquals(1,res);
	}
	
	@Test
	public void deleteTest() throws SQLException
	{
		int id=22;
		int res=aut.delete(id);
		assertEquals(1,res);
	}
}
