package 환전수업;

public class ExchangeMain {

	
		public static void main(String[] args) {
		
			Total_Won exchangePrint = new Total_Won();
			choiceOfExchnage exchangeChoice = new choiceOfExchnage();
			ChoiceOfOption exchangeKind = new ChoiceOfOption();
			Exchange exchangeMoney = new Exchange();
			changeOfResult exchangeChange = new changeOfResult();

			while(true) {

				exchangePrint.Insert_Won();
				if(exchangePrint.option == 0) {
					break;		
				}
				exchangeKind.OptionOfExchange(exchangePrint.MONEY_TO_EXCHANGE_KOR, exchangePrint.option);

				exchangeChoice.print(exchangeKind.selectedTypeText, exchangeKind.exchangeRate,
									exchangePrint.option, exchangeKind.changeMoney, exchangeKind.changeKOR);

				exchangeMoney.return_Exchange(exchangePrint.option, exchangeKind.changeMoney, exchangeKind.selectedTypeText);

				exchangeChange.change(exchangeKind.changeKOR);

				break;
			}	

		} 

	}

			
			
		