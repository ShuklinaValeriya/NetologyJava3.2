public class BmiService {
    public int calculate(double height, double weight) {
        double indexHeight = Math.pow(height/100, 2);
        double bmi = weight / indexHeight;
        return (int) bmi;

    }
}
