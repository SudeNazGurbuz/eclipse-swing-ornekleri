import java.awt.Color;

import javax.swing.JFrame;

public class MerhabaKalitim extends JFrame {

	public MerhabaKalitim() {
		super("merhaba kalıtım demo");
		setSize(400,400);
		getContentPane().setBackground(Color.blue);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MerhabaKalitim();
	}

}
