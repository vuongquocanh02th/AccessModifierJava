public class Main {
    public static void main(String[] args) {
        //Tao doi tuong Circle su dung ham tao khong tham so
        Circle circle1 = new Circle();
        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle1 area: " + circle1.getArea());
        //Tao doi tuong Circle su dung ham tao co tham so
        Circle circle2 = new Circle(0.5);
        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle2 area: " + circle2.getArea());
    }
}