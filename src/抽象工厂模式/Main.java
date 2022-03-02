package 抽象工厂模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory paper = FactoryProducer.getFactory("Printer");
        printer paper1 = paper.getPrinter("paper");
        paper1.print();

        printer paper2 = paper.getPrinter("web");
        paper2.print();

        printer paper3 = paper.getPrinter("screen");
        paper3.print();


        AbstractFactory shape = FactoryProducer.getFactory("shape");
        shape shape1 = shape.getShape("circle");
        shape1.draw();

        shape shape2 = shape.getShape("rectangle");
        shape2.draw();

        shape shape3 = shape.getShape("square");
        shape3.draw();



    }
}