import java.awt.*;
import java.util.concurrent.TimeUnit;

public class M implements Runnable {

    public void move() {
        try {
            // These coordinates are screen coordinates
            int xCoord = 700;
            int yCoord = 700;

            // Move the cursor
            Robot robot = new Robot();
            while (true) {
                robot.mouseMove(0, 0);
                TimeUnit.SECONDS.sleep(30);
                robot.mouseMove(xCoord, yCoord);
                TimeUnit.SECONDS.sleep(30);
            }
        } catch (AWTException e) {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        move();
    }

    public static void main(String[] args) {
        new Thread(new M()).start();
    }

}
