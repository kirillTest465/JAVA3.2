public class BmiService {
    public static int calculate(double weight, double height) {
      double bmi = weight / (height * height);
      return (int) bmi; // Приведение к целому числу
    }
}
