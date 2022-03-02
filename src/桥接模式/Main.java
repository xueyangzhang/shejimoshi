package 桥接模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/3/1
 * \
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new ColorPrinter());
        Shape blackCircle = new Circle(100,100, 10, new BlackPrinter());

        redCircle.draw();
        blackCircle.draw();

    }
}

interface Printer {
    public void print(int radius, int x, int y);
}

class ColorPrinter implements Printer {
    @Override
    public void print(int radius, int x, int y) {
        System.out.println("ColorPrinter:" + radius + ",x:" + x + ",y:" + y);
    }

}
class BlackPrinter implements Printer {
    @Override
    public void print(int radius, int x, int y) {
        System.out.println("ColorPrinter:" + radius + ",x:" + x + ",y:" + y);
    }
}


abstract class Shape {
    protected Printer printer;

    protected Shape(Printer p) {
        this.printer = p;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int x, int y, int radius, Printer draw) {
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        printer.print(radius,x,y);
    }
}

