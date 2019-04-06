package com.fujitsu.shop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("welcome");
		Product p=new Product(1001,"LED TV","SONY",56000.00f);
	    p.display();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC Driver Loader");
			
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}
