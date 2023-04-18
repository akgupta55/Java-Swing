import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Calci extends JFrame implements ActionListener {

	JTextField tf1;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

	public static void main(String aft[]) {
		new Calci();
	}

	public void actionPerformed(ActionEvent ae) {
		String s = tf1.getText();
		if (ae.getSource().equals(b5)) {
			tf1.setText(s + b5.getText());
		} else if (ae.getSource().equals(b6)) {
			tf1.setText(s + b6.getText());
		} else if (ae.getSource().equals(b7)) {
			tf1.setText(s + b7.getText());
		} else if (ae.getSource().equals(b9)) {
			tf1.setText(s + b9.getText());
		} else if (ae.getSource().equals(b10)) {
			tf1.setText(s + b10.getText());
		} else if (ae.getSource().equals(b11)) {
			tf1.setText(s + b11.getText());
		} else if (ae.getSource().equals(b13)) {
			tf1.setText(s + b13.getText());
		} else if (ae.getSource().equals(b14)) {
			tf1.setText(s + b14.getText());
		} else if (ae.getSource().equals(b15)) {
			tf1.setText(s + b15.getText());
		} else if (ae.getSource().equals(b17)) {
			tf1.setText(s + b17.getText());
		} else if (ae.getSource().equals(b1)) {
			tf1.setText("0");
		}
	}

	Calci() {
		Container cn = getContentPane();
		cn.setLayout(null);

		tf1 = new JTextField();
		tf1.setBounds(50, 50, 282, 50);
		cn.add(tf1);
		// row 1
		b1 = new JButton("AC");
		b1.setBounds(50, 102, 70, 70);
		cn.add(b1);
		b1.addActionListener(this);
		b2 = new JButton("()");
		b2.setBounds(121, 102, 70, 70);
		cn.add(b2);
		b3 = new JButton("%");
		b3.setBounds(192, 102, 70, 70);
		cn.add(b3);
		b4 = new JButton("/");
		b4.setBounds(262, 102, 70, 70);
		cn.add(b4);
		// row 2
		b5 = new JButton("7");
		b5.setBounds(50, 173, 70, 70);
		cn.add(b5);
		b5.addActionListener(this);
		b6 = new JButton("8");
		b6.setBounds(121, 173, 70, 70);
		cn.add(b6);
		b6.addActionListener(this);
		b7 = new JButton("9");
		b7.setBounds(192, 173, 70, 70);
		cn.add(b7);
		b7.addActionListener(this);
		b8 = new JButton("*");
		b8.setBounds(262, 173, 70, 70);
		cn.add(b8);
		// row 3
		b9 = new JButton("4");
		b9.setBounds(50, 243, 70, 70);
		cn.add(b9);
		b9.addActionListener(this);
		b10 = new JButton("5");
		b10.setBounds(121, 243, 70, 70);
		cn.add(b10);
		b10.addActionListener(this);
		b11 = new JButton("6");
		b11.setBounds(192, 243, 70, 70);
		cn.add(b11);
		b11.addActionListener(this);
		b12 = new JButton("-");
		b12.setBounds(262, 243, 70, 70);
		cn.add(b12);
		// row 4
		b13 = new JButton("1");
		b13.setBounds(50, 314, 70, 70);
		cn.add(b13);
		b13.addActionListener(this);
		b14 = new JButton("2");
		b14.setBounds(121, 314, 70, 70);
		cn.add(b14);
		b14.addActionListener(this);
		b15 = new JButton("3");
		b15.setBounds(192, 314, 70, 70);
		cn.add(b15);
		b15.addActionListener(this);
		b16 = new JButton("+");
		b16.setBounds(262, 314, 70, 70);
		cn.add(b16);
		// row 5
		b17 = new JButton("0");
		b17.setBounds(50, 385, 70, 70);
		cn.add(b17);
		b17.addActionListener(this);
		b18 = new JButton(".");
		b18.setBounds(121, 385, 70, 70);
		cn.add(b18);
		b19 = new JButton("X");
		b19.setBounds(192, 385, 70, 70);
		cn.add(b19);
		b20 = new JButton("=");
		b20.setBounds(262, 385, 70, 70);
		cn.add(b20);

		setSize(600, 600);
		setVisible(true);

	}

}