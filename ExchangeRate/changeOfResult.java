package 환전수업;

public class changeOfResult {

		public void change(int returnWon) {
			
			System.out.println("\n거스름돈 : " + returnWon + "원");
			System.out.println("\n5만원권 " + (int) returnWon / 50000 + " 장");
			System.out.println("1만원권 " + (int) returnWon % 50000 / 10000 + " 장");
			System.out.println("5천원권 " + (int) returnWon % 50000 % 10000 / 5000 + " 장");
			System.out.println("1천원권 " + (int) returnWon % 50000 % 10000 % 5000 / 1000 + " 장");
			System.out.println("500원 " + (int) returnWon % 50000 % 10000 % 5000 % 1000 / 500 + " 개");
			System.out.println("100원 " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " 개");
			System.out.println("50원 " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " 개");
			System.out.println("10원 " + (int) returnWon % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " 개");
		}
}
