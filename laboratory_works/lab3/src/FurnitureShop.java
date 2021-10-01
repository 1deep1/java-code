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
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Изучение Java.\nЛабораторная работа 3. Вариант 3.\n");
        Shop();
    }
}
