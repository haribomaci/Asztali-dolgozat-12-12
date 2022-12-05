package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame implements Window{

    public MainWindow() {
        this.initComponent();
        this.addComponentToWindow();
        this.initWondow();
    }

    public void initComponent() {
    }

    public void addComponentToWindow() {
    }

    public void initWondow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
    
}
