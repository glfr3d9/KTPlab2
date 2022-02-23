public class p2d {

    protected double xCoord;
    protected double yCoord;

    public p2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public p2d () {
        this(0, 0);
    }

    public double getX () {
        return xCoord;
    }

    public double getY () {
        return yCoord;
    }

    public void setX ( double val) {
        xCoord = val;
    }

    public void setY ( double val) {
        yCoord = val;
    }
}
