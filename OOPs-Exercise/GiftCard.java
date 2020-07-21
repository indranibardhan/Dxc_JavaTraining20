package object;

public class GiftCard {

		long cardNo;
		double balance=0;
		boolean active;
		
		public GiftCard(long cardNo,double balance,boolean active)
		{
			this.cardNo=cardNo;
			this.balance=balance;
			this.active=active;
		}
		
		public long getCardNo() {
			return cardNo;
		}
		public void setCardNo(long cardNo) {
			this.cardNo = cardNo;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public GiftCard()
		{
			//this.cardNo=setCardNo();
		}
		
		public void rechargeCard(int amt)
		{
			if(active==true)
			{
				this.balance=this.balance+amt;
				System.out.println("Amount added");
			}
		}
		
		public void swipeCard(int amt)
		{
			if(active==true && this.balance>amt)
			{
				this.balance=this.balance-amt;
				System.out.println("Amount reducted");
			}
			else
			{
				System.out.println("Not possible");
			}
		}
		
}
