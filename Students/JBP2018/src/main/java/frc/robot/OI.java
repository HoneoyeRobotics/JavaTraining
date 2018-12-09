package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.EatCube;
import frc.robot.commands.LowerArms;
import frc.robot.commands.RaiseArms;
import frc.robot.commands.SpitCube;

public class OI {
  public static Joystick driverJoystick = new Joystick(0);

  public static JoystickButton driverButtonA = new JoystickButton(driverJoystick, 1);
  public static JoystickButton driverButtonB = new JoystickButton(driverJoystick, 2);
  public static JoystickButton driverButtonX = new JoystickButton(driverJoystick, 3);
  public static JoystickButton driverButtonY = new JoystickButton(driverJoystick, 4);

  public OI() {
    driverButtonA.whileHeld(new LowerArms());
    driverButtonB.whileHeld(new RaiseArms());
    driverButtonX.whileHeld(new SpitCube());
    driverButtonY.whileHeld(new EatCube());
  }
}
