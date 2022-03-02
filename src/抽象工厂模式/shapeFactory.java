package 抽象工厂模式;


/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
class printerFactory extends AbstractFactory {
    @Override
    printer getPrinter(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("paper")) {
            return new PaperPrinter();
        }
        if (type.equalsIgnoreCase("web")) {
            return new WebPrinter();
        } else if (type.equalsIgnoreCase("screen")) {
            return new ScreenPrinter();
        }
        return null;
    }

    @Override
    shape getShape(String shape) {
        return null;
    }
}

class shapeFactory extends AbstractFactory {

    @Override
    public shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    printer getPrinter(String type) {
        return null;
    }

}
