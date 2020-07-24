/*Create another class Rectangle that implements Polygon and has the following member:
		length		float
		breadth	float*/



package Interface;

public  class Rectangle implements Polygon{
	
	float length,breth;
	
	
	public Rectangle(float length,float breth)
	{
		this.length=length;
		this.breth=breth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of the rectangle is :"+ (2*(length+breth)));
	}

}
