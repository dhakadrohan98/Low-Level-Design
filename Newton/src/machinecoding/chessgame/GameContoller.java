package machinecoding.chessgame;

import java.util.List;
import java.util.Map;

public class GameContoller {
    int gameId;
    List<Player> players;
    Map<Integer, List<Piece>> remainingPieces;



    public void startGame(Board board, List<Player> players) {
        if(board.isPalying == false) {
            board.setPalying(true);
        }
        if(players != null & players.size() == 2) {
            this.players = players;
        }
    }

    public void stopGame(Board board, List<Player> players) {
        if(board.isPalying == true) {
            board.setPalying(false);
        }
        if(players != null & players.size() == 2) {
            this.players = null;
        }
    }

    //what kind of data i need to store to show status-> for a player based on remaining pieces - tell which player is wining or loosing
    public String storeStatusOfGame(Player player, Piece piece) {
        if(player.status.equalsIgnoreCase("win")) {
            return "win";
        }
        else if(player.status.equalsIgnoreCase("loose")) {
            return "lost";
        }
        return "Tie";
    }
}
