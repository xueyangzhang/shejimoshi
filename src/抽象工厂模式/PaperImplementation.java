package 抽象工厂模式;


/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/27
 * \
 */
 class PaperPrinter implements printer {

    @Override
    public void print() {
        System.out.println("纸质打印机");
    }
}
 class WebPrinter implements printer {

    @Override
    public void print() {
        System.out.println("网络打印机");
    }
}
 class ScreenPrinter  implements printer {

    @Override
    public void print() {
        System.out.println("屏幕打印机。");
    }
}