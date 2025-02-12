package modles.Board;

import modles.Helpers.Pair;
import modles.Pieces.ChessPiece;

import java.util.Optional;
//In a game of chess a cell may or may not have a piece on it
public class Cell {
    private Optional<ChessPiece> piece;
    private final Pair position;

    public Cell(int x, int y) {
        this.position = new Pair(x, y);
        this.piece = Optional.empty();
    }
    public Optional<ChessPiece> getPiece() {
        return piece;
    }
    public void setPiece(ChessPiece piece) {
        this.piece = Optional.of(piece);
    }
    public Pair getPosition() {
        return position;
    }
    public void removePiece() {
        this.piece = Optional.empty();
    }
    public boolean hasPiece() {
        return piece.isPresent();
    }
    public int getX() {
        return position.getX();
    }
    public int getY() {
        return position.getY();
    }

}
