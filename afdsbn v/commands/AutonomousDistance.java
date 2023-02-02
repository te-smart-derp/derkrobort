// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.commands.qaoienieotgrh.trun1;
import frc.robot.commands.qaoienieotgrh.trun2;
import frc.robot.commands.qaoienieotgrh.trunOff1;
import frc.robot.commands.qaoienieotgrh.trunOff2;
import frc.robot.subsystems.Drivetrain;

// import java.util.Set;

// import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   *  -m_controller.getRawButton(1), () -> 
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  // image.png
  public boolean turnvariable1;
  public boolean turnvariable2;
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new trun1(),
        new DriveDistance(-0.5, 10, drivetrain),
        new trunOff1(),
        
        new TurnDegrees(-0.5, 180, drivetrain),
        new trun2(),
  //      new turnVariableOn(),
        new DriveDistance(-0.5, 10, drivetrain),
        new trunOff2(),
        new TurnDegrees(0.5, 180, drivetrain));
  }
}
