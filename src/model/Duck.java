package model; 

public class Duck extends Bird {

    public Duck(double weight, double height, int age, double wingSpan) {
        super(weight, height, age, wingSpan);
    }

    @Override
    public String communication() {
        return "Quack!!!";
    }

    public String toString() {
        return "wingSpan: " + super.wingSpan;
    }
}
