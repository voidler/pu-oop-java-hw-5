import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
int padding = 1;
        public Window() {
        this.setSize(800, 1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Board board = new Board();
        this.setContentPane(board);
    }

    public class Board extends JPanel {
        public void paint(Graphics g) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0,0,800,1500);
            g.setColor(Color.GRAY);

            for (int i=0; i< 64; i++) {
                for (int j=0; j< 64; j++){
                    g.fillRect(padding+i*12,padding+j*12,12-2*padding,12-2*padding);
                }
            }
        }
    }
}
