package 抽象工厂模式;


import 工厂模式.ShapeFactory;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new shapeFactory();
        }else if (choice.equalsIgnoreCase("Printer")){
            return new printerFactory();
        }
        return null;
    }
}