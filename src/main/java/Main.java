public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Green");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5, "Red", 10);
        System.out.println(cylinder.toString());

    }
}
