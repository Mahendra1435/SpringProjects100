package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbean.Flipkart;

public class StrategyDp {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);)
	{
Flipkart fpkt =ctx.getBean("fpkt",Flipkart.class);

String msg=fpkt.Order(100, 3000);
System.out.println(msg);
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
}
