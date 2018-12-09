package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

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
    armWheelMotors = new SpeedControllerGroup(leftArmWheelMotor, rightArmWheelMotor);
    armPositionLimitSwitch = new DigitalInput(RobotMap.armLimitSwitchDIO);
  }

    public void raiseArms(double speed){
      if(armsAtTop())
        speed = 0;
      if(speed > 0)
        speed = speed * -1;
      elbowMotor.set(speed);
    }
    
    public void lowerArms(double speed){
      if(speed > 0)
        speed = speed * -1;
      elbowMotor.set(speed);
    }

    public void stop(){
      elbowMotor.set(0);
      armWheelMotors.set(0);
    }


  public void runArmWheels(double speed){
    leftArmWheelMotor.set(speed);
    rightArmWheelMotor.set(speed);
  }
  public boolean armsAtTop(){
    return armPositionLimitSwitch.get();
  }
  
    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
    }
}
