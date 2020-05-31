package Ex6;

import javax.swing.*;

public class Win extends JFrame {
    private Object monitor;
    private JTextField tf;

    Win(Object monitor) {
        this.monitor = monitor;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        tf = new JTextField();
        tf.setBounds(10, 10, 280, 20);

        JButton startStop = new JButton("Start/Stop");
        startStop.setBounds(10, 40, 280, 20);
        startStop.addActionListener(e -> {
            synchronized (monitor) {
                monitor.notify();
            }
        });

        add(tf);
        add(startStop);
        setVisible(true);

    }

    public void updateTimer(long val) {
        tf.setText("" + val);
    }
}


