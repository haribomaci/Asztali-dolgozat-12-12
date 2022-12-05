package controllers;

import views.MainWindow;

public class MainController {

    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        
    }
    public double calcVolume(double radius, double height){
        return (1.0/3.0) * Math.pow(radius, 2) * Math.PI * height;
    }
    
}
