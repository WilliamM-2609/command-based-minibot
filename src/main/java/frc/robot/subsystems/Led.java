package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import java.lang.Math;

public class Led extends SubsystemBase {
  /** Creates a new ExampleSubsystem. **/

  private AddressableLED m_led;
  private AddressableLEDBuffer m_ledBuffer;
  private double index;
  
  public Led() {
    // Init variables here
    int length = 432;
    m_led = new AddressableLED(9);
    m_ledBuffer = new AddressableLEDBuffer(length); //265    m_led.setLength(m_ledBuffer.getLength());
    index = 0;
    m_led.setLength(m_ledBuffer.getLength());
    m_led.setData(m_ledBuffer);
    m_led.start();
  }

  public void red() {
    // For every pixel

    for (var i = 0; i < m_ledBuffer.getLength(); i++) {

      m_ledBuffer.setHSV(i, (int)(30*(((i+Math.floor(index)))%6)), 255, 64);
    }
    m_led.setData(m_ledBuffer);
    index += .075;
     
  }
  public void green() {
    // For every pixel

    for (var i = 0; i < m_ledBuffer.getLength(); i++) {
      if ((i+ Math.floor(index))%3 == 0){
        m_ledBuffer.setHSV(i, 136, 255, 32);
      } else if ((i+ Math.floor(index))%3 == 1){
        m_ledBuffer.setHSV(i, 101, 255, 32);
      } else {
        m_ledBuffer.setHSV(i, 0, 0, 32);
      }
      
    }
    m_led.setData(m_ledBuffer);
    index += .075;
  }
}
