/**
 * Created by brandonsmith on 7/7/14.
 */

/*
    Create a new version of the Chapter 3 exercise where you pass the height and width
    into the Rectangle constructor and initialize the instance variables there.
    Add a perimeter() method to Rectangle.
    Print the total area of all rectangles. Print the total perimeter of all rectangles.
*/

// chapter 3 Rectangle class
class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        // just to be explicit even though the default values are 0
        width = 0;
        height = 0;
    }

    public Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return (2 * height) + (2 * width);
    }
}


public class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(1, 10);
        Rectangle c = new Rectangle(3, 10);

        int totalArea = a.area() + b.area() + c.area();
        int totalPerimeter = a.perimeter() + b.perimeter() + c.perimeter();

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: "+ totalPerimeter);
    }

}
