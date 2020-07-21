package object;

public class GiftCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GiftCard g1=new GiftCard(110098,10000,true);
		g1.rechargeCard(2000);
		g1.swipeCard(400);
		g1.swipeCard(500);
		
		System.out.println("Card No: "+ g1.getCardNo()+"\n"+ "Balance: "+ g1.getBalance());

		GiftCard g2=new GiftCard();
		g2.setCardNo(123890);
		g2.setBalance(25000.00);
		g2.setActive(false);
		
		g2.rechargeCard(3000);
		g2.swipeCard(500);
		g2.swipeCard(2600);
		
		System.out.println("Card No: "+ g2.getCardNo()+"\n"+ "Balance: "+ g2.getBalance());
	}

}