/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.tankDriver;

/**
 * Add your docs here.
 * boop testing for charlie
 */
public class driveTrainSS extends Subsystem {
  private TalonSRX motorLeft1 = new TalonSRX(RobotMap.motorIDLeft1);
  private Victor motorLeft2 = new Victor(RobotMap.motorIDLeft2);
  private TalonSRX motorRight1 = new TalonSRX(RobotMap.motorIDRight1);
  private Victor motorRight2 = new Victor(RobotMap.motorIDRight2);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new tankDriver());
  }

  public void setLeftMotors(double speed) {
    motorLeft1.set(ControlMode.PercentOutput, -speed);
    motorLeft2.set( -speed);
  }

  public void setRightMotors(double speed) {
    motorRight1.set(ControlMode.PercentOutput, speed);
    motorRight2.set(speed);
  }
}
