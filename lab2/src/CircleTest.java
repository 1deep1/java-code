import java.util.Scanner;

public class CircleTest {
    public static void showInfo(Circle circ1) {
        System.out.print("\nРадиус: " + circ1.getRadius() + "; Диаметр: " + circ1.getDiameter() + "; Длина: " + circ1.getLength() + "; Площадь: " + circ1.getSquare() + ";");
    }

    public static void menuPrint() {
        System.out.println("\n\nИзменение значений");
        System.out.println("1 - Радиус;");
        System.out.println("2 - Диаметр;");
        System.out.println("0 - Выход;");
    }

    public static void menuChoice(int numMenu, Circle circ1) {
        Scanner scanner = new Scanner(System.in);

        switch (numMenu) {
            case 0 : 
                System.out.println("Выход...");
            break;
            case 1 : 
                System.out.print("Радиус: ");
                circ1.setRadius(scanner.nextFloat());
                showInfo(circ1);
            break;
            case 2 : 
                System.out.print("Диаметр: ");
                circ1.setDiameter(scanner.nextFloat());
                showInfo(circ1);
            break;
            default:
                System.out.println("Неверный ввод!");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Изучение Java.\nЛабораторная работа 2. Вариант 1.\n");

        Circle circ1 = new Circle(5, 10);
        int watcher = 1;
        

        System.out.print("Имя: " + circ1.getName());
        showInfo(circ1);

        while(watcher != 0) {
            menuPrint();
            watcher = scanner.nextInt();
            menuChoice(watcher, circ1);
        }

        /*
        System.out.print("Радиус: ");
        circ1.setRadius(scanner.nextFloat());
        System.out.print("Диаметр: ");
        circ1.setDiameter(scanner.nextFloat());
        */
    }
}
