package 原型模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/28
 * \
 */
public class shpeExpansion {

}

class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("长方形");
    }
}

class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("圆形");
    }
}

class Square  extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("正方形");
    }
}