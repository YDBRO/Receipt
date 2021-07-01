package 환전수업;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderList {
	
	public void OrderList(OrderClass inputOrdering, OrderListArray item) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		     Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist","root" , "go2thestudy");
		    String a = "a";
		    
		    item.no = inputOrdering.InputNo(); 
		    Statement stmt = conn.createStatement(); 
		    ResultSet rset = stmt.executeQuery("SELECT * FROM goods WHERE no=" + item.no);

		    if (rset.next()) {   
		    	item.name = rset.getString(2);
		    	item.price = rset.getInt(3);		    	
		    } else { System.out.println("해당하는 상품이 없습니다."); }

		    rset.close();
		    stmt.close(); 
		    conn.close(); 
		} catch(Exception e) { e.printStackTrace(); }
	    item.count = inputOrdering.inputCount();   
	    item.total = item.price * item.count; 
		    
		}
	}


