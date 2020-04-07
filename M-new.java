import java.awt.AWTException;
import java.awt.Robot;

public class M {

  public static void main(String[] args) throws AWTException {
    final Robot robot = new Robot();
    final int SLEEP_TIME = 10000;//in ms
    while(true){
      robot.mouseMove(0, 0);
      robot.delay(SLEEP_TIME);
      robot.mouseMove(1, 0);
    }
  }
}
