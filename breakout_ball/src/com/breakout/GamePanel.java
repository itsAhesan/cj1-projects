package com.breakout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {

    private Timer timer;
    private Ball ball;
    private Paddle paddle;
    private Brick[] bricks;
    private int score;
    private int lives;
    private int level;

    public GamePanel() {
        initGame();
    }

    private void initGame() {
        setFocusable(true);
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        ball = new Ball();
        paddle = new Paddle();
        score = 0;
        lives = 3;
        level = 1;

        initBricks();

        addKeyListener(new TAdapter());
        timer = new Timer(10, this);
        timer.start();
    }

    private void initBricks() {
        int numBricks = 30 + (level - 1) * 10; // Increase bricks with levels
        bricks = new Brick[numBricks];
        int brickX = 50;
        int brickY = 50;
        for (int i = 0; i < bricks.length; i++) {
            bricks[i] = new Brick(brickX, brickY);
            brickX += 60;
            if (brickX > 700) {
                brickX = 50;
                brickY += 30;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
        drawScoreAndLives(g);
        Toolkit.getDefaultToolkit().sync();
    }

    private void drawObjects(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.draw(g2d);
        paddle.draw(g2d);

        for (Brick brick : bricks) {
            if (!brick.isDestroyed()) {
                brick.draw(g2d);
            }
        }
    }

    private void drawScoreAndLives(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        g.drawString("Score: " + score, 10, 20);
        g.drawString("Lives: " + lives, 700, 20);
        g.drawString("Level: " + level, 350, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ball.move();
        paddle.move();
        checkCollisions();
        repaint();
    }

    private void checkCollisions() {
        if (ball.getRect().intersects(paddle.getRect())) {
            ball.reverseYDirection();
        }

        for (Brick brick : bricks) {
            if (!brick.isDestroyed() && ball.getRect().intersects(brick.getRect())) {
                ball.reverseYDirection();
                brick.setDestroyed(true);
                score += 10;

                if (allBricksDestroyed()) {
                    level++;
                    ball.resetPosition();
                    paddle.resetPosition();
                    initBricks();
                }
            }
        }

        if (ball.getY() > 590) { // Check if the ball has fallen below the paddle
            lives--;
            if (lives == 0) {
                timer.stop();
                showGameOverMessage();
            } else {
                ball.resetPosition();
                paddle.resetPosition();
            }
        }
    }

    private boolean allBricksDestroyed() {
        for (Brick brick : bricks) {
            if (!brick.isDestroyed()) {
                return false;
            }
        }
        return true;
    }

    private void showGameOverMessage() {
        JOptionPane.showMessageDialog(this, "Game Over! Your score: " + score,
                "Game Over", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            paddle.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            paddle.keyReleased(e);
        }
    }
}
