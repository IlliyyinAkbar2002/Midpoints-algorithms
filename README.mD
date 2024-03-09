# Line Drawer Application

This application is a simple line drawer built with Java and Swing. It draws a line from the point (0,0) to the point (10,10) on a custom JPanel.

## Code Explanation

The application consists of three main classes: `LinePanel`, `Main`, and `StructuralLineDrawer`.

### LinePanel Class

The `LinePanel` class extends `JPanel` and overrides the `paintComponent` method. This method is called whenever Swing needs to redraw the component. Inside this method, a `StructuralLineDrawer` object is created and its `drawLine` method is called to draw a line on the panel.

### Main Class

The `Main` class contains the `main` method which is the entry point of the application. It also contains two methods for drawing lines: `naiveDrawLine` and `MidpointLine`. The `naiveDrawLine` method draws a line using a simple algorithm, while the `MidpointLine` method uses the midpoint line algorithm.

### StructuralLineDrawer Class

The `StructuralLineDrawer` class is responsible for the actual drawing of the line. It takes the start and end points of the line and a `Graphics` object as parameters. The `drawLine` method calculates the direction and steps to draw the line. The `drawPixel` method is used to draw a pixel at a specific point.

## Running the Application

To run the application, simply execute the `main` method in the `LinePanel` class. A window will appear with a line drawn from the point (0,0) to the point (10,10).