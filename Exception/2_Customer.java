package Collection;

public class Customer {
	
	private String custNo;
	private String custName;
	private String category;
	
	public Customer(String custNo,String custName,String category)
	{
		this.custNo=custNo;
		this.custName=custName;
		this.category=category;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public String setCustNo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void CustomerNumber(String custNo) throws InvalidException {
		// TODO Auto-generated method stub
		if(this.custName.charAt(0)=='C' || this.custName.charAt(0)=='c')
		{throw new InvalidException("Not Valid");}
		else
		{System.out.println("Valid");}
		
	}

	public String setCustName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void CustomerName(String custName) throws InvalidException {
		// TODO Auto-generated method stub
		int l=this.custName.length();
		if(l >= 4)
		{throw new InvalidException("Not Valid");}
		else
		{System.out.println("Valid");}
		
	}

	public String setCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Category(String category) throws InvalidException {
		// TODO Auto-generated method stub
		if((this.category !="Diamond") && (this.category!="Gold" || this.category!="Silver"))
		{throw new InvalidException("Not Valid");}
		else
		{System.out.println("Valid");}
		
	}

	


}
