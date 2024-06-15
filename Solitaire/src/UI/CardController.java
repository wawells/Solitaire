package UI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardController extends MouseAdapter {
    
    private CardView card;
    private PileView sourcePile;
    private PileView destinationPile;

    public CardController(CardView card, PileView sourcePile, PileView destinationPile) {
        this.card = card;
        this.sourcePile = sourcePile;
        this.destinationPile = destinationPile;

        card.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Implement drag logic
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Implement drop logic
    }
}
