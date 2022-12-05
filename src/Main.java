public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(70,1.75);
        bmi = Math.rint(100 * bmi) / 100;
        System.out.println("Индекс массы тела: " + bmi);
    }
}
