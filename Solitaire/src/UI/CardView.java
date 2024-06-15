package UI;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class CardView extends JPanel {
    
    private Image image;


    public CardView(String imagePath)
    {
        this.image = new ImageIcon(imagePath).getImage();
        setPreferredSize(new Dimension(72, 96));
        
    }


    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
