package LogicalPrograms;



public class TicTacToe {
	void  boardOfCharacter() {
		char[] boardOfChar = new char[10];
		boardOfChar[1] = ' ';
		boardOfChar[2] = ' ';
		boardOfChar[3] = ' ';
		boardOfChar[4] = ' ';
		boardOfChar[5] = ' ';
		boardOfChar[6] = ' ';
		boardOfChar[7] = ' ';
		boardOfChar[8] = ' ';
		boardOfChar[9] = ' ';
	}
	public static void main(String[] args) {
	    TicTacToe rv=new TicTacToe();
	    rv.boardOfCharacter();
	}
}
