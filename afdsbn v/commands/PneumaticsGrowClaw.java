package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;
// import frc.robot.commands.regular.ArcadeDriveByMe1;
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

public class PneumaticsGrowClaw extends CommandBase {
  private final Pneumatics m_pneumatics;
  private final Drivetrain m_drivetrain;
  private final int m_growth;

  /**
   * Creates a new DriveDistance. This command will drive your your robot for a desired distance at
   * a desired speed.
   *
   * @param speed The speed at which the robot will drive
   * @param inches The number of inches the robot will drive
   * @param drive The drivetrain subsystem on which this command will run
   */
  public PneumaticsGrowClaw(Pneumatics pneumatics, Drivetrain drivetrain, int growth) {
    m_pneumatics = pneumatics;
    m_drivetrain = drivetrain;
    m_growth = growth;
    // public void claw;
    addRequirements(drivetrain, pneumatics);
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
    m_drivetrain.m_claw(m_growth);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.m_claw(0);
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
//afsdhas;jdf;sjfdklsjdf;lajfl;djsfl;fdasjfl;sadjfdskljfljaslfdjasl;dfja;fjsds;lkfj;lasjfdl;sajfl;asjfdljsdlasjfdlsjksaljdfal;fjdal;sfdjalfds;jfld;sjf;alsfjl;dsjsad;ljalds;jfal;jf;jasl;fjalsdjflasjfljsadlfjasldfjal;sfdj;alfjalaj;al;jfl;afjldfjasldfkjalfdjsfdlajfa;ljaf;lasjf;alfjld;fjal;dfjalds;fjla;fjal;fjal;fjafjl;fajal;sjfdl;ajl;fdjal;fjl;jasl;dfjal;fdjlj
//dsuhnaeshgaehga/ep;hnp;rfujaeraohnewgfnaorgjae/aeil;rghnae;ougrhnaq/;aehgrhv/;airephy;gphye;/.gvra/; grvaegv;hnae;.g hnae/gv;7u hnae/.;hytgip;etgp;i7hyree8ipheaip;rhtype;8irehyfetfa.;erphtyaerphgfiarehyei.zdshyrgaie 
//aerhgfeao'igvja"otrehgojrsva'OEPIJrgv'iajsfvebtg'oikaefv'goijasefvijmaeotgr'ihjnae'oitrg]oqitge['o0iegvao9hg['arwjhg['arwjth[;'trhgi4p;wtghnqwpt5hu9p48hyq9pr8e9tgqp3utrq9ppppppppgfcy4qhep9t5qwy43]]q3'ujtfcqaqaj4w"igj{"g jmaw4[o0 gvae?P' jgm'wa4epoigh'ojwst4ehwjq[4308ut5itgwT%_HG%R
// // 0hty40hy
// 8064jhy
// ?"
// ?|"#4?
// 6
// ?
// "45

// ?7?Y?"
// "}hnhtre