import java.io.*;
import static java.lang.Math.round;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        naiveDrawLine(0, 10, 0, 10);
        MidpointLine(2, 2, 8, 5);
    }



    public static void naiveDrawLine(int x1, int x2, int y1, int y2) {
        int m = (y2 - y1) / (x2 - x1);
        int b = y1 - m * x1;
        for (int x = x1; x < x2; x++) {
            int y = m * x + b;
            System.out.println(x + " " + y);
        }
    }

    public static void MidpointLine(int x1, int y1, int x2, int y2){
        int dx = x2 - x1;
        int dy = y2 - y1;

        int d = dy - (dx/2);
        int x = x1, y = y1;

        System.out.println(x + ", " + y);

        while (x < x2){
            x++;
            if (d < 2)
                d = d + dy;
            else {
                d += (dy - dx);
                y++;
            }
            System.out.println(x + ", " + y);
        }
    }
}

