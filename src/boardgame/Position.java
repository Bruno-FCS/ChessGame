package boardgame;

public class Position {
	private Integer row;
	private Integer column;

	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setValues(int row, int column) {

	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}
