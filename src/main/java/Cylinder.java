public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super();
        setColor(color);
        setRadius(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Hinh tru tron ban kinh " + getRadius() + " chieu cao " + getHeight() + " co mau " + getColor() + " co dien tich la: " + getArea();
    }
}
