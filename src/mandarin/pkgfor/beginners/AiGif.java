/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandarin.pkgfor.beginners;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AiGif extends JFrame {
    JPanel contentPane; //9
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public AiGif() {
        try {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(550, 550));
            // add the header label
            headerLabel.setFont(new java.awt.Font("Ai", Font.BOLD, 16));
            headerLabel.setText(" Ai Animated");
            contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
            // add the image label
            ImageIcon ii;
            ii = new ImageIcon("Character gifs\\ai.gif");
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
            // show it
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            
        } catch (Exception exception) {
        }
    }

    public static void main(String[] args) {
        new AiGif();
    }
}

