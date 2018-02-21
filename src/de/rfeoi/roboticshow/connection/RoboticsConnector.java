package de.rfeoi.roboticshow.connection;

import de.fischertechnic.Dir;
import de.fischertechnic.FishFaceTX;
import de.fischertechnic.Mot;
import de.fischertechnic.Out;

import java.util.HashMap;

public class RoboticsConnector {
    private FishFaceTX fishFaceTX;
    private HashMap<String, Out> outputs;
    private HashMap<String, Mot> motor;
    private int speed;

    public RoboticsConnector(){
        fishFaceTX = new FishFaceTX();
    }

    public void addMotor(){

    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void toggleMotor(Mot mot, Dir direction){
        fishFaceTX.speedMotor(mot, direction, speed);
    }

    public void connect(String comName){
        fishFaceTX.openController(comName);
    }

}
