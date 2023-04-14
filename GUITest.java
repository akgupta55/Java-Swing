// package prSwing;

import java.awt.*;
import javax.swing.*;

class GUITest extends JFrame {
	public static void main(String aft[]) {
		new GUITest();

	}

	GUITest() {
		Container cn = getContentPane();
		cn.setLayout(null);
		JLabel l1 = new JLabel("Enter First name");
		l1.setBounds(20, 60, 150, 40);
		cn.add(l1);
		JLabel l2 = new JLabel("Enter Second name");
		l2.setBounds(20, 120, 150, 40);
		cn.add(l2);
		JTextField tf1 = new JTextField();
		tf1.setBounds(190, 60, 200, 40);
		cn.add(tf1);
		JTextField tf2 = new JTextField();
		tf2.setBounds(190, 120, 200, 40);
		cn.add(tf2);
		JButton b1 = new JButton("Click Me");
		b1.setBounds(90, 190, 100, 40);
		cn.add(b1);
		setSize(600, 600);
		setVisible(true);

	}

}