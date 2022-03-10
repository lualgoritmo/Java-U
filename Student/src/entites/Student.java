package entites;

public class Student {

	public String nameStudent;
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	public double media() {
		return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
	}
	public double mediaFinal() {
		if(media() < 60.0) {
			return 60.0 - media();
		}
		else {
			return media();
		}
	}
}
