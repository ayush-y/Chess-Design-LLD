package modles.Pieces;

import modles.Board.Cell;

public interface ChessPiece {
    void makeMove(Cell startingCell, Cell endingCell);

    boolean setKilled(boolean killed);

    boolean isKilled();

    boolean canMove(Cell startingCell, Cell endingCell);

    void listPossibleMoves(Cell currentCell);

}
