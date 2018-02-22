package de.rfeoi.roboticshow.connection;

import javax.swing.*;
import java.awt.*;

public class Service {
    public JFrame frame;
    public int maxWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    private double size,widthDouble,heightDouble;
    private int width, height;
    Content content = new Content();

    public void preStart(){
        System.out.print("preStart;   ");
        size = 1.6;
        widthDouble = maxWidth/(3*3);
        widthDouble = widthDouble*size;
        heightDouble = maxWidth/(2*3);
        heightDouble = heightDouble*size;
        width = (int) widthDouble;
        height = (int) heightDouble;
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(width,height));
        frame.setBackground(new Color(255, 255, 255));
        frame.setLocationRelativeTo(null);
        start();
    }

    public void start(){
        System.out.print("Start;   ");
        content.preStart();
        content.start();
        frame.setContentPane(content);
        frame.setVisible(false);
        frame.setVisible(true);
        frame.setTitle("Robo Pro");
    }
}
