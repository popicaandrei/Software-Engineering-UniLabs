package Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    private int counter;

    Counter() {

          button = new JButton();
          textField = new JTextField();

          setTitle("Counter");
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          setSize(400,500);
          setVisible(true);
          counter=0;

          button.setText("Press for adding!");
          button.setVisible(true);
          button.setBounds(100,200,150,70);
          textField.setVisible(true);
          textField.setBounds(100,70,150,70);

          button.addActionListener(this::actionPerformed);

          setLayout(null);
          add(textField);
          add(button);
    }


    public void actionPerformed(ActionEvent e){
        counter++;
        textField.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new Counter();
    }
}
