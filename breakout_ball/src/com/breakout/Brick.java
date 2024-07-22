package com.breakout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Brick {
    private int x;
    private int y;
    private boolean destroyed;

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;
        this.destroyed = false;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 20);
    }

    public Rectangle getRect() {
        return new Rectangle(x, y, 50, 20);
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
}

