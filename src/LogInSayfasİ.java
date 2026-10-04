import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogInSayfasİ extends JFrame {

	public LogInSayfasİ() {
		// STEP 1: BİLEŞENLERİ OLUŞTUR
		JLabel baslik= new JLabel("lütfen giriş yapınız");
		JLabel isimEtiketi= new JLabel("isim: ");
		JLabel sifreEtiketi= new JLabel("sifre: ");
		
		JTextField isimInput= new JTextField();
		JTextField sifreInput= new JTextField();
	//STEP 2: KONTEYNER

		JPanel panel = new JPanel();
		
		// STEP 3: duzen yönetimi
		panel.setLayout(new GridLayout(2,2));
		panel.add(isimEtiketi);
		panel.add(isimInput);
		panel.add(sifreEtiketi);
		panel.add(sifreInput);
		
		setLayout(new BorderLayout());
		add(baslik,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		add(new JPanel(),BorderLayout.SOUTH);
		add(new JPanel(),BorderLayout.EAST);
		add(new JPanel(),BorderLayout.WEST);
	}
	
	public static void main(String[] args) {
		new LogInSayfasİ().setVisible(true);

	}

}
