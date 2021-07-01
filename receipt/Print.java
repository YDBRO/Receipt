package 환전수업;

import java.util.ArrayList;

public class Print {
	
	int totalPrice = 0;

	public void printOrder(ArrayList<OrderListArray> orderList) {

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
