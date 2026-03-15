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

        private void placeNewPiece(char column, int row, ChessPiece piece){
            board.placePiece(piece, new ChessPosition(column, row).toPosition());
        }

        private void initialSetup() {
        placeNewPiece('c',5, new King(board, Color.WHITE));
        placeNewPiece('c',3, new Rook(board, Color.WHITE));
        placeNewPiece('e',3, new Rook(board, Color.WHITE));
    }
}
