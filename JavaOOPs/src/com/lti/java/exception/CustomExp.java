package com.lti.java.exception;

public class CustomExp extends Exception{

	public CustomExp() {
		super();
	}

	public CustomExp(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CustomExp(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomExp(String arg0) {
		super(arg0);
	}

	public CustomExp(Throwable arg0) {
		super(arg0);
	}

	
	
}


