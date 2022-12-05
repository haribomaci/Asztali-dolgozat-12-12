import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import controllers.MainController;

public class MainControllerTest {
    MainController mainController;
    @BeforeEach
    public void initEach(){
        this.mainController = new MainController();

    }
    @Test
    public void testCalcVolume(){
        double radius = 30;
        double height = 35;
       double volume = this.mainController.calcVolume(radius, height);
       double elvart = 32986.7228626928;
       assertEquals(elvart, volume);
    }
    @Test
    public void testCalcVolume_2(){
        double radius = 40;
        double height = 45;
       double volume = this.mainController.calcVolume(radius, height);
       double elvart = 75398.22368615502;
       assertEquals(elvart, volume);
    }


}
