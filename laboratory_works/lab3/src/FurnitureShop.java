import java.util.Scanner;

public class FurnitureShop {
    public static void Shop() {
        System.out.println("Магазин Мебель24 - Каталог\n");

        //Вывод шкафов
        System.out.println("Шкафы24:");
        Cupboard cupboard1 = new Cupboard(11, "Цветочный Вальс", 12999.99, 100.1, 50.5, 20.2, false);
        Cupboard cupboard2 = new Cupboard(12, "Океан полок", 19999.99, 150.5, 72.3, 33.1, true);
        cupboard1.showInfo();
        cupboard2.showInfo();

        //Вывод стульев
        System.out.println("\nСтулья24:");
        Chair chair1 = new Chair(21, "Трон Короля", 109000.00, 50.032, 30.00, 30.00, 4.0, true);
        Chair chair2 = new Chair(22, "Табуретка", 1200.00, 60.00, 30.00, 30.00, 4.0, false);
        Chair chair3 = new Chair(23, "Геймерский чил", 45999.00, 55.00, 45.90, 45.90, 5, true);
        chair1.showInfo();
        chair2.showInfo();
        chair3.showInfo();
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Изучение Java.\nЛабораторная работа 3. Вариант 3.\n");
        Shop();
    }
}
