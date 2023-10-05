import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Calc implements ActionListener {
    private JTextField t1, t2, t3, res1, res2;

    public Calc(JTextField t1, JTextField t2, JTextField t3, JTextField res1, JTextField res2) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.res1 = res1;
        this.res2 = res2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String r1="";
            String r2= "";

            String substr1 = t1.getText();
            String substr2 = t2.getText();
            String strtest = t3.getText();
            String[] str = strtest.split(" ");
            System.out.print(Arrays.toString(str));

            if (!Str.j1.isSelected()) {
                int n = str.length;
                QuickSort<String> c1 = new QuickSort<>();

                for (int i = 0; i < n; i++) {
                    System.out.print(str[i] + "; ");
                }

                c1.sort(str, new StrComparator1(substr1, substr2));
                for (String s : str) {

                  r1 += s + " ";
                }


                c1.sort(str, new StrComparator2());
                for (String s : str) {
                    r2 += s + " ";
                }

                System.out.println(r1);

            } else {

                int n = str.length;

                SelectionSort<String> c2 = new SelectionSort<>();
                for (int i = 0; i < n; i++) {
                    System.out.print(str[i] + "; ");
                }

                c2.sort(str, new StrComparator1(substr1, substr2));
                for (String s : str) {
                    r1 += s + " ";
                }

                c2.sort(str, new StrComparator2());
                for (String s : str) {
                    r2+= s + " ";
                }

                System.out.println(r1);
            }



            res1.setText(String.valueOf(r1));

            res2.setText(String.valueOf(r2));
            //JOptionPane.showMessageDialog(null, result);

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "ОШИБКА!!!");
        }
    }
}
