package LogicalPrograms;


import java.util.Scanner;

public class TicTacToe1 {
	
	char[] boardOfChar = new char[10];
	
	void  boardOfCharacter() {
		
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
	void playerInput_UC1_(){
		Scanner inp=new Scanner(System.in);
		 char c = inp.next().charAt(0);
		 char playerChar;
		 char systemChar;
		 if(c=='O') {
			 System.out.println("Player has choosed O");
			 playerChar='O';
			 systemChar='X';
		 }
		 else {
			 System.out.println("Player has Choosed X");
			 playerChar='X';
			 systemChar='O';
		 }
	}
	 public void printBoard() {
		 
		 
		         for (int i = 0; i < 3; i++) {
		 
		             System.out.print("| ");
		 
		             for (int j = 0; j < 3; j++) {
		            	 System.out.print(boardOfChar[i]);
		 
		                 System.out.print( " | ");
		 
		             }
		 
		             System.out.println();
		
		            ;
		
		         }
		 
		     }

	public static void main(String[] args) {
	    TicTacToe1 rv=new TicTacToe1();
	    rv.boardOfCharacter();
	  rv.printBoard();
		
	}
}
