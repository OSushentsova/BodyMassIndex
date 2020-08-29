public class BmiService {
    public double calculate( double weight, double height) {
       double bmi = (double) (weight / (height * height));
        return bmi;
    }
}
