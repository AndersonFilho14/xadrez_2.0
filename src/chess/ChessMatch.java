package chess;

import chess.pieces.King;
import chess.pieces.Rook;
import entities.boardgame.Board;
import entities.boardgame.Position;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int r = 0; r < board.getRows(); r++) {
            for (int c = 0; c < board.getColumns(); c++) {
                mat[r][c] = (ChessPiece) board.piece(r, c);
            }
        }
        return mat;

    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(3, 2));
        board.placePiece(new King(board, Color.BLACK), new Position(5, 4));
        board.placePiece(new Rook(board, Color.BLACK), new Position(5, 3));
        board.placePiece(new King(board, Color.BLACK), new Position(5, 2));
    }
}
