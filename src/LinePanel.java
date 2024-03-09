import javax.swing.*;
import java.awt.*;

public class LinePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        StructuralLineDrawer drawer = new StructuralLineDrawer(0, 0, 10, 10, g);
        drawer.drawLine();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new LinePanel());
        frame.setVisible(true);
    }
}