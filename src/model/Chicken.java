package model;

public class Chicken extends Bird {

	public Chicken(double weight, double height, int age, double wingSpan) {
		super(weight, height, age, weight);

	}

	@Override
	public String communication() {
		return "The Chicken cackles";
	}


}
