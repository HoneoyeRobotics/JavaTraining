/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Arms extends Subsystem { 
  private WPI_VictorSPX elbowMotor;
  private WPI_VictorSPX leftArmWheelMotor;
  private WPI_VictorSPX rightArmWheelMotor;
  private SpeedControllerGroup armWheelMotors;
  private DigitalInput armPositionLimitSwitch;
  

public Arms(){
  elbowMotor = new WPI_VictorSPX(RobotMap.elbowMotorCanID);
  leftArmWheelMotor = new WPI_VictorSPX(RobotMap.leftArmWheelCanID);
  rightArmWheelMotor = new WPI_VictorSPX(RobotMap.rightArmWheelCanID);
  armWheelMotors = new SpeedControllerGroup(leftArmWheelMotor,rightArmWheelMotor);
  armPositionLimitSwitch = new DigitalInput(RobotMap.armLimitSwitchDIO);
}




  

  public void moveArms(double speed) {
  elbowMotor.set(speed);
  }
 

public void runArmWheels(double speed){
  leftArmWheelMotor.set(speed);
  rightArmWheelMotor.set(speed);
}
 

@Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}


