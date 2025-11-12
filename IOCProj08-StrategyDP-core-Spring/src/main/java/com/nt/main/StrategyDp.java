package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbean.Flipkart;

public class StrategyDp {
public static void main(String[] args) {
	try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);)
	{
Flipkart fpkt =ctx.getBean("fpkt",Flipkart.class);
System.out.println(" iam the delivered your order at hyd pls check ");

String msg=fpkt.Order(1000, 5000);
System.out.println(msg);
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
}
