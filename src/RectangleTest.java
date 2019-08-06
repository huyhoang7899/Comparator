public class RectangleTest{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 4.6);
        System.out.println(rectangle);

        rectangle = new Rectangle(8.4, 6.4, "pink", false);
        System.out.println(rectangle);
    }
}