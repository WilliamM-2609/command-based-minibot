package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Led extends SubsystemBase {
  /** Creates a new ExampleSubsystem. **/

  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  
  public Led() {
    // Init variables here

    m_led = new AddressableLED(9);
    m_ledBuffer = new AddressableLEDBuffer(422);
    m_led.setLength(m_ledBuffer.getLength());

    m_led.setData(m_ledBuffer);
    m_led.start();
  }

  public void red() {
    // For every pixel

    for (var i = 0; i < m_ledBuffer.getLength(); i++) {
      m_ledBuffer.setHSV(i, 0, 255, 64);
    }
    m_led.setData(m_ledBuffer);
  }
  public void green() {
    // For every pixel

    for (var i = 0; i < m_ledBuffer.getLength(); i++) {
      m_ledBuffer.setHSV(i, 60, 255, 64);
    }
    m_led.setData(m_ledBuffer);
  }
}
