package 환전수업;
import java.util.Scanner;

public class exchangerate {
	



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			final double EXCAHNGE_RATE_USD = 1131.80;
			final double EXCAHNGE_RATE_EUR = 1346.23;
			final double EXCAHNGE_RATE_JPY = 10.25;
			
			double MONEY_TO_EXCHANGE_KOR, exchangeRate, RESULT_OF_EXCHANGE;
			int changeMoney, changeKOR;
			String selectedTypeText;
			
			Scanner myInput = new Scanner(System.in);
			System.out.print("받은 원화 입력 : ");
			MONEY_TO_EXCHANGE_KOR = myInput.nextDouble();
			System.out.printf("\n 1:USD, 2:EUR, 3:JPY?\n");
			int option = myInput.nextInt();		
			myInput.close();
			
			if (option == 1) {
				selectedTypeText = "USD";
				exchangeRate = EXCAHNGE_RATE_USD;			
			} else if (option == 2) {
				selectedTypeText = "EUR";
				exchangeRate = EXCAHNGE_RATE_EUR;
			} else {
				selectedTypeText = "JPY";
				exchangeRate = EXCAHNGE_RATE_JPY;
			}
			System.out.printf("%s을(를) 선택하였습니다.\n", selectedTypeText);
			RESULT_OF_EXCHANGE = MONEY_TO_EXCHANGE_KOR / exchangeRate;
			changeMoney = (int) RESULT_OF_EXCHANGE;
			RESULT_OF_EXCHANGE = RESULT_OF_EXCHANGE - changeMoney;
			changeKOR = (int) (RESULT_OF_EXCHANGE * exchangeRate);
			changeKOR = changeKOR / 10 * 10;
			
			System.out.printf("\n현재 환율은 1 %s에 %f 원입니다.", selectedTypeText, exchangeRate);
			System.out.printf("\n환전금액 : %d %s", changeMoney, selectedTypeText);
			switch(option) {
			case 1:
				System.out.println("\n$100 지폐 " + (int) changeMoney / 100 + " 장");
				System.out.println("$50 지폐 " + (int) changeMoney % 100 / 50 + " 장");
				System.out.println("$20 지폐 " + (int) changeMoney % 100 % 50 / 20 + " 장");
				System.out.println("$10 지폐 " + (int) changeMoney % 100 % 50 % 20 / 10 + " 장");
				System.out.println("$5 지폐 " + (int) changeMoney % 100 % 50 % 20 % 10 / 5 + " 장");
				System.out.println("$1 지폐 " + (int) changeMoney % 100 % 50 % 20 % 10 % 5 / 1 + " 장");			
			break; 
			case 2: 
				System.out.println("\n200유로권 " + (int) changeMoney / 200 + " 장");
				System.out.println("100유로권 " + (int) changeMoney % 200 / 100 + " 장");
				System.out.println("50유로권 " + (int) changeMoney % 200 % 100 / 50 + " 장");
				System.out.println("20유로권 " + (int) changeMoney % 200 % 100 % 50 / 20 + " 장");
				System.out.println("10유로권 " + (int) changeMoney % 200 % 100 % 50 % 20 / 10 + " 장");
				System.out.println("5유로권 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 / 5 + " 장");
				System.out.println("2유로동전 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 / 2 + " 개");
				System.out.println("1유로동전 " + (int) changeMoney % 200 % 100 % 50 % 20 % 10 % 5 % 2 / 1 + " 개");
			 break;
			 default:
				System.out.println("\n10000엔권 " + (int) changeMoney / 10000 + " 장");
				System.out.println("5000엔권 " + (int) changeMoney % 10000 / 5000 + " 장");
				System.out.println("2000엔권 " + (int) changeMoney % 10000 % 5000 / 2000 + " 장");
				System.out.println("1000엔권 " + (int) changeMoney % 10000 % 5000 % 2000 / 1000 + " 장");
				System.out.println("500엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 1000 / 500 + " 개");
				System.out.println("100엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 / 100 + " 개");
				System.out.println("50엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 / 50 + " 개");
				System.out.println("10엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 / 10 + " 개");
				System.out.println("1엔동전 " + (int) changeMoney % 10000 % 5000 % 2000 % 500 % 100 % 50 % 10 / 1 + " 개");	
			}
			// 원화 거스름돈
			System.out.println("\n거스름돈 : " + changeKOR + " 원");
			System.out.println("\n5만원권 " + (int) changeKOR / 50000 + " 장");
			System.out.println("1만원권 " + (int) changeKOR % 50000 / 10000 + " 장");
			System.out.println("5천원권 " + (int) changeKOR % 50000 % 10000 / 5000 + " 장");
			System.out.println("1천원권 " + (int) changeKOR % 50000 % 10000 % 5000 / 1000 + " 장");
			System.out.println("500원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 / 500 + " 개");
			System.out.println("100원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 / 100 + " 개");
			System.out.println("50원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + " 개");
			System.out.println("10원 " + (int) changeKOR % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + " 개");
		
		myInput.close();
		}

	}



