package UI;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Solitaire extends JFrame {
    

    public Solitaire()
    {
        initUI();
    }


    private void initUI()
    {
        setTitle("Solitaire");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
        Solitaire game = new Solitaire();
        game.setVisible(true);
    }
}
