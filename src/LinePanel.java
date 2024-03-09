import javax.swing.*;
import java.awt.*;

/**
 * LinePanel is a custom JPanel that overrides the paintComponent method to draw a line.
 */
public class LinePanel extends JPanel {
    /**
     * Overrides the paintComponent method from JPanel.
     * This method is called whenever Swing needs to redraw the component.
     * It creates a StructuralLineDrawer object and calls its drawLine method to draw a line on the panel.
     *
     * @param g the Graphics object to protect
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the super class's paintComponent method to ensure the panel is displayed correctly
        StructuralLineDrawer drawer = new StructuralLineDrawer(0, 0, 10, 10, g); // Create a StructuralLineDrawer object
        drawer.drawLine(); // Draw the line
    }

    /**
     * The application's entry point
     *
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Line Drawer"); // Create a new JFrame with the title "Line Drawer"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
        frame.setSize(400, 400); // Set the size of the frame
        frame.add(new LinePanel()); // Add an instance of LinePanel to the frame
        frame.setVisible(true); // Make the frame visible
    }
}