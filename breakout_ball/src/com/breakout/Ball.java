package com.breakout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Ball() {
        resetPosition();
    }

    public void move() {
        x += dx;
        y += dy;

        if (x < 0) {
            dx = 1;
        }

        if (x > 790) {
            dx = -1;
        }

        if (y < 0) {
            dy = 1;
        }
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 10, 10);
    }

    public void reverseYDirection() {
        dy = -dy;
    }

    public void resetPosition() {
        x = 400;
        y = 300;
        dx = 1;
        dy = -1;
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, 10, 10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

