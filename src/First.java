import shapes.*;

//import shapes.Circle;
//import shapes.Cylinder;

//import calculations.Addition;


public class First {

	public static void main(String[] args) {
		
		//computing area of a circle with radius 10
		
		//to call a method, we need the object of class
		Circle c1=new Circle();
		c1.circleArea(10);
		
		//computing area of cylinder with radius 10 and height 20
		Cylinder c2=new Cylinder();
		c2.cylinderArea(10, 20);
		
		
		calculations.Addition ad=new calculations.Addition();
		ad.sum(10, 20);
	}

}
