package UI;

import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class PileView extends JPanel {
 
    private List<CardView> cards;

    public PileView()
    {
        this.cards = new ArrayList<>();
        setLayout(new OverlayLayout(this));
    }


    public void addCard(CardView card)
    {
        cards.add(card);
        add(card);
        revalidate();
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (CardView card: cards)
        {
            card.paintComponent(g);
        }
    }


}



