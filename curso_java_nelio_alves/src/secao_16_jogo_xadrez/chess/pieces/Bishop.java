package secao_16_jogo_xadrez.chess.pieces;

import secao_16_jogo_xadrez.boardgame.Board;
import secao_16_jogo_xadrez.boardgame.Position;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.Color;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] _possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position _position = new Position(0, 0);

//		up left
		_position.setPosition(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			_position.setPosition(_position.getRow() - 1, _position.getColumn() - 1);
		}

		if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		up right
		_position.setPosition(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			_position.setPosition(_position.getRow() - 1, _position.getColumn() + 1);
		}

		if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		down right
		_position.setPosition(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			_position.setPosition(_position.getRow() + 1, _position.getColumn() + 1);
		}

		if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

//		down left
		_position.setPosition(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(_position) && !getBoard().hasPiece(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
			_position.setPosition(_position.getRow() + 1, _position.getColumn() - 1);
		}

		if (getBoard().positionExists(_position) && isThereOpponentPiece(_position)) {
		
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}

		return _possibleMoves;
	}

	@Override
	public String toString() {
		return "B";
	}

}
