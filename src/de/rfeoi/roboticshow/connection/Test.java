package de.rfeoi.roboticshow.connection;


import de.fischertechnic.Dir;
import de.fischertechnic.Mot;

public class Test {
    public static void main(String[] args){
        RoboticsConnector roboticsConnector = new RoboticsConnector();
        roboticsConnector.connect("COM1");
        roboticsConnector.setSpeed(8);
        roboticsConnector.toggleMotor(Mot.M1, Dir.Left);
        while(true);
    }
}
