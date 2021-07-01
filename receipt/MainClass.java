package 환전수업;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner; 

public class MainClass {
	
	public static void main(String[] args) { 

		ArrayList<OrderListArray> orderList = new ArrayList<OrderListArray>(); 
		OrderClass inputOr = new OrderClass(); 
		Print printOr = new Print(); 
		OrderList listOr = new OrderList(); 

		while(true) {

			OrderListArray item = new OrderListArray();	
			listOr.OrderList(inputOr,item);

			orderList.add(item);

			inputOr.inputADD();

		    if (inputOr.type == 1) { continue; } 
		    else if(inputOr.type == 2) { break;} 

		} printOr.printOrder(orderList);


}
} 



