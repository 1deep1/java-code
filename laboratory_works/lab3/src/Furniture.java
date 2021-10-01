public abstract class Furniture {
    private int id;
    private String name;
    private double price;

    public Furniture(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract void showInfo();
}

class Cupboard extends Furniture {
    private double height, width, depth;
    private boolean door;

    public Cupboard(int id, String name, double price, double height, double width, double depth, boolean door) {
        super(id, name, price);

        this.height = height;
        this.width = width;
        this.depth = depth;
        this.door = door;
    }

    public void showInfo() {
        System.out.println("- Шкаф: (" + super.getID() + ") " + super.getName() + "\nЦена: " + super.getPrice() + "\nРазмеры (ВШГ): " + height + "см, " + width + "см, " + depth + "см;" + "\nКупе: " + door);
    }
}

class Chair extends Furniture {
    private String type;
}
