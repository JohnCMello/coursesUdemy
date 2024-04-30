package secao_16_jogo_xadrez.chess.pieces;

import secao_16_jogo_xadrez.boardgame.Board;
import secao_16_jogo_xadrez.boardgame.Position;
import secao_16_jogo_xadrez.chess.ChessMatch;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.Color;

public class Pawn extends ChessPiece {

	private ChessMatch match;

	public Pawn(Board board, Color color, ChessMatch match) {
		super(board, color);
		this.match = match;
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] _possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position _position = new Position(0, 0);

		if (getColor() == Color.WHITE) {

			_position.setPosition(position.getRow() - 1, position.getColumn());

			if (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() - 2, position.getColumn());

			Position squareInFront = new Position(position.getRow() - 1, position.getColumn());

			if (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)
					&& getBoard().positionExists(squareInFront) && !getBoard().hasPiece(squareInFront)
					&& getMoveCount() == 0) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() - 1, position.getColumn() - 1);

			if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() - 1, position.getColumn() + 1);

			if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

//			en passant

			if (position.getRow() == 3) {
				Position leftSquare = new Position(position.getRow(), position.getColumn() - 1);

				if (getBoard().positionExists(leftSquare) && isThereOpponentPiece(leftSquare)
						&& getBoard().piece(leftSquare) == match.getEnPassantVulnerable()) {
					_possibleMoves[leftSquare.getRow() - 1][leftSquare.getColumn()] = true;
				}

				Position rightSquare = new Position(position.getRow(), position.getColumn() + 1);

				if (getBoard().positionExists(rightSquare) && isThereOpponentPiece(rightSquare)
						&& getBoard().piece(rightSquare) == match.getEnPassantVulnerable()) {
					_possibleMoves[rightSquare.getRow() - 1][rightSquare.getColumn()] = true;
				}

			}
		} else {

			_position.setPosition(position.getRow() + 1, position.getColumn());

			if (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() + 2, position.getColumn());

			Position squareInFront = new Position(position.getRow() + 1, position.getColumn());

			if (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)
					&& getBoard().positionExists(squareInFront) && !getBoard().hasPiece(squareInFront)
					&& getMoveCount() == 0) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() + 1, position.getColumn() - 1);

			if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}

			_position.setPosition(position.getRow() + 1, position.getColumn() + 1);

			if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
				_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			}
			
//			en passant

			if (position.getRow() == 4) {
				Position leftSquare = new Position(position.getRow(), position.getColumn() - 1);

				if (getBoard().positionExists(leftSquare) && isThereOpponentPiece(leftSquare)
						&& getBoard().piece(leftSquare) == match.getEnPassantVulnerable()) {
					_possibleMoves[leftSquare.getRow() + 1][leftSquare.getColumn()] = true;
				}

				Position rightSquare = new Position(position.getRow(), position.getColumn() + 1);

				if (getBoard().positionExists(rightSquare) && isThereOpponentPiece(rightSquare)
						&& getBoard().piece(rightSquare) == match.getEnPassantVulnerable()) {
					_possibleMoves[rightSquare.getRow() + 1][rightSquare.getColumn()] = true;
				}

			}

		}

		return _possibleMoves;
	}

	@Override
	public String toString() {
		return "P";
	}

}
