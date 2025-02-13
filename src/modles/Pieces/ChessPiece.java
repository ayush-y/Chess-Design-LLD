package modles.Pieces;

import modles.Board.Cell;
import modles.Helpers.Color;

public interface ChessPiece {
    void makeMove(Cell startingCell, Cell endingCell);

    void setKilled(boolean killed);

    boolean isKilled();

    boolean canMove(Cell startingCell, Cell endingCell);

    void listPossibleMoves(Cell currentCell);

    boolean isMovingFirstTime();

    Color getColor();
}
