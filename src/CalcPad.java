import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcPad extends JFrame {
	
	public CalcPad() {
		setSize(300,300);
		setLayout(new GridLayout(5,3));
		int off[]= {-2,2,0};
		for(int i=9;i>=1;i--) 
			add(new JButton(""+(i+off[i%3])));
			
			add(new JButton("."));
			add(new JButton("0"));
			add(new JButton("+/-"));
			
			add(new JPanel());
			
		
	}

	public static void main(String[] args) {
		new CalcPad().setVisible(true);

	}

}
