package be.intecbrussel.graphics;

public class RectangleApp {

    public static void main(String[] args) {
        System.out.println("this program uses a rectangle");
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        //epliciet een waarde toekennen aan rect
        rect.setHeight(1);
        rect.width = 2;
        rect.x = 1;
        rect.y = 3;

        //epliciet een waarde toekennen aan rect2
        rect2.setHeight(10);
        rect2.width = 1;
        rect2.x = 1;
        rect2.y = 1;

        //print out the values of height, width, x and y of rect

        System.out.println("height: " + rect.getHeight());
        System.out.println("width: " + rect.width);
        System.out.println("x: " + rect.x);
        System.out.println("y: " + rect.y);

        //print out the values of height, width, x and y of rect2

        System.out.println("height: " + rect2.getHeight());
        System.out.println("width: " + rect2.width);
        System.out.println("x: " + rect2.x);
        System.out.println("y: " + rect2.y);

        //print out the areas of the rectangles
        System.out.println("rectangle 1 has an area of: " + rect.getArea());
        System.out.println("rectangle 2 has an area of: " + rect2.getArea());
    }
}
