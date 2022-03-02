package 工厂模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        shape as = shapeFactory.getShape("as");
        as.draw();
    }
}