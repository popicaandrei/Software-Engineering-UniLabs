package Ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OpenFile extends  JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    OpenFile(){

        button = new JButton();
        textField = new JTextField();

        setTitle("Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
        setVisible(true);


        button.setText("Press for reading!");
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

        String file = textField.getText();
         try{

             FileReader read = new FileReader("src/Ex3/" + file);
             FileWriter wr = new FileWriter("src/Ex3/output.txt");
             int i;
             while((i = read.read())!=-1){
                 System.out.println((char)i);
                 wr.write(i);
             }

             read.close();
             wr.close();
         }catch (IOException e1){e1.printStackTrace();}
    }

    public static void main(String[] args) {
        new OpenFile();
    }

}
