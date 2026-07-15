package pongplus.ui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	public static final String TITLE = "Pong Plus";
	public static final int WIDTH = 1600;
	public static final int HEIGHT = 900;

	public MainFrame() {
		super(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
	}

}
