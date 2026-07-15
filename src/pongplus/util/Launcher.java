package pongplus.util;

import javax.swing.SwingUtilities;

import pongplus.ui.MainFrame;

public class Launcher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MainFrame mainFrame = new MainFrame();
			mainFrame.setVisible(true);
		});
	}

}
