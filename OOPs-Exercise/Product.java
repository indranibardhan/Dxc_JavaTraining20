package object;

public class Product
{
	
	private static int prodCounter=100;
	
	int productCode;
	String productName;
	double productPrice;
	char categoryCode;
	
	public static int getProdCounter() {
		return prodCounter;
	}
	private int generateProductCode()
	{
		prodCounter=prodCounter+1;
		productCode=categoryCode+prodCounter;
		return prodCounter;
	}
	public static void setProdCounter(int prodCounter) {
		Product.prodCounter = prodCounter;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	public Product(String productName, double productPrice, char categoryCode)
	{
		this.productName=productName;
		this.productPrice=productPrice;
		this.categoryCode=categoryCode;
		this.productCode=generateProductCode();
	}
	
	public Product(String productName, double productPrice)
	{
		this.productName=productName;
		this.productPrice=productPrice;
		this.productCode=generateProductCode();
		this.categoryCode='E';
	}
	
	/*public String getProductDetails(int productCode, String productName, double productPrice, char categoryCode)
	{
		this.productCode=productCode;
		this.productName=productName;
		this.productPrice=productPrice;
		this.categoryCode=categoryCode;
		return (this.productCode,this.productName,this.productPrice,this.categoryCode);
	}*/
	
	
}
	
	