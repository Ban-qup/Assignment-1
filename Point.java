import java.lang.Math;
public class Point {
    private int x;
    private int y;
    Point(int x, int y){
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
    private double round(double element){
        element *= 100;
        double temp = Math.round(element);
        return (double) temp/100;
    }
    public double distance(Point a){
        int distance_x = x - a.getX();
        int distance_y = y - a.getY();
        double distance = Math.sqrt(Math.pow(distance_x, 2) + Math.pow(distance_y, 2));
        distance = round(distance);
       return distance;
    }
}

