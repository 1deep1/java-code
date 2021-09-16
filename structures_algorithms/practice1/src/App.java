import java.util.Scanner;

public class App {
    public static int calc(int inputNumber) {
        int outNum = 1;

        for(int i=1;i<=inputNumber;i++) {
            outNum = outNum * i;
        }

        return outNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 1;

        System.out.println("СИАОД.\nПрактическая работа 1. Вариант 6.\n");

        inputNumber = scanner.nextInt();
        
        System.out.print("Ответ: ");
        System.out.println(calc(inputNumber));
    }
}
