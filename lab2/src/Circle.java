public class Circle {
    private float radius;
    private float diameter;
    private String name = "Окружность";

    public Circle(float r, float d) {
        radius = r;
        diameter = d;
    }

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return diameter;
    }

    public String getName() {
        return name;
    }

    public void setRadius(float r) {
        radius = r;
    }

    public void setDiameter(float d) {
        diameter = d;
    }
}
