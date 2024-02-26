import javax.swing.*;
import java.awt.*;

public class Z_00_Tests_Schachbrett extends JFrame {
    private static final int GROESSE = 8; // Größe des Schachbretts
    private static final int FELD_GROESSE = 50; // Größe eines Feldes

    public Z_00_Tests_Schachbrett() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(GROESSE * FELD_GROESSE, GROESSE * FELD_GROESSE);
        setLayout(new GridLayout(GROESSE, GROESSE));
        setTitle("Schachbrett");

        for (int i = 0; i < GROESSE * GROESSE; i++) {
            JPanel feld = new JPanel();
            if ((i / GROESSE + i % GROESSE) % 2 == 0) {
                feld.setBackground(Color.WHITE);
            } else {
                feld.setBackground(Color.BLACK);
            }
            add(feld);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Z_00_Tests_Schachbrett brett = new Z_00_Tests_Schachbrett();
            brett.setVisible(true);
        });
    }
}