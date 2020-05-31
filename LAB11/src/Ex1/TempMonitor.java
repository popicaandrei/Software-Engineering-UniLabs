package Ex1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class TempMonitor extends JFrame implements Observer {

    JTextField textField = new JTextField();
    Sensor newTemp ;

    TempMonitor()
    {
        JFrame frame =new JFrame("Temperature Monitor");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        textField.setBounds(100,100,200,50);
        textField.setVisible(true);
        frame.add(textField);
    }

    @Override
    public void update(Observable observable, Object arg) {
        newTemp = (Sensor) observable;
        textField.setText(String.valueOf(newTemp.getTemp()));
    }

}
