package modles.Pieces;

import modles.Board.Cell;
import modles.Helpers.Color;

public class Pawn extends Piece implements ChessPiece {

    public Pawn(PieceName name, Color color){
        super(name, color);
    }
    @Override
    public void makeMove(Cell startingCell, Cell endingCell) {

    }

    @Override
    public void setKilled(boolean killed) {
            this.setKilled(killed);
    }

    @Override
    public boolean isKilled() {
        return this.isKilled();
    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell) {
        // 1. If this is Pawn first move then pawn can move one step or two steps.
        // 2. If this is not first move then pawn can move only one step.
        // 3. If diagonally we have an opposite color piece then pawn can kill that piece.
        // 4. If vertically we have same color piece then pawn can't move.
        // 5. If vertically we have opposite color piece then pawn can't move.
        // 6. If we have a black pawn then it can move in the negative -y direction and if we have a white pawn then
        // it can move in the positive y direction.



        return false;
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }
}
