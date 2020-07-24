/*Create a class Square that implements Polygon and has the following member:
		side 	float*/


package Interface;

public  class Square implements Polygon {
	
	float side;
	
	

	public Square(float side2) {
		// TODO Auto-generated constructor stub
		side=side2;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of the suqare is="+ (side*side));
		
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		
	}

}
