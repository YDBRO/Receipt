package 환전수업;

public class choiceOfExchnage {

		public void print(String selectedTypeText, double exchangeRate, int moneyType, int returnMoney, int returnWon)
		{
			System.out.printf("%s을(를) 선택하였습니다.\n", selectedTypeText);
			System.out.printf("\n현재 환율은 1 %s에 %f 원입니다.", selectedTypeText, exchangeRate);
		}
}
