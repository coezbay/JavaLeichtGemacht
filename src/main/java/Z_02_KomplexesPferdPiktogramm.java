import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Z_02_KomplexesPferdPiktogramm extends JPanel {
    public Z_02_KomplexesPferdPiktogramm() {
        setPreferredSize(new Dimension(300, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Körper des Pferdes
        g2d.setColor(new Color(156, 93, 82));
        g2d.fill(new Ellipse2D.Double(50, 100, 200, 100));

        // Kopf des Pferdes
        g2d.fill(new RoundRectangle2D.Double(200, 50, 50, 70, 20, 20));

        // Beine des Pferdes
        g2d.fill(new Rectangle2D.Double(70, 190, 20, 60));
        g2d.fill(new Rectangle2D.Double(110, 190, 20, 60));
        g2d.fill(new Rectangle2D.Double(170, 190, 20, 60));
        g2d.fill(new Rectangle2D.Double(210, 190, 20, 60));

        // Schwanz des Pferdes
        g2d.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.draw(new Line2D.Double(55, 150, 20, 120));

        // Auge des Pferdes
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(230, 60, 10, 10));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Komplexes Pferd Piktogramm");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Z_02_KomplexesPferdPiktogramm());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}