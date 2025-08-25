package main.java.chess.factory;

import main.java.chess.model.Position;
import main.java.chess.pieces.King;
import main.java.chess.pieces.Pawn;
import main.java.chess.pieces.Piece;
import main.java.chess.pieces.Queen;

public class PieceFactory {

    /*
        Creates piece based on input
        throws exception if input is invalid
     */
    public static Piece createPiece(String type, Position position) {
        switch (type.toUpperCase()) {
            case "PAWN": return new Pawn(position);
            case "KING": return new King(position);
            case "QUEEN": return new Queen(position);
            default: throw new IllegalArgumentException("Piece is not valid : " + type);
        }
    }
}
