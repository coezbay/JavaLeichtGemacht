import javax.swing.*;
import java.awt.*;

public class Z_01_PferdPiktogramm extends JPanel {
    public Z_01_PferdPiktogramm() {
        // Setze die bevorzugte Größe für das Panel, damit es genug Platz zum Zeichnen des Piktogramms gibt.
        setPreferredSize(new Dimension(200, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Konvertiere Graphics zu Graphics2D, um mehr Zeichenfunktionen zu haben
        Graphics2D g2d = (Graphics2D) g;

        // Verbessere die Zeichenqualität
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Zeichne den Kopf des Pferdes
        g2d.drawOval(100, 50, 50, 50); // Kopfform

        // Zeichne den Körper des Pferdes
        g2d.drawRect(50, 100, 100, 50); // Körperform

        // Zeichne die Beine des Pferdes
        g2d.drawLine(60, 150, 60, 180); // Bein 1
        g2d.drawLine(80, 150, 80, 180); // Bein 2
        g2d.drawLine(120, 150, 120, 180); // Bein 3
        g2d.drawLine(140, 150, 140, 180); // Bein 4

        // Zeichne den Schwanz des Pferdes
        g2d.drawLine(50, 125, 30, 110); // Schwanz
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pferd Piktogramm");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Z_01_PferdPiktogramm());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}