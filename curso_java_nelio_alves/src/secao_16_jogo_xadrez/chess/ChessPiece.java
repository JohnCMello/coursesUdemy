package secao_16_jogo_xadrez.chess;

import secao_16_jogo_xadrez.boardgame.Board;
import secao_16_jogo_xadrez.boardgame.Piece;
import secao_16_jogo_xadrez.boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece targetSquare = ((ChessPiece) getBoard().piece(position));
		return targetSquare != null && targetSquare.getColor() != color;
	}
	
	

}
