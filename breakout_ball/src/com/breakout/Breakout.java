package com.breakout;

import javax.swing.JFrame;

public class Breakout extends JFrame {
	public Breakout() {
		initUI();
	}

	private void initUI() {
		add(new GamePanel());
		setTitle("Breakout Ball Game");
		setSize(800, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		JFrame game = new Breakout();
		game.setVisible(true);
	}

}
