import modles.Board.Cell;
import modles.Helpers.Color;
import modles.Helpers.Pair;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Chess !!");
        Pair pair = new Pair(1, 2);
        System.out.println(pair.getX());
        System.out.println(pair.getY());
        Color color = Color.BLACK;
        Color color1  = Color.WHITE;
        System.out.println(color);
        System.out.println(color1);
        Cell cell = new Cell(1, 2);
        System.out.println(cell.getX());
        System.out.println(cell.getY());
        System.out.println("Thank you for playing the Chess !!");

    }
}