import java.util.Scanner;

public class CircleTest {
    public static void showInfo(Circle circ1) {
        System.out.print("Радиус: " + circ1.getRadius() + "; Диаметр: " + circ1.getDiameter() + "; Длина: " + circ1.getLength() + "; Площадь: " + circ1.getSquare() + ";");
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Изучение Java.\nЛабораторная работа 2. Вариант 1.\n");

        Circle circ1 = new Circle(5, 15);
        

        System.out.println("Имя: " + circ1.getName());
        showInfo(circ1);

        System.out.println("\n\nИзменение значений");
        System.out.print("Радиус: ");
        circ1.setRadius(scanner.nextFloat());
        System.out.print("Диаметр: ");
        circ1.setDiameter(scanner.nextFloat());

        showInfo(circ1);
    }
}
