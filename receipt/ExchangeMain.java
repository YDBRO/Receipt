package ȯ������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
public class ExchangeMain {

	public static void main(String[] args) {
		int count = 0;
		int inputNo = 0;
		int totalPrice = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<OrderListArray> orderList = new ArrayList<OrderListArray>();

		while(true) {
			OrderListArray item = new OrderListArray();
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		     Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist","root" , "go2thestudy");
		    
		    
		      
		     System.out.print("��ǰ ��ȣ�� �Է��ϼ��� :");
		     inputNo = scan.nextInt();
		     
		     
		     
		     Statement stmt = conn.createStatement(); 
		     ResultSet rset = stmt.executeQuery("select * from goods WHERE no=" + inputNo); 
		     
		     if (rset.next()) { 
		          //����� ó�� 
		    	 System.out.printf(" %s %d�� \n", rset.getString(2),rset.getInt(3));
		    	 item.name = rset.getString(2);
		    	 item.price = rset.getInt(3);
		    	
		     } else {
		    	 System.out.println("�ش��ϴ� ��ǰ�� �����ϴ�.");
		     }
		     rset.close(); 
		     stmt.close(); 
		     conn.close(); 
		     } catch(Exception e) {
		    	 e.printStackTrace();
		     }
			
			System.out.print("���Ű���:");
				item.count = scan.nextInt();
				item.total = item.price * item.count ;
				
				orderList.add(item);
				int type = 0;
				System.out.print("1. �߰����� 2. ��������:");
				type = scan.nextInt();
				
				
				
				if (type == 2) {
					break;
				}

		}
		scan.close();
		
		System.out.println("");
		for(int index =0; index < orderList.size(); index++) {
			totalPrice += orderList.get(index).price * orderList.get(index).count;}
		
		
		System.out.println("       [ �� �� �� ]");
		System.out.println("����ī��(������) / 123-45-67890 / ����");
		System.out.println("����Ư���� ������ ������� 20�� 20, 4��");
		System.out.println("02-6049-2611 / 20190430-01-0012");
		System.out.println("-------------------------------------");
		System.out.printf("%-15s %s    %s    %s \n", "��ǰ��", "�ܰ�", "����", "�ݾ�" );
		System.out.println("-------------------------------------");
		for (int index = 0; index < orderList.size(); index++) {
		System.out.printf("%-15s   %d    %d    %d\n", orderList.get(index).name, orderList.get(index).price, orderList.get(index).count, orderList.get(index).price * orderList.get(index).count);}
		System.out.println("-------------------------------------");
		
		System.out.printf("�հ� �ݾ�            %d\n", totalPrice);
		System.out.printf("���� �ݾ�            %d\n", 0);
		System.out.println("-------------------------------------");
		System.out.println("  ** ���γ��� :     ����");
		System.out.println("-------------------------------------");
	
		
	}
     
	
	}