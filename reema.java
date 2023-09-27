import java.util.Scanner;

public class reema {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.read();
        rect.show();
        Circle c = new Circle();
        c.read();
        c.show();
    }
}

abstract class Shape {
    final float pi = 3.14f;

    Scanner scan = new Scanner(System.in);

    abstract void read();

    abstract void show();

}

class Rectangle extends Shape {
    int l, w, area;

    void read() {
        System.out.print("Enter Lenght = ");
        l = scan.nextInt();
        System.out.print("Enter Width = ");
        w = scan.nextInt();
        area = l * w;

    }

    void show() {
        System.out.println("Rectangle Area = " + area);
    }

}

class Circle extends Shape {
    float r;
    float total;

    void read() {
        System.out.print("Enter Circle Radius = ");
        r = scan.nextFloat();
        total = pi * r * r;
    }

    void show() {
        System.out.println("Circle of Area = " + total);
    }
}