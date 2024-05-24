import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PEnerge extends JFrame {

    JTextField F;
    JTextField S;

    public PEnerge() {

        super("Вираховування потенціальної енергії води");
        super.setBounds(700, 300, 450, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cont = super.getContentPane();
        cont.setLayout(new GridLayout(5, 2, 5, 5));

        JLabel sr = new JLabel("Введіть велечину s= ");
        S = new JTextField(2);
        JLabel fr = new JLabel("Введіть велечину f= ");
        F = new JTextField(2);

        cont.add(sr);
        cont.add(S);
        cont.add(fr);
        cont.add(F);

        JButton butt = new JButton("Порахувати");

        cont.add(butt);

        butt.addActionListener(new Button_());
    }

    class Button_ implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double f = Double.parseDouble(F.getText());
                double s = Double.parseDouble(S.getText());
                double result = s * f;
                JOptionPane.showMessageDialog(null, "Результат: " + result + " Дж");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Введіть коректне число.");
            }
        }
    }
}


