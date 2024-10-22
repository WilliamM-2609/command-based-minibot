package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class RedLed extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param RedLed The subsystem used by this command.
   */
  public RedLed(Led RedLed) {
    this.led = RedLed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RedLed);
  }

  @Override
  public void execute() {
    led.red();
  }

  public boolean isFinished() {
    return true;
  }
}

