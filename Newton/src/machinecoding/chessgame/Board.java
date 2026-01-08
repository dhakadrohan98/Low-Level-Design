package machinecoding.chessgame;

import java.util.ArrayList;
import java.util.List;

public class Board {
    static List<Cell> cell; //can be intialized initially
    int boardId;
    boolean isPalying;

    public Board(int boardId) {
        this.boardId = boardId;
        cell = new ArrayList<>();
        //assign the cell
        for(int i = 1; i <= 64; i++) {
            Cell newCell = new Cell(i);
            cell.add(newCell);
        }
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public boolean isPalying() {
        return isPalying;
    }

    public void setPalying(boolean palying) {
        isPalying = palying;
    }
}

