import java.awt.*;

public class StructuralLineDrawer {
    private int startX, startY, endX, endY;
    private Graphics graphics;

    public StructuralLineDrawer(int startX, int startY, int endX, int endY, Graphics graphics) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.graphics = graphics;
    }

    public void drawLine(){
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        int x = startX;
        int y = startY;
        int directionX = (endX - startX) > 0 ? 1 : -1;
        int directionY = (endY - startY) > 0 ? 1 : -1;

        while(x != endX || y != endY){
            drawPixel(x, y);
            drawPixel(x + directionX, y + directionY);
            drawPixel(x + directionX, y + 2 * directionY);

            x += directionX;
            y += directionY;

            drawPixel(x + directionX, y + directionY);
            drawPixel(x + directionX, y + 2 * directionY);

            x += directionX;
        }
    }

    private void drawPixel(int x, int y) {
        char pixelType = 0;
        if (pixelType == 'H') {
            graphics.setColor(Color.BLACK); // Set color for filled circle
            graphics.fillOval(x, y, 3, 3); // Draw a small filled circle (adjust size as needed)
        } else if (pixelType == 'D') {
            graphics.setColor(Color.BLUE);  // Set color for open circle
            graphics.drawOval(x, y, 3, 3); // Draw an open circle
        } else {
            // ... (Logic for double circle or error handling)
        }
    }


    public static void main(String[] args) {
        StructuralLineDrawer drawer = new StructuralLineDrawer(0, 0, 10, 10, null);
        drawer.drawLine();
    }
}
