package entites;

public class Area {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return 2 * (width + heigth);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + heigth * heigth);
	}
	
	public String toString() {
		return  "�rea: " + String.format("%.2f", area()) + ", " +
				"Per�metro: " + String.format("%.2f", perimeter()) + ", " +
				"Diagonal: " + String.format("%.2f", diagonal());
	}
}





