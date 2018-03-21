package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.WebDriver;

//import com.stepdefination.PropertyFile;

public class PropertyFile {
Properties p;
	
	
	
	public  PropertyFile() throws Exception
	{
	File f=new File("./src/test/resources/PropertyFile/Configration.property");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	
	public String getkey()
	{
		
		 return (String) p.get("webbrowserkey");
	}
	
	public String getpath()
	{
		  return (String) p.get("webbrowserpath");
	}
	
	public String getUrl()
	{
		 return (String) p.get("weburl");
		
		
	}
	
	
	/*public static void main(String[] args)
	{
	//public void getvalues()
		PropertyFile p1;
		try {
			p1 = new PropertyFile();
			System.out.println(p1.getkey());
		    System.out.println(p1.getpath());
		    System.out.println(p1.getUrl());
		    S
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/

}
