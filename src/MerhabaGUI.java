import java.awt.Color;

import javax.swing.*;

public class MerhabaGUI {

	public static void main(String[] args) {
		System.out.println("İlk GUI projemiz başlıyor.");
		JFrame f= new JFrame("Merhaba GUI");
		f.setSize(300,300);
		f.getContentPane().setBackground(Color.RED);
		
		JPanel p=new JPanel();
		p.setOpaque(false);
		JButton b=new JButton("TIKLA");
		
		p.add(b);
		f.add(p);
		f.setVisible(true);
		System.out.println("İlk GUI projemiz bitti.");
	}

}
