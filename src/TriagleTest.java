public class TriagleTest {
    public static void main(String[] args) {
        boolean isRight;

        Triangle triangle1 = new Triangle(6, 8, 10);
        TrianleCheck trianleCheck1 = new TrianleCheck();

        isRight = trianleCheck1.isRightTriangle(triangle1);
        System.out.println("Czy to trójkąt prostokątny? " + isRight);

    }

}