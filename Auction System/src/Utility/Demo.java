package Utility;

import java.sql.Connection;

public class Demo {
	
	public static void main(String[] args) {
		
	Connection c=	DBUTILL.provideConnection();
	if(c!=null) {
		System.out.println("conected");
	}else {
		System.out.println("not");
	}
	}

}
