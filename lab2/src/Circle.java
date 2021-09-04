//import jdk.nashorn.internal.objects.Global;
import javax.swing.JOptionPane;

public class Circle {
    private float radius;
    private float diameter;
    private float length;
    private float square;
    private String name = "Окружность";

    public Circle(float r, float d) {
        radius = r;
        diameter = d;
    }

    public void calcLength() {
        length = (float) (2f * Math.PI * radius);
    }

    public void calcSquare() {
        square = (float) (Math.PI * Math.pow(radius, 2f));
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

    public float getLength() {
        calcLength();
        return length;
    }

    public float getSquare() {
        calcSquare();
        return square;
    }

    public void setRadius(float r) {
        radius = r;
        diameter = r * 2f;
    }

    public void setDiameter(float d) {
        diameter = d;
        radius = d / 2f;
    }
}
