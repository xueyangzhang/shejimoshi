package 抽象工厂模式;

import 工厂模式.Circle;
import 工厂模式.Square;

abstract class AbstractFactory  {
    abstract printer getPrinter(String type);
    abstract shape getShape(String shape);
}
