
package mandarin.pkgfor.beginners;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;

// Drawable component

public class CharacterCanvas extends JComponent{
    //Canvas on which we draw upon
    private Image Canvas;
    //Graphics2D object used to draw on the canvas
    private Graphics2D g;
    //Mouse coordinates
    private int currentX, currentY, prevX, prevY;
    
    public CharacterCanvas(){
    setDoubleBuffered(false);
    addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                //saves previous coordinates when mouse is pressed
                prevX = e.getX();
                prevY = e.getY();
            }
                    });
    addMouseMotionListener(new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent e){
                //coordinate x y when mouse is dragged
                currentX = e.getX();
                currentY = e.getY();
                
                if(g != null){
                    //draw line when g is not null
                    g.drawLine(prevX, prevY, currentX, currentY);
                    //refresh draw area to repaint
                    repaint();
                    //saves current coordinates as previous coordinates
                    prevX = currentX;
                    prevY = currentY;
                }
            }
    });
    }
    
    protected void paintComponent(Graphics g2){
        if (Canvas==null){
        Canvas = createImage(getSize().width, getSize().height);
        g = (Graphics2D)Canvas.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        clear();
        }
   g2.drawImage(Canvas, 0, 0, null); 
    }
    public void clear(){
        g.setPaint(Color.white);
        g.fillRect(0, 0, getSize().width, getSize().height);
        g.setPaint(Color.black);
        repaint();
    }
    public void black(){
        g.setPaint(Color.black);
    }
}
