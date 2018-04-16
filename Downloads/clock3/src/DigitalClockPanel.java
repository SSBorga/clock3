
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.Calendar;
import javax.swing.JLabel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUDHIR
 */
public class DigitalClockPanel extends ClockPanel {
 
    
    Model model;
    JPanel panel = new JPanel();
    JLabel label = new JLabel();

    public DigitalClockPanel(Model m1) {
        super(m1);
    }  @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        JTextField timeF =new JTextField(10);
    
        label.setFont(new Font("Arial",Font.PLAIN,48));
        panel.add(label);
        add(panel);
        Timer t =new Timer(1000,new Listener());
        t.start();
}

   
    class Listener implements ActionListener{
            
            public void actionPerformed(ActionEvent e) {
                Calendar rightnow = Calendar.getInstance();
                int hour = rightnow.get(Calendar.HOUR_OF_DAY);
                int min = rightnow.get(Calendar.MINUTE); 
                int sec = rightnow.get(Calendar.SECOND);
              label .setText(hour+":"+min+":"+sec);
}
}
}

            
