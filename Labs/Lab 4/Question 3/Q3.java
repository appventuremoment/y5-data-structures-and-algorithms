import StdDraw;
// I uh tried to install it but the jar file just does not jar file
// I hope my code works
public class Q3 {
    public static void drawCircle(double x, double y, double r, int colour) {
        if (r == 1) return;

        if (colour % 2 == 0) StdDraw.setPenColor(StdDraw.BLACK);
        else StdDraw.setPenColor(StdDraw.WHITE);

        StdDraw.circle(x, y, r);

        drawCircle(x - r / 2, y, r / 2, ++colour);
        drawCircle(x + r / 2, y, r / 2, ++colour);
    }

    public static void main(String[] args) {
        StdDraw.setCanvasSize();
        StdDraw.setScale(0, 1);
        StdDraw.enableDoubleBuffering();

        drawCircle(512 / 2, 512 / 2, 512 / 2, 0);
        StdDraw.show();
    }
}