package 抽象工厂模式;
/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
class Rectangle implements shape {
    @Override
    public void draw() {
        System.out.println("长方形");
    }
}

class Square implements shape {


    @Override
    public void draw() {
        System.out.println("正方形");
    }
}

class Circle implements shape {

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}