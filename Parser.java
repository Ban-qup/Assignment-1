public class Parser {
    public static Point parserPoint(String str){
        String[] numbers = str.split(", ");
        return new Point(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
    }
}
