package 生成器模式;

/**
 * \* @author: 张雪阳
 * \* Date: 2022/2/28
 * \
 */
public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = WindowBuilder.createMainWindow();
    }
}
class Menu{

}
class ToolBar{

}
class MainWindow{
    Menu menu;
    ToolBar toolBar;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(ToolBar toolBar) {
        this.toolBar = toolBar;
    }
}
class WindowBuilder{
    public static MainWindow createMainWindow(){
        MainWindow mainWindow = new MainWindow();
        Menu menu = new Menu();
        ToolBar toolBar = new ToolBar();
        mainWindow.setMenu(menu);
        mainWindow.setToolBar(toolBar);
        return mainWindow;
    }

}