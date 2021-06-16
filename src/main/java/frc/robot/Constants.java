// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static class Controls{
        //Drive controls
        public static final Hand DRIVE = Hand.kLeft;
    }//end of Controls class
    //USB ids
    public static final int DRIVER = 0;

    // CANbus ids
    public static final int FRONT_LEFT_DRIVE = 31;//check what the PDP uses
    public static final int FRONT_RIGHT_DRIVE = 30;
    public static final int INTAKE = 32;
    public static final int SHOOTER = 33;

    // DriveBase




   public static final double CONTROL_DEADBAND = 0.10;


   public static final int SENSOR_UNITS_PER_ROTATION = 2048;


   public static final int ENCODER_UNITS_PER_ROTATION = 24140;


   public static final int ACCEL_UNITS = 473000;


   public static final int DECEL_UNITS = ACCEL_UNITS;











// Intake




   public static final double INTAKE_SPEED = 0.2;


   public static final double BALL_RELEASE_TIME = 0.1;











// Shooter




   public static final double SHOOTER_P = 0.0003;


   public static final double SHOOTER_FF = 0.00019;


   public static final double RPM_STABILITY_ERROR = 25;






    
}//end of Constants class - don't put code after this!
