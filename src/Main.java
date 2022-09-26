import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("SNS창 따라만들기");
        f.setSize(700,500);
        f.add(new JLabel("친구 목록"));
        f.setLayout(new BorderLayout());
        f.add("North", new JLabel("sns창 이름이 들어가야하는 창일듯"));
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 1));

        JButton b = new JButton();
        b.setText("친구1");
        b.setPreferredSize(new Dimension(100, 100));

        JButton b1 = new JButton();
        b1.setText("친구2");
        b1.setPreferredSize(new Dimension(100, 100));
        p.add(b);
        p.add(b1);
        Container co = f.getContentPane();
        co.add(p,BorderLayout.WEST);

        f.add("Center", new JButton("mid"));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        System.out.println("swing 구동 완료");
    }
}