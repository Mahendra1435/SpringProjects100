package com.nt.sbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Icourier {
@Override
	public void Icouriercompany() 
	{
		System.out.println("DHL.Icouriercompany()-0parameter");
	}

}
