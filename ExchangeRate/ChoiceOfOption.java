package 환전수업;

public class ChoiceOfOption {

	public final double EXCAHNGE_RATE_USD = 1131.80;
	public final double EXCAHNGE_RATE_EUR = 1346.23;
	public final double EXCAHNGE_RATE_JPY = 10.25;
	
	public double exchangeRate = 0, RESULT_OF_EXCHANGE = 0;
	public int changeMoney = 0, changeKOR = 0;
	String selectedTypeText = null;

	public void OptionOfExchange(double MONEY_TO_EXCHANGE_KOR, int option) {
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
	}
}
