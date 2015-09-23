package exercisePG92;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder (int r, int h){
		height = (double) h;
		base = new Circle(r);
	}
	
	public double getVolume(){
		return base.getArea()*height;
	}
	
}