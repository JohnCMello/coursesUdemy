package secao_16_jogo_xadrez.chess.pieces;

import secao_16_jogo_xadrez.boardgame.Board;
import secao_16_jogo_xadrez.boardgame.Position;
import secao_16_jogo_xadrez.chess.ChessPiece;
import secao_16_jogo_xadrez.chess.Color;

public class Knight extends ChessPiece {
		
	public Knight(Board board, Color color) {
		super(board, color);
		
	}
	
	private boolean canMove(Position position) {
		ChessPiece piece = (ChessPiece) getBoard().piece(position);
		return piece == null || piece.getColor() != getColor();
	}

	@Override
	public String toString() {
		return "k";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] _possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position _position = new Position(0, 0);

//		up left
		_position.setPosition(position.getRow() - 2, position.getColumn() - 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
		
//		up right
		_position.setPosition(position.getRow() - 2, position.getColumn() +1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
//		right up
		_position.setPosition(position.getRow() - 1, position.getColumn() + 2);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
//		right down
		_position.setPosition(position.getRow() + 1, position.getColumn() + 2);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
		
//		down right
		_position.setPosition(position.getRow() + 2, position.getColumn() + 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
		
//		down left
		_position.setPosition(position.getRow() + 2, position.getColumn() - 1);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
		
//		left down
		_position.setPosition(position.getRow() + 1, position.getColumn() - 2);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}
		
//		left up
		_position.setPosition(position.getRow() - 1, position.getColumn() - 2);
		if (getBoard().positionExists(_position) && canMove(_position)) {
			_possibleMoves[_position.getRow()][_position.getColumn()] = true;
		}


		return _possibleMoves;
	}

}
