package machinecoding.chessgame;

public class Player {
    String name;
    String status;

    public Player(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void move(Piece piece) {
        //out of grid
         //checkmate
        //I am kill someone & setting for that playerId, peices(status)
    }
}
