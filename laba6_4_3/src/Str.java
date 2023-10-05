import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

public class Str extends JFrame {

    JTextField s1;
    JTextField s2;
    JTextField s3;

    JTextField res1;
    JTextField res2;
    public int test1 = 1;
    ActionEvent e;
    public static JRadioButton j1 = new JRadioButton("Выбором", true);
    public static JRadioButton j2 = new JRadioButton("Быстрая", false);

    public Str() {

        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(8, 2, 2, 10));

        JLabel str1 = new JLabel("Подстрока1");
        s1 = new JTextField("", 1);

        JLabel str2 = new JLabel("Подстрока2");
        s2 = new JTextField("", 1);

        JLabel str3 = new JLabel("Ваша строка");
        s3 = new JTextField("", 1);

        JLabel result1 = new JLabel("По части строки:");
        res1 = new JTextField("", 1);
        JLabel result2 = new JLabel("по количеству маленьких букв:");
        res2 = new JTextField("", 1);
        container.add(str1);
        add(s1);

        container.add(str2);
        add(s2);

        container.add(str3);
        add(s3);
        container.add(result1);
        add(res1);
        container.add(result2);
        add(res2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(j1);
        bg.add(j2);
        j1.setBounds(50, 90, 85, 30);
        j2.setBounds(150, 90, 85, 30);

        JButton sendbutton = new JButton("Вычислить?");
        sendbutton.addActionListener(new Calc(s1, s2, s3, res1, res2));

        add(sendbutton);
        add(j1);
        add(j2);

    }


}










