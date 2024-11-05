// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;


import frc.robot.subsystems.TankDrive;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class EStop extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private TankDrive m_stop;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public EStop(TankDrive e_stop) {
    this.m_stop = e_stop;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(e_stop);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_stop.e_stop();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

