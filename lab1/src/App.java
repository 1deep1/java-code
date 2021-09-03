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

        System.out.println("Изучение Java.\nЛабораторная работа 1. Вариант 5.\n");

        inputNumber = scanner.nextInt();
        
        System.out.println("Ответ: ");
        System.out.println(calc(inputNumber));
    }
}
