import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numbers extends JFrame {

 JTextField number1;
 JTextField number2;
 JTextField number3;



 public Numbers() {

  super.setBounds(200, 100, 300, 230);
  super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  Container container = super.getContentPane();
  container.setLayout(new GridLayout(5, 2, 2, 10));

  JLabel a = new JLabel("Введите число a");
  number1 = new JTextField("", 1);

  JLabel b = new JLabel("ведите число b");
  number2 = new JTextField("", 1);

  JLabel c = new JLabel("Введите число c");
  number3 = new JTextField("", 1);



  container.add(a);
  container.add(number1);
  container.add(b);
  container.add(number2);
  container.add(c);
  container.add(number3);



  JButton sendbutton = new JButton("Вычислить?");

  container.add(sendbutton);

  sendbutton.addActionListener(new CommandAction());
 }
 class CommandAction implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
   try {
    Double a = Double.parseDouble(number1.getText());
    Double b = Double.parseDouble(number2.getText());
    Double c = Double.parseDouble(number3.getText());
    Double s = (a + b + c) / (a * b * c);
    if (a == 0 || b == 0 || c == 0) {
     JOptionPane.showMessageDialog(null, "ОШИБКА!!!");
    } else {
     String res = ""+ s;
     JOptionPane.showMessageDialog(null, res);
    }
    //не может преобразовать строку в число(нужный тип данных)...непроверенное исключение;
   } catch (NumberFormatException exception) {
    JOptionPane.showMessageDialog(null, "ОШИБКА!!!");
   }
  }
 }
}
















