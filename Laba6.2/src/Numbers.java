import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numbers extends JFrame {

    JTextField number1;
    JTextField number2;


public Numbers() {

    super.setBounds(200, 100, 300, 230);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container container=super.getContentPane();
    container.setLayout(new GridLayout(5, 2, 2, 10));

    JLabel x= new JLabel("Введите число x");
    number1=new JTextField("", 1);

    JLabel q=new JLabel("Введите число q");
    number2=new JTextField("",1);


    container.add(x);
    container.add(number1);
    container.add(q);
    container.add(number2);

    JButton sendbutton=new JButton("Вычислить?");
    container.add(sendbutton);

   sendbutton.addActionListener(new ComandAction());
}
    class ComandAction implements ActionListener{

        public static double suma(double x,double q){
            double sum=1;
            int n=1;
            double f=2;
            while((Math.pow(x,2*n))/f>q) {
                if (n % 2 == 0)
                    sum += (Math.pow(x, 2 * n)/f);
                else
                    sum -= (Math.pow(x, 2 * n)/f);
                n++;
                f *= ((2 * n) - 1) * 2 * n;
            }
            return sum;
        }


    @Override
        public void  actionPerformed(ActionEvent e){
          try {
              Double x = Double.parseDouble(number1.getText());
              Double q = Double.parseDouble(number2.getText());

              if ( q <= 0) {
                  JOptionPane.showMessageDialog(null, "ОШИБКА!!!");
              } else {
                  double sum = suma(x, q);
                  String res = "" + sum;
                  String w = String.valueOf(Math.cos(x));
                  JOptionPane.showMessageDialog(null, res);
                  JOptionPane.showMessageDialog(null,w);
              }
          }catch(NumberFormatException exception){
              JOptionPane.showMessageDialog(null, "ОШИБКА!!!");
          }

    }

   }

}
