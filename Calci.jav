import java.awt.*;
import javax.swing.*;

class Calci extends JFrame {
	public static void main(String aft[]) {
		new Calci();

	}

	Calci() {
		Container cn = getContentPane();
		cn.setLayout(null);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(190, 60, 200, 40);
		cn.add(tf1);
		
		setSize(600, 600);
		setVisible(true);

	}

}