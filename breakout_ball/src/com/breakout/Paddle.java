package com.breakout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Paddle {
    private int x;
    private int y;
    private int dx;

    public Paddle() {
        resetPosition();
    }

    public void move() {
        x += dx;
        if (x < 0) {
            x = 0;
        }
        if (x > 700) {
            x = 700;
        }
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 100, 10);
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    public void resetPosition() {
        x = 350;
        y = 550;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, 100, 10);
    }
}


