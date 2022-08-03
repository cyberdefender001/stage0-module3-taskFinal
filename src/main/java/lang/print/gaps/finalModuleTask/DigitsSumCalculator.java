package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        calculateSum(1234);
    }
    public static void calculateSum(int number) {
        int num1 = number / 1000;
        int num2 = number % 1000 / 100;
        int num3 = number % 100 / 10;
        int num4 = number % 10;
        int result = num4 + num3 + num2 + num1;
        System.out.println(result);   
    }
}
