package com.singleton;

public class Logger {
	public static Logger instance;
	private Logger(){
		System.out.println("Logger initialized");
	}
	public static Logger getInstance(){
		if(instance== null){
			instance=new Logger();
		}
		return instance;
	}
}
