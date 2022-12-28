import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;
public class Shape {
    Scanner a = new Scanner(System.in);
    private Point[]  shape;
    private int buff = 3;
    private int size;
    Shape(){
         shape = new Point[buff];
    }
    /*Shape(int length){
        buff = length;
        shape = new Point[buff];
        for(int i = 0; i<length; i++){
            shape[size++] =
        }
    }
     */

    private void increaseBuff(){
        buff *= 2;
        Point[] newShape = new Point[buff];
        for(int i = 0; i < shape.length; i++){
            newShape[i] = shape[i];
        }
        shape = newShape;
    }

    public void addPoint(Point a){
        if(size == buff){
            increaseBuff();
        }
        shape[size++] = a;
    }
    public void getPoints(){
        for(int i = 0; i<size; i++){
            System.out.println(shape[i].getX() + " " + shape[i].getY());
        }
    }
    private double round(double element){
        element *= 100;
        double temp = Math.round(element);
        return (double) temp/100;
    }
    public double calculatePerimeter(){
        double perimeter = shape[size-1].distance(shape[0]);
        for(int i = 0; i<size - 1; i++){
            perimeter += shape[i].distance(shape[i+1]);
        }
        perimeter = round(perimeter);
        return perimeter;
    }
    public double longestSide(){
        double longestSide = shape[size-1].distance(shape[0]);
        for(int i = 0; i<size - 1; i++){
            double temp = shape[i].distance(shape[i+1]);
            longestSide = (longestSide > temp)? longestSide: temp;
        }
        longestSide = round(longestSide);
        return longestSide;
    }
    public double averageLength(){
        double sum = calculatePerimeter();
        sum /= (size);
        sum = round(sum);
        return sum;
    }
}
