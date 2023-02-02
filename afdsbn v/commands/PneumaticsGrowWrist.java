package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;
// import frc.robot.subsystems.pneumatics;

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

public class PneumaticsGrowWrist extends CommandBase {
  private final Pneumatics m_pneumatics;
  private final Drivetrain m_drivetrain;
  private final double m_growth;

  /**
   * Creates a new DriveDistance. This command will drive your your robot for a desired distance at
   * a desired speed.
   *
   * @param speed The speed at which the robot will drive
   * @param inches The number of inches the robot will drive
   * @param drive The drivetrain subsystem on which this command will run
   */
  public PneumaticsGrowWrist(Pneumatics pneumatics, Drivetrain drivetrain, double growth) {
    m_pneumatics = pneumatics;
    m_drivetrain = drivetrain;
    m_growth = growth;
    addRequirements(pneumatics, drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivetrain.ArcadeDrive(0, 0);
    m_drivetrain.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.m_wrist(m_growth);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.m_wrist(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // Compare distance travelled from start to desired distance
    return Math.abs(m_drivetrain.getAverageDistanceInch()) >= m_growth;
  }
}
 
// package frc.robot.commands;

// import edu.wpi.first.wpilibj2.command.CommandBase;

// public class PneumaticsGrow extends CommandBase {
//   /** Creates a new PneumaticsGrow. */
//   public PneumaticsGrow() {
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

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
