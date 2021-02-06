
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.95;
		double moneyInWallet = 42.24;
		short thirstLevel = 6;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2*costOfMilk;
		System.out.println(willBuyMilk);
		
		
	}
}