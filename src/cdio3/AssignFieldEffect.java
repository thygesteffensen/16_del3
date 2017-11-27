package cdio3;

public class AssignFieldEffect {
	int location;
	int balance;
	private int propertyValue;
	SpecialFields sp;

	public void initFieldEffect(int location) {

		if (location <= 24)
			sp.passStart();
		
		switch(location) {
		case 0: 
			sp.passStart();
			break;
		case 1: case 2: case 4: case 5:
			propertyValue = 1;
			break;
		case 7: case 8: case 10: case 11:
			propertyValue = 2;
			break;
		case 13: case 14: case 16: case 17:
			propertyValue = 3;
			break;
		case 19: case 20:
			propertyValue = 4;
			break;
		case 22: case 23:
			propertyValue = 5;
			break;
		case 3: case 9: case 15: case 21:
			cc.initChanceCard();
			balance = cc.getBalanceChange();
			locationChange = cc.getMoveTo();
			break;
		case 18:
			jail = true;
		default: break;
		}
	}
	private void chanceCard() {
		ChanceCard.getCard();
		if (ChanceCard.getExtraCard == true)
			chanceCard();
		Player.setLocation(ChanceCard.getMoveTo());
		Player.setBalance(ChanceCard.getBalanceChange());
		ChanceCard.getMessage();

	}
	private void specialFields() {

	}
}
