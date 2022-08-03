package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void printIsPositive(int number) {
        if (number > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        printIsPositive(14);
    } 
}
