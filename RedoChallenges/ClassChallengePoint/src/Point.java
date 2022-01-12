public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        int xx = 0;
        int yy = 0;
        return Math.sqrt(((getX() - xx) * (getX() - xx)) + ((getY() - yy) * (getY() - yy)));
    }

    public double distance (int x , int y) {
        return Math.sqrt(((getX() - x) * (getX() - x)) + ((getY() - y) * (getY() - y)));
    }

    public double distance (Point point) {
        return Math.sqrt(((getX() - point.x) * (getX() - point.x)) + ((getY() - point.y) * (getY() - point.y)));
    }
}
