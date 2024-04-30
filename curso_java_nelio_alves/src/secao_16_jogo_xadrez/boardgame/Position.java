package secao_16_jogo_xadrez.boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	public void setPosition(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return this.row + ", " + this.column;
	}
	
}
