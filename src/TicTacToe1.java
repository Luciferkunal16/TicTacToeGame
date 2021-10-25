package LogicalPrograms;


import java.util.Scanner;

public class TicTacToe1 {
	
	char[] boardOfChar = new char[10];
	char playerChar;
	char systemChar;
	static int Turn;
	void  boardOfCharacter() {
		for(int i=1;i<=9;i++) {
		boardOfChar[i] = ' ';
		
		}
	}
	void playerInput_UC1_(){
		Scanner inp=new Scanner(System.in);
		System.out.println("Choose X Or O");
		 char c = inp.next().charAt(0);
		
		 if(c=='O') {
			 System.out.println("Player has choosed O");
			 playerChar='O';
			 systemChar='X';
		 }
		 else if(c=='X') {
			 System.out.println("Player has Choosed X");
			 playerChar='X';
			 systemChar='O';
		 }
		 else {
			 System.out.println("Wrong Choice ");
		 }
		
	}
	 public void printBoard() {
		 
		 
		   System.out.println("|"+boardOfChar[1]+"|"+boardOfChar[2]+"|"+boardOfChar[3]+"|");
		   System.out.println("|"+boardOfChar[4]+"|"+boardOfChar[5]+"|"+boardOfChar[6]+"|");
		   System.out.println("|"+boardOfChar[7]+"|"+boardOfChar[8]+"|"+boardOfChar[9]+"|");
		   
		   
		   
		 
		     }
	 public void moveOfPlayer() {
		 Scanner inp=new Scanner(System.in);
		 System.out.println("Enter ther desired position in Game (1-9) ");
		 int choice=inp.nextInt();
		switch (choice){
		case 1:
			if (playerChar=='O' && boardOfChar[1]==' ')
		{
			boardOfChar[1]='O';
		}
			else if( playerChar=='X' && boardOfChar[1]==' ')
			{
				boardOfChar[1]='x';
			}
			break;
			
		case 2:
			if (playerChar=='O'&& boardOfChar[2]==' ' )
				{
				boardOfChar[2]='O';
				}
				else if( playerChar=='X' &&  boardOfChar[2]==' ')
				{
					boardOfChar[2]='x';
				}
				break;
				
		case 3:
			if ( playerChar=='O' && boardOfChar[3]==' ')
				{
				boardOfChar[3]='O';
				}
				else if( playerChar=='X' && boardOfChar[3]==' ')
				{
					boardOfChar[3]='x';
				}
			toss();
				break;
		case 4:
			if ( playerChar=='O' && boardOfChar[4]==' ')
				{
				boardOfChar[4]='O';
				}
			else if( playerChar=='X' && boardOfChar[4]==' ')
				{
					boardOfChar[4]='x' ;
				}
			break;
		case 5:
			if ( playerChar=='O' && boardOfChar[5]==' ' )
				{
				boardOfChar[5]='O';
				}
			else if( playerChar=='X' && boardOfChar[5]==' ')
				{
					boardOfChar[5]='x';
				}
			break;
		case 6:
			if ( playerChar=='O'  && boardOfChar[6]==' ')
				{
				boardOfChar[6]='O';
				}
			else if( playerChar=='X' && boardOfChar[6]==' ')
				{
					boardOfChar[6]='x';
				}
			break;
		case 7:
			if (playerChar=='O' && boardOfChar[7]==' ' )
			 	{
				boardOfChar[7]='O';
			 	}
			else if(playerChar=='X' && boardOfChar[7]==' ')
				{
					boardOfChar[7]='x';
				}
			break;
		case 8:
			if (playerChar=='O'  && boardOfChar[8]==' ')
				{
				boardOfChar[8]='O';
				}
			else if( playerChar=='X' && boardOfChar[8]==' ')
			{
					boardOfChar[8]='x';
			}
			break;
		case 9:
			if ( playerChar=='O' && boardOfChar[9]==' ')
				{
				boardOfChar[9]='O';
				}
			else if( playerChar=='X' && boardOfChar[9]==' ')
				{
					boardOfChar[9]='x';
				}
			break;
			default:
				System.out.println("Wrong Choice");
				
		}
	 }
	  static void  toss() {
		  int choice;
		  
		  choice=(int)Math.random()*10%2;
		  if(choice==1) {
			  System.out.println("Player turn");
			  Turn=1;
		  }
		  else {
			  System.out.println("Computer turn");
			  Turn=2;
		  }
		 
	 }

	public static void main(String[] args) {
	    TicTacToe1 rv=new TicTacToe1();
	   
	    rv.boardOfCharacter();
	    toss();
	    rv.playerInput_UC1_();
	    rv.moveOfPlayer();
	    rv.printBoard();
		
	}
}
