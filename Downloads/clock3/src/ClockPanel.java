
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUDHIR
 */
public class ClockPanel extends JPanel {
    Model model;
       public ClockPanel(Model m) {
        model = m;
        
       // setPreferredSize(new Dimension(200, 200));
        setBackground(Color.white);
    }
       public void paintComponent(Graphics g) {
        
           super.paintComponent(g);
        
       
        }
}

