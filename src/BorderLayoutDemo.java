import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {

	public BorderLayoutDemo() {
		super("Border Layout İlk Deneme");
		
		
		setSize(500,400);
		setLayout(new BorderLayout());
		
		JButton b=new JButton("üst button");
		add(b,BorderLayout.NORTH);
		 b=new JButton("alt button");
		add(b,BorderLayout.SOUTH);
		 b=new JButton("SAĞ button");
			add(b,BorderLayout.EAST);
			 b=new JButton("SOL button");
				add(b,BorderLayout.WEST);
	}
	public static void main(String[] args) {
		
		new BorderLayoutDemo().setVisible(true);
		
	}

}
