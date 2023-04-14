// package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField p;
    JButton btn;

    Login() {
        Container cn = getContentPane();
        cn.setLayout(null);

        l1 = new JLabel("Username : ");
        l1.setBounds(20, 60, 100, 40);
        t1 = new JTextField();
        t1.setBounds(130, 60, 200, 50);

        l2 = new JLabel("Password : ");
        l2.setBounds(20, 120, 100, 40);
        p = new JPasswordField();
        p.setBounds(130, 120, 200, 50);

        btn = new JButton("Login");
        btn.setBounds(165, 200, 80, 40);
        btn.addActionListener(this);

        cn.add(l1);
        cn.add(t1);
        cn.add(l2);
        cn.add(p);
        cn.add(btn);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println("Hello button is working");
    }

    public static void main(String ar[]) {
        new Login();
    }
}
