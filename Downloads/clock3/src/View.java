
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Observer;
import java.util.Observable;

public class View implements Observer {

    AnalogueClockPanel panel1;

    public View(Model m1) {
        //all about creating frame
        JFrame frame = new JFrame();
        panel1 = new AnalogueClockPanel(m1);
        frame.setTitle("Java Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        //we need a container to display elements.
        Container pane = frame.getContentPane();
        // Now menubar
        JMenuBar menubar = new JMenuBar();
        JMenu menu1 =new JMenu("AnalogueClockFile.java");
        JMenu menu2 =new JMenu("DigitalClockFile.java");
        menubar.add(menu1);
          menubar.add(menu2);
          
        //add panell to the centre
          panel1.setPreferredSize(new Dimension(100, 50));
          pane.add(panel1, BorderLayout.CENTER);
        //adding buttons.This is header. 
        JButton button1 = new JButton("clock");
        pane.add(button1, BorderLayout.PAGE_START);

        JButton button2 = new JButton("Menu");
        pane.add(button2, BorderLayout.LINE_START);
       

       //This is about button which on click displays information.
        JButton aboutbutton = new JButton("about");
        pane.add(aboutbutton, BorderLayout.PAGE_END);
        
// add action to about button , onclick it will give all the information.
        aboutbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("clicked");
                frame2.setVisible(true);
                frame2.setSize(200, 200);
                JLabel statusLabel = new JLabel("all the information about views.");
                frame2.add(statusLabel);
            }
        });

//JButton button4 = new JButton("5 (LINE_END)");
//pane.add(button4, BorderLayout.LINE_END);
      

    }

    public void update(Observable o, Object arg) {
        panel1.repaint();
    }
}
