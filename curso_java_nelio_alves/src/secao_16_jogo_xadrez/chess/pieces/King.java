package secao_16_jogo_xadrez.chess.pieces;

import secao_16_jogo_xadrez.boardgame.Board;
import secao_16_jogo_xadrez.boardgame.Position;
import secao_16_jogo_xadrez.chess.ChessMatch;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.Color;

public class King extends ChessPiece {

	private ChessMatch match;

	public King(Board board, Color color, ChessMatch match) {
		super(board, color);
		this.match = match;
	}

	private boolean testRookCastling(Position position) {
		ChessPiece piece = (ChessPiece) getBoard().piece(position);
		return piece != null && piece instanceof Rook && piece.getColor() == getColor() && piece.getMoveCount() == 0;
	}

	private boolean canMove(Position position) {
		ChessPiece piece = (ChessPiece) getBoard().piece(position);
		return piece == null || piece.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] _possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position _position = new Position(0, 0);

//		up
		_position.setPosition(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		up right
		_position.setPosition(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		right
		_position.setPosition(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		down right
		_position.setPosition(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		down
		_position.setPosition(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		down left
		_position.setPosition(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		left
		_position.setPosition(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		up left
		_position.setPosition(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		Castling

//		King Side Castling

		if (getMoveCount() == 0 && !match.getCheck()) {
			Position positionRightRook = new Position(position.getRow(), position.getColumn() + 3);
			if (testRookCastling(positionRightRook)) {
				Position rightColumPlusOne= new Position(position.getRow(), position.getColumn() + 1);
				Position rightColumnPlusTwo = new Position(position.getRow(), position.getColumn() + 2);

				if (getBoard().piece(rightColumPlusOne) == null && getBoard().piece(rightColumnPlusTwo) == null) {
					_possibleMoves[_position.getRow()][_position.getColumn() + 2] = true;
				}
			}

//		Queen Side Castling

			Position positionLeftRook = new Position(position.getRow(), position.getColumn() - 4);
			if (testRookCastling(positionLeftRook)) {
				Position leftColumnPlusOne = new Position(position.getRow(), position.getColumn() - 1);
				Position leftColumnPlusTwo = new Position(position.getRow(), position.getColumn() - 2);
				Position leftColumnPlusThree = new Position(position.getRow(), position.getColumn() - 3);

				if (getBoard().piece(leftColumnPlusOne) == null && getBoard().piece(leftColumnPlusTwo) == null && getBoard().piece(leftColumnPlusThree) == null) {
					_possibleMoves[_position.getRow()][_position.getColumn() - 2] = true;
				}
			}

		}
		return _possibleMoves;
	}

	@Override
	public String toString() {
		return "K";
	}

}
