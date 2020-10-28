package com.work.simulator;

import static java.util.concurrent.ThreadLocalRandom.current;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

public class M {

  public static void main(String[] args) throws AWTException {
    final Robot robot = new Robot();
    final int SLEEP_TIME = 10000;//in ms
    // java - get screen size using the Toolkit class
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    // the screen height
    final int y = (int) screenSize.getHeight();
    // the screen width
    final int x = (int) screenSize.getWidth();
    final RandomValue randomValue = new RandomValue(x, y);
    while (true) {
      robot.mouseMove(randomValue.getBoundX(), randomValue.getBoundY());
      robot.delay(SLEEP_TIME);
    }
  }

  private static class RandomValue {

    private int boundX;
    private int boundY;

    public RandomValue(int boundX, int boundY) {
      this.boundX = boundX;
      this.boundY = boundY;
    }

    public int getBoundX() {
      return current().nextInt(0, boundX);
    }

    public int getBoundY() {
      return current().nextInt(0, boundY);
    }
  }
}
