package 原型模式;

import java.util.Hashtable;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/28
 * \原型模式是创建模式之一。
 *
 * 原型模式有助于创建具有更好性能的重复对象。
 *
 * 在原型模式中，将返回一个现有对象的克隆，而不是创建新的对象。
 *
 * 我们使用原型设计模式，如果创建一个新对象的成本是昂贵和资源密集型。
 */
class ShapeProtoType {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
public class Main{
    public static void main(String[] args) {
        ShapeProtoType.loadCache();
        Shape clonedShape = ShapeProtoType.getShape("1");
        System.out.println("Shape:" + clonedShape.getType());

        Shape clonedShape2 = ShapeProtoType.getShape("2");
        System.out.println("Shape:" + clonedShape2.getType());

        Shape clonedShape3 = ShapeProtoType.getShape("3");
        System.out.println("Shape:" + clonedShape3.getType());
    }

}