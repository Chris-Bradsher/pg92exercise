package exercisePG92;

public class Circle {
	private int radius;
	public Circle (int r) {
		radius = r;
	}
	
	double getArea (){
		return ((double)getRadius())*((double)getRadius())*Math.PI;
	}
	
	int getRadius(){
		return radius;
	}

}