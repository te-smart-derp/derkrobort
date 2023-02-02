// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.qaoienieotgrh;



// import java.beans.EventSetDescriptor;
// import java.io.ObjectInputStream.GetField;
// import java.lang.reflect.Parameter;

// import javax.xml.datatype.DatatypeConstants.Field;

// import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class trunOff1 extends CommandBase {
  // Field gyroF1Field;
  /** Creates a new trunOff1. */
  //public trunOff1() {
    // Use addRequirements() here to declare subsystem dependencies.
  //}
  // public EventSetDescriptor  trun1;
  // public boolean Gyro1,
  // m_Gyro1 = Gyro1;
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  // Gyro1 = true;
  // GetField gyroF1Field;
  // Field gyroF1Field = 1;
  
  // addRequirements(m_trunOff1);
  }
    // Parameter  gyro1Parameter;
    // Parameter  gyro2Parameter;
    // Field gyroF1Field;
    public <Gyro1> boolean Turn1(boolean Gyro1 ){
      //  GetField gyroF1Field;
      Gyro1 = true;
       System.out.print("nothing");
    return Gyro1;
    }
  // Gyro1
   
  // Sendable gyro1Sendable;
  // public void setgyro1Sendable(Sendable gyro1Sendable) {
      // this.gyro1Sendable = gyro1Sendable;
      // setgyro1Sendable(gyro1Sendable);
  // }

  //public Command getAutonomousDistance.javaCommand(){
  //return new
  //        
  //}
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
//  Turn1();
  // Method trunMethod1(){
 // Gyro1 = false;
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
