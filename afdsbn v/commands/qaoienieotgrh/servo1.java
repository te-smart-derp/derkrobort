// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.qaoienieotgrh;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;



public class servo1 extends CommandBase {
  private final Drivetrain m_drivetrain;
  /** Creates a new servo2. */
  public servo1(Drivetrain drivetrain) {    
    m_drivetrain = drivetrain;
    addRequirements(drivetrain);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {


    execute();
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.servo(90);
    m_drivetrain.rightMotor(0.75);
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

/**package frc.robot.commands;
*
*import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import java.util.function.Supplier;
import org.ejml.equation.Variable;
*
*
*
*
*public class servo1 extends CommandBase {
*  /** Creates a new servo1. */
/* 
*  public servo1() 
*  {
*     Supplier<Double> servo1;
*    Public servo1 (Drivetrain, servo, Supplier<Double> ) {
*    M_drivetrain.rightMotor = Drivetrain;
*    addRequirements(Drivetrain);
*    }
*    M_drivetrain.rightMotor(1) ;
*    // Use addRequirements() here to declare subsystem dependencies.
  }

  public servo1(Drivetrain m_drivetrainDrivetrain) {
}


// Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}**/