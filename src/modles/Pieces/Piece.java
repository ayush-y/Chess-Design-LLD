package modles.Pieces;

import modles.Helpers.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private final PieceName pieceName;

    private boolean killed;

    private final Color color;

    private List<Move> movesDone;

    public Piece(PieceName name, Color color) {
        this.killed = false;
        this.pieceName = name;
        this.color = color;
        this.movesDone = new ArrayList<>();
    }
    public boolean isMovingFirstTime(){
        return movesDone.isEmpty();
    }
    public void getKilled() {
        this.killed = true;
    }
    public PieceName piecename(){
        return pieceName;
    }
    public boolean isKilled() {
        return this.killed;
    }
    public void setKilled(boolean killed) {
        this.killed = killed;
    }
    public PieceName getPieceName() {
        return this.pieceName;
    }
    public Color getColor() {
        return this.color;
    }
}
