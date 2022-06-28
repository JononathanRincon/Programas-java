package generated.main;

import de.fhg.iais.roberta.runtime.*;
import de.fhg.iais.roberta.runtime.ev3.*;

import de.fhg.iais.roberta.mode.general.*;
import de.fhg.iais.roberta.mode.action.*;
import de.fhg.iais.roberta.mode.sensor.*;
import de.fhg.iais.roberta.mode.action.ev3.*;
import de.fhg.iais.roberta.mode.sensor.ev3.*;

import de.fhg.iais.roberta.components.*;

import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


import lejos.remote.nxt.NXTConnection;
public class SoftwareSimulacionRobot {
private static Configuration brickConfiguration;
    
    private Set<UsedSensor> usedSensors = new LinkedHashSet<UsedSensor>(Arrays.asList(new UsedSensor(SensorPort.S3, SensorType.COLOR, ColorSensorMode.COLOUR), new UsedSensor(SensorPort.S1, SensorType.TOUCH, TouchSensorMode.TOUCH)));
    private Hal hal = new Hal(brickConfiguration, usedSensors);
    
    public static void main(String[] args) {
        try {
             brickConfiguration = new EV3Configuration.Builder()
                .setWheelDiameter(5.6)
                .setTrackWidth(18.0)
                .addActor(ActorPort.B, new Actor(ActorType.LARGE, true, DriveDirection.FOREWARD, MotorSide.RIGHT))
                .addActor(ActorPort.C, new Actor(ActorType.LARGE, true, DriveDirection.FOREWARD, MotorSide.LEFT))
                .addSensor(SensorPort.S1, new Sensor(SensorType.TOUCH))
                .addSensor(SensorPort.S3, new Sensor(SensorType.COLOR))
                .build();
            
            new programaSimulacion().run();
        } catch ( Exception e ) {
            Hal.displayExceptionWaitForKeyPress(e);
        }
    }
    
    
    public void run() throws Exception {
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.BLUE ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.stopRegulatedDrive();
        hal.waitFor(10000);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.GREEN ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.RIGHT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.GREEN ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.RIGHT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.BLUE ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.stopRegulatedDrive();
        hal.waitFor(10000);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.YELLOW ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.LEFT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.GREEN ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.RIGHT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.YELLOW ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.LEFT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.YELLOW ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.rotateDirectionAngle(TurnDirection.LEFT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.BLUE ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.stopRegulatedDrive();
        hal.waitFor(10000);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.isPressed(SensorPort.S1) == true ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.driveDistance(DriveDirection.BACKWARD, 100, 20);
        hal.rotateDirectionAngle(TurnDirection.LEFT, 100, 90);
        hal.regulatedDrive(DriveDirection.FOREWARD, 100);
        while ( true ) {
            if ( hal.getColorSensorColour(SensorPort.S3) == PickColor.RED ) {
                break;
            }
            hal.waitFor(15);
        }
        hal.stopRegulatedDrive();
        hal.waitFor(1000);
    }
}
