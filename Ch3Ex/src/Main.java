import org.w3c.dom.css.Rect;

/**
 * Created by brandonsmith on 7/7/14.
 */

class Rectangle {
    int width;
    int height;

    public Rectangle() {
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
}

public class Main {
    public static void main(String[] args) {
        int totalArea = 0;

        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(1, 2);
        Rectangle c = new Rectangle(3, 10);

        totalArea = a.area() + b.area() + c.area();
        //I decided to use a double here to avoid losing precision
        double avgArea = totalArea / 3.0;
        System.out.println("The average total is " + avgArea);
    }
}
