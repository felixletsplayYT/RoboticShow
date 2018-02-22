package de.rfeoi.roboticshow.connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Content extends JPanel {
    JButton numberOne = new JButton("Knopf 1");
    JButton numberTwo = new JButton("Knopf 2");
    JButton numberThree = new JButton("Knopf 3");

    JLabel labelOne = new JLabel("Label 1");
    JLabel labelTwo = new JLabel("Label 2");
    JLabel labelThree = new JLabel("Label 3");



    public void preStart(){
        System.out.print("Content preStart;   ");
        this.setLayout(new GridLayout(3,2, 10, 10));
    }

    public void start(){
        System.out.println("Content Start;   ");
        this.add(numberOne);
        this.add(labelOne);
        this.add(numberTwo);
        this.add(labelTwo);
        this.add(numberThree);
        this.add(labelThree);
        numberOne.addActionListener(actionListener);
        numberTwo.addActionListener(actionListener);
        numberThree.addActionListener(actionListener);
    }

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(e.getSource() instanceof JButton)) return;
            JButton button = (JButton) e.getSource();

            if(button == numberOne){
                labelOne.setText("Button 1");
            }
            if(button == numberTwo){
                labelTwo.setText("Button 2");
            }
            if(button == numberThree){
                labelThree.setText("Button 3");
            }
        }
    };
}
