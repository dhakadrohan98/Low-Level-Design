package machinecoding.chessgame;

import java.util.List;

public class Piece {
    List<MoveType> types;
    int minCount;
    int maxCount; // infinite it can go upto board limit(INT_MAX)
}
