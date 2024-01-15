package ex.ex07;

import javax.swing.*;

public class MyFrameEx01 {
    static int num = 1;
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300,500);

        JButton btn1 = new JButton("add");
        JButton btn2 = new JButton("minus");
        JLabel la1 = new JLabel(num + "");
        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center",la1);

        btn1.addActionListener(e -> {
            num++;
            la1.setText(num+" ");
        });
        btn2.addActionListener(e -> {
            num--;
            if (num<0){
                num = 0;
            }
            la1.setText(num+" ");
        });
        jf.setVisible(true);
    }
}
