/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // declare IDs for our arm subsystem
  public static final int elbowMotorCanID = 7;
  public static final int leftArmWheelCanID = 9;
  public static final int rightArmWheelCanID = 10;  
  public static final int armElbowEncoderAChannelDIO = 0;
  public static final int armElbowEncoderBChannelDIO = 0;
  public static final int armLimitSwitchDIO = 2;

  
  //declare Ids for our drivetrain subsystem
  public static final int frontLeftDriveMotorCanID = 1;
  public static final int rearLeftDriveMotorCanID = 2;
  public static final int frontRightDriveMotorCanID = 3;
  public static final int rearRightDriveMotorCanID = 4;
}
