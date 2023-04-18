import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;

class Calculator extends JFrame {
    JTextField t1;

    Calculator() {
        Container cn = getContentPane();
        cn.setLayout(null);
        t1 = t1.JTextField();
		t1.setBound(20,100,100,40);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
