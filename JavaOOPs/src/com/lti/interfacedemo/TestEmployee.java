package com.lti.interfacedemo;

public class TestEmployee {

	public static void main(String[] args) {
		
		TempEmplImpl t1 = new  TempEmplImpl ();
		t1.setTempId(111111);
		t1.setNoDays(20);
		t1.setSalPerDay(200000.00f);
		//t1.calc();
		
		PermEmplImpl p1=new PermEmplImpl();
		p1.setBasicSal(10000);
		p1.setEmpId(22222);
		//p1.calc();
		
		
		
		IPerson p_ref;
		p_ref = t1;
		p_ref.calc();
		
		
		p_ref = p1;
		p_ref.calc();
		
	}

}
