package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;
import frc.robot.utils.Xbox;

public class Buttons {

  //////////////////////////////////////////////////////////////////////////////
  // Driver
  Joystick driverControl = new Joystick(0);
  int swerveForward = Xbox.LEFT_STICK_Y;
  int swerveStrafe = Xbox.LEFT_STICK_X;
  int swerveRotation = Xbox.RIGHT_STICK_X;
  //JoystickButton driverEnableClimber = new JoystickButton(driverControl, PS4.PS4);
  JoystickButton resetOdometry = new JoystickButton(driverControl, Xbox.OPTIONS);
  JoystickButton slowDrive = new JoystickButton(driverControl, Xbox.R2);

  //JoystickButton slowDrive = new JoystickButton(driverControl, PS4.R2);

  int lt = 2;
  int rt = 3;
  Button slowDrive = new Button(() -> driverControl.getRawAxis(lt) > 0.1);

  //Operator
  Joystick operatorControl = new Joystick(1);

  Button lowShootNew = new Button(() -> operatorControl.getRawAxis(rt) > 0.1); //rt
  Button feedInFireNew = new Button(() -> operatorControl.getRawAxis(lt) > 0.1); //lt

  JoystickButton hubSpinUp = new JoystickButton(operatorControl, Xbox.R1);

  //JoystickButton lowShoot = new JoystickButton(operatorControl, PS4.R2);
  JoystickButton toggleElevator = new JoystickButton(operatorControl, Xbox.L1);
  JoystickButton feedInFire = new JoystickButton(operatorControl, Xbox.L2);
  JoystickButton autoShoot = new JoystickButton(operatorControl, Xbox.SQUARE);
  JoystickButton autoShootOne = new JoystickButton(operatorControl, Xbox.R_STICK);

  JoystickButton toggleIntake = new JoystickButton(operatorControl, Xbox.CIRCLE);
  JoystickButton intake = new JoystickButton(operatorControl, Xbox.TRIANGLE);
  JoystickButton outtake = new JoystickButton(operatorControl, Xbox.CROSS);

  //JoystickButton operatorEnableClimber = new JoystickButton(operatorControl, PS4.PS4);
  //JoystickButton climbAuto = new JoystickButton(operatorControl, PS4.TRACKPAD);
  //JoystickButton resetClimbStuff = new JoystickButton(operatorControl, PS4.OPTIONS);

  JoystickButton autoClimbStopLeft = new JoystickButton(operatorControl, Xbox.L2);
  JoystickButton autoClimbStopRight = new JoystickButton(operatorControl, Xbox.R2);

  JoystickButton rgb = new JoystickButton(operatorControl, Xbox.SHARE);

  POVButton elevatorRetract = new POVButton(operatorControl, 180); // DPAD down
  POVButton elevatorExtend = new POVButton(operatorControl, 0); // DPAD up
}
