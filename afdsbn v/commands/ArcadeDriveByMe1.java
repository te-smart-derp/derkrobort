// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDriveByMe1 extends CommandBase {
  private final Drivetrain m_drivetrain;
  private Supplier<Boolean> m_speedSwitch;
  private final Supplier<Double> m_xaxisSpeedSupplier;
  private final Supplier<Double> m_zaxisRotateSupplier;
  private final Supplier<Double> m_yaxisGrowASupplier;
  private final Supplier<Double> m_yaxisGrowBSupplier;


  /** Creates a new ArcadeDriveByMe. */
  public ArcadeDriveByMe1(
      Drivetrain drivetrain,
      Supplier<Double> xaxisSpeedSupplier,
      Supplier<Double> zaxisRotateSupplier,
      Supplier<Double> yaxisGrowASupplier,
      Supplier<Double> yaxisGrowBSupplier,
      Supplier<Boolean> speedSwitch)
{
    m_drivetrain = drivetrain;
    m_xaxisSpeedSupplier = xaxisSpeedSupplier;
    m_zaxisRotateSupplier = zaxisRotateSupplier;
    m_yaxisGrowASupplier = yaxisGrowASupplier;
    m_yaxisGrowBSupplier = yaxisGrowBSupplier;
    m_speedSwitch = speedSwitch;
    addRequirements(drivetrain);
    // Pictures
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // public ArcadeDriveByMe1(Drivetrain m_drivetrain2, Object speedSwitch, Supplier<Double> xaxisSpeedSupplier,
      // Supplier<Double> zaxisRotateSupplier, Supplier<Double> yaxisGrowASupplier, Supplier<Double> yaxisGrowBSupplier) {
  // }

  // public ArcadeDriveByMe1(Drivetrain m_drivetrain2, Supplier<Double> xaxisSpeedSupplier,
  //     Supplier<Double> zaxisRotateSupplier, Supplier<Double> yaxisGrowASupplier, Supplier<Double> yaxisGrowBSupplier, Supplier<Boolean> speedSwitch) {
  // }

   // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  // image.png
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  //   if (m_speedSwitch != null){
  //   m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get() / 2 , m_zaxisRotateSupplier.get() / 2);
  // }
  // else{
  //   m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
  // }
  if (m_speedSwitch != null){
    // if (m_speedSwitch = true){
    m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get() / 2, m_zaxisRotateSupplier.get() / 2);
    m_drivetrain.arcadeDrive(m_yaxisGrowASupplier.get() / 2, m_yaxisGrowASupplier.get() / 2);
  }
  else{
    m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
    m_drivetrain.arcadeDrive(m_yaxisGrowASupplier.get(), m_yaxisGrowBSupplier.get());
//  }
    // m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get() / 2, m_zaxisRotateSupplier.get());
  }
  // else{
    // m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
    // m_drivetrain.arcadeDrive(m_yaxisGrowASupplier.get(), m_yaxisGrowBSupplier.get());
  // }
    // m_drivetrain.arcadeDrive(m_yaxisGrowASupplier.get(),m_yaxisGrowBSupplier.get());
  // }
  
 }

  // Called once the command ends or is interrupted.
  @Override
  // m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
// }

  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
