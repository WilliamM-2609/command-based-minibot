package frc.robot.commands;

import frc.robot.subsystems.Led;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class GreenLed extends Command {

  private final Led led;

  /**
   * Creates a new RainbowLed.
   *
   * @param RedLed The subsystem used by this command.
   */
  public GreenLed(Led GreenLed) {
    this.led = GreenLed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(GreenLed);
  }

  @Override
  public void execute() {
    led.green();
  }

  public boolean isFinished() {
    return false;
  }
}

