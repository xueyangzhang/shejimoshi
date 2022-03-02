package 单例模式;


/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/28
 * \
 */
class MainWindow {

    private static MainWindow instance = new MainWindow();
    private MainWindow(){};

    public static MainWindow getMainWindow(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello,word");
    }
}
public class Main{
    public static void main(String[] args) {
        MainWindow mainWindow = MainWindow.getMainWindow();
        MainWindow mainWindow2 = MainWindow.getMainWindow();
        mainWindow.showMessage();
        System.out.println(mainWindow);
        System.out.println(mainWindow2);
    }
}