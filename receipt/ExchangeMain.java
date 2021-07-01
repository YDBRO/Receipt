package 환전수업;

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
		    
		    
		      
		     System.out.print("상품 번호를 입력하세요 :");
		     inputNo = scan.nextInt();
		     
		     
		     
		     Statement stmt = conn.createStatement(); 
		     ResultSet rset = stmt.executeQuery("select * from goods WHERE no=" + inputNo); 
		     
		     if (rset.next()) { 
		          //결과물 처리 
		    	 System.out.printf(" %s %d원 \n", rset.getString(2),rset.getInt(3));
		    	 item.name = rset.getString(2);
		    	 item.price = rset.getInt(3);
		    	
		     } else {
		    	 System.out.println("해당하는 상품이 없습니다.");
		     }
		     rset.close(); 
		     stmt.close(); 
		     conn.close(); 
		     } catch(Exception e) {
		    	 e.printStackTrace();
		     }
			
			System.out.print("구매갯수:");
				item.count = scan.nextInt();
				item.total = item.price * item.count ;
				
				orderList.add(item);
				int type = 0;
				System.out.print("1. 추가구매 2. 구매종료:");
				type = scan.nextInt();
				
				
				
				if (type == 2) {
					break;
				}

		}
		scan.close();
		
		System.out.println("");
		for(int index =0; index < orderList.size(); index++) {
			totalPrice += orderList.get(index).price * orderList.get(index).count;}
		
		
		System.out.println("       [ 영 수 증 ]");
		System.out.println("나우카페(역삼점) / 123-45-67890 / 전상열");
		System.out.println("서울특별시 강남구 테헤란로 20길 20, 4층");
		System.out.println("02-6049-2611 / 20190430-01-0012");
		System.out.println("-------------------------------------");
		System.out.printf("%-15s %s    %s    %s \n", "상품명", "단가", "수량", "금액" );
		System.out.println("-------------------------------------");
		for (int index = 0; index < orderList.size(); index++) {
		System.out.printf("%-15s   %d    %d    %d\n", orderList.get(index).name, orderList.get(index).price, orderList.get(index).count, orderList.get(index).price * orderList.get(index).count);}
		System.out.println("-------------------------------------");
		
		System.out.printf("합계 금액            %d\n", totalPrice);
		System.out.printf("할인 금액            %d\n", 0);
		System.out.println("-------------------------------------");
		System.out.println("  ** 할인내역 :     없음");
		System.out.println("-------------------------------------");
	
		
	}
     
	
	}