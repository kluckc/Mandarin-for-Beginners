
package mandarin.pkgfor.beginners;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class SwingPaint {

  JButton blackBtn, clearBtn;
  CharacterCanvas drawArea;
  ActionListener actionListener = new ActionListener() {
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == blackBtn) {
        drawArea.black();
      } else if (e.getSource() == clearBtn) {
        drawArea.clear();
      }
    }
  };
 
  public static void main(String[] args) {
    new SwingPaint().show();
  }
 
  public void show() {
    // create main frame
    JFrame frame = new JFrame("Character Canvas");
    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    // create draw area
    drawArea = new CharacterCanvas();
 
    // add to content pane
    content.add(drawArea, BorderLayout.CENTER);
 
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
 
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    blackBtn = new JButton("Black");
    blackBtn.addActionListener(actionListener);
    
    
    controls.add(clearBtn);
    content.add(controls, BorderLayout.NORTH);
 
    frame.setSize(1000, 800);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // show the swing paint result
    frame.setVisible(true);
  }
 
}
  