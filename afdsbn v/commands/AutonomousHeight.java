// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

// import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
// import frc.robot.commands.regular.PneumaticsGrowTilt;
public class AutonomousHeight extends SequentialCommandGroup {
  /** Creates a new AutonomousHeight. */
  public AutonomousHeight(Drivetrain drivetrain) {
    addCommands(
      new PneumaticsGrowClaw(null, drivetrain, 1),
      new PneumaticsGrowTilt(null, drivetrain, 1),
      new PneumaticsGrowWrist(null, drivetrain, 1),
      new PneumaticsGrowClaw(null, drivetrain, -1),
      new PneumaticsGrowTilt(null, drivetrain, -1),
      new PneumaticsGrowWrist(null, drivetrain, -1)
    );
    // Use addRequirements() here to declare subsystem dependencies.
  }
}
//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {}

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
