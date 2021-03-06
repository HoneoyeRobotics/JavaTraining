/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.LowerArms;
import frc.robot.commands.RaiseArms;
import frc.robot.commands.SpitCube;
import frc.robot.commands.EatCube;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
 
  public static Joystick driverJoystick = new Joystick(0);

  public static JoystickButton driverButtonA = new JoystickButton(driverJoystick, 1);
  public static JoystickButton driverButtonB = new JoystickButton(driverJoystick, 2);
  public static JoystickButton driverButtonX = new JoystickButton(driverJoystick, 3);
  public static JoystickButton driverButtonY = new JoystickButton(driverJoystick, 4);
  

  public OI() {
    driverButtonA.whileHeld(new LowerArms());
    driverButtonB.whileHeld(new RaiseArms());
    driverButtonX.whileHeld(new EatCube());
    driverButtonY.whileHeld(new SpitCube());

  }

  
}
