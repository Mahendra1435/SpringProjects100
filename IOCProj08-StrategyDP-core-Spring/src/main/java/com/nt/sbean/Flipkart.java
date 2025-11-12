package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.config.Appconfig;
@Component("fpkt")
public class Flipkart {

    private final Appconfig appconfig;
    @Autowired
	@Qualifier("engg")
	private Icourier courier;
	
	//HAs a Properti\y
	public Flipkart(Appconfig appconfig) 
	{
		System.out.println("Flipkart.Flipkart()--0parameter");
		this.appconfig = appconfig;
	}
	
     public String Order(int shirt,int TShirt) 
     
     
     {
    	 courier.Icouriercompany();
    	 System.out.println("===================================");
    	 System.out.println();
    	 System.out.println("Successfully ordered");
    	 System.out.println("Shirt :"+shirt);
    	 System.out.println("Tshirt :"+TShirt);
    	 System.out.println();
    	 
    	                   
    	 
    	 return  " Total ::"+(shirt +TShirt) +" /n:your order will be delivering soon :";
     }
	

}
