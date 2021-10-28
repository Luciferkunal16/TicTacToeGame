package LogicalPrograms;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe1 {
	
	static char[] boardOfChar = new char[10];
	static char playerChar;
	static char systemChar;
	static int turn;
	static int move;
	static int winner=0;
	void  boardOfCharacter() {
		for(int i=1;i<=9;i++) {
		boardOfChar[i] = ' ';
		
		}
	}
	
	static int turnChange() {
		
		if(turn==2) {
			turn=1;
		}
		else if(turn==1) {
			turn=2;
		}
		return turn;
	}
	 static void playerInput_UC1_(){
		Scanner inp=new Scanner(System.in);
		System.out.println("Choose X Or O");
		 char c = inp.next().charAt(0);
		
		 if(c=='O') {
			 System.out.println("Player has choosed O");
			 playerChar='O';
			 systemChar='X';
			 moveOfPlayer();
			 
		 }
		 else if(c=='X') {
			 System.out.println("Player has Choosed X");
			 playerChar='X';
			 systemChar='O';
			 moveOfPlayer();
			
		 }
		 else {
			 System.out.println("Wrong Choice ");
		 }
		
	}
	 public static void printBoard() {
		 
		 
		   System.out.println("|"+boardOfChar[1]+"|"+boardOfChar[2]+"|"+boardOfChar[3]+"|");
		   System.out.println("|"+boardOfChar[4]+"|"+boardOfChar[5]+"|"+boardOfChar[6]+"|");
		   System.out.println("|"+boardOfChar[7]+"|"+boardOfChar[8]+"|"+boardOfChar[9]+"|");
		   
		   
		   
		 
		     }
	 public static void moveOfPlayer() {
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
		
		turnChange();
		printBoard();
		
		if(winner==0){
			computerMove();
			WinningCondition();
			
		}
		else if(winner==1) {
			System.out.println("Player Won");
		}
		
		
		
	 }
	  static int toss() {
		 int choice;
		  Random ran=new Random();
		  
		  choice=ran.nextInt(2);
		  if(choice==1) {
			  System.out.println("Player turn");
			  turn=1;
			  
		  }
		  else  {
			  System.out.println("Computer turn");
			  turn=2;
			  
		  }
		  return choice;
		 
	 }
	   static void  computerMove() {
		    if (playerChar=='X')
		    { 
			 systemChar='O';
		    }
		    else if(playerChar=='O') {
		    	systemChar='X';
		    }
		    else {
		    	systemChar='O';
		    	playerChar='X';
		    	System.out.println("System has Chossed- O ");
		    }
			 
		   
		  Random ran=new Random();
		  
			  move=ran.nextInt(8)+1;
			  System.out.println("Computer Has choosed "+move);
			  computerNextMove();
		  
		 
	  }
	   static void computerNextMove() {
		  switch (move) {
			  
			  case 1:
			  if(systemChar=='X' && boardOfChar[1]==' ') {
				  boardOfChar[1]='O';
				  
			  }   
			  else if(systemChar=='O' && boardOfChar[1]==' ') {
				  boardOfChar[1]='O';
			  }
			  else {
				  computerMove();
			  }
			  break;
			  case 2:
				  if(systemChar=='X' && boardOfChar[2]==' ') {
					  boardOfChar[2]='O';
					  
				  }   
				  else if(systemChar=='O' && boardOfChar[2]==' ') {
					  boardOfChar[2]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 3:
				  if(systemChar=='X' && boardOfChar[3]==' ') {
					  boardOfChar[3]='O';
					  
				  }   
				  else if(systemChar=='O' && boardOfChar[3]==' ') {
					  boardOfChar[3]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
				  
			  case 4:
				  if(systemChar=='X' && boardOfChar[4]==' ') {
					  boardOfChar[4]='X';
					  
				  }   
				  else  if(systemChar=='O' && boardOfChar[4]==' ') {
					  boardOfChar[4]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 5:
				  if(systemChar=='X' && boardOfChar[5]==' ') {
					  boardOfChar[5]='X';
					  
				  }   
				  else if(systemChar=='O' && boardOfChar[5]==' ') {
					  boardOfChar[5]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 6:
				  if(systemChar=='X' && boardOfChar[6]==' ') {
					  boardOfChar[1]='X';
					  
				  }   
				  else  if(systemChar=='O' && boardOfChar[6]==' ') {
					  boardOfChar[1]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 7:
				  if(systemChar=='X' && boardOfChar[7]==' ') {
					  boardOfChar[7]='X';
					  
				  }   
				  else  if(systemChar=='O' && boardOfChar[7]==' ') {
					  boardOfChar[7]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 8:
				  if(systemChar=='X' && boardOfChar[8]==' ') {
					  boardOfChar[8]='X';
					  
				  }   
				  else  if(systemChar=='O' && boardOfChar[8]==' ') {
					  boardOfChar[8]='O';
				  }
				  else {
					  computerMove();
				  }
				  break;
			  case 9:
				  if(systemChar=='X' && boardOfChar[9]==' ') {
					  boardOfChar[9]='X';
					  
				  }   
				  else  if(systemChar=='O' && boardOfChar[9]==' ') {
					  boardOfChar[9]='O';
				  }
				  else {
					 break;
				  }
				  break;
			  default:{
				  System.out.println("Something wrong");
			  }
					  
			  
		   }
		  turnChange();
		  printBoard();
		  WinningCondition();
		  if(winner==0){
			  WinningCondition();
				moveOfPlayer();
			}
		 if(winner==2) {
				System.out.println("Computer Won");
			}
			  
	   }
	  static void WinningCondition() {
		 
		  while(winner!=0) {
			  if(boardOfChar[1]!=' ' &&   boardOfChar[1]==boardOfChar[2] && boardOfChar[2]==boardOfChar[3]) {
				  
				 winner=1;
				 
				 
			  }
			  else if(boardOfChar[1]!=' ' &&boardOfChar[1]==boardOfChar[4] && boardOfChar[4]==boardOfChar[7]) {
				  
				  winner=1;
				
				 
			  }
			  else if(boardOfChar[3]!=' ' &&boardOfChar[3]==boardOfChar[6] && boardOfChar[6]==boardOfChar[9]) {
				  
				  winner=1;
				  
			  }
			  else if(boardOfChar[2]!=' ' &&boardOfChar[2]==boardOfChar[5] && boardOfChar[5]==boardOfChar[8]) {
				 
				  winner=1;
				  
			  }
			  else if(boardOfChar[1]!=' ' &&boardOfChar[1]==boardOfChar[5] && boardOfChar[5]==boardOfChar[9]) {
				  
				  winner=1;
			  }
			  else if(boardOfChar[3]!=' ' &&boardOfChar[3]==boardOfChar[5] && boardOfChar[5]==boardOfChar[7]) {
				 
				  winner=1;
				  
			  }
			  else if(boardOfChar[4]!=' ' &&boardOfChar[4]==boardOfChar[5] && boardOfChar[5]==boardOfChar[6]) {
				
				  winner=1;
			  }
			  else if(boardOfChar[7]!=' ' &&boardOfChar[7]==boardOfChar[8] && boardOfChar[8]==boardOfChar[9]) {
				  
				  winner=1;
			  }
			 
		  }
			 
			  
		  
		/*  if(systemChar=='O') {
			  if(boardOfChar[1]=='O' &&boardOfChar[1]==boardOfChar[2] && boardOfChar[2]==boardOfChar[3]) {
				 
				  winner=2;
				  
			  }
			  else if(boardOfChar[1]!='O' &&boardOfChar[1]==boardOfChar[4] && boardOfChar[4]==boardOfChar[7]) {
				  
				  winner=2;
				 
			  }
			  else if(boardOfChar[3]!=' ' &&boardOfChar[3]==boardOfChar[6] && boardOfChar[6]==boardOfChar[9]) {
				
				  winner=2;
			  }
			  else if(boardOfChar[2]!=' ' &&boardOfChar[2]==boardOfChar[5] && boardOfChar[5]==boardOfChar[8]) {
			
				  winner=2;
				  
			  }
			  else if(boardOfChar[1]!=' ' &&boardOfChar[1]==boardOfChar[5] && boardOfChar[5]==boardOfChar[9]) {
				  
				  winner=2;
			  }
			  else if(boardOfChar[3]!=' ' &&boardOfChar[3]==boardOfChar[5] && boardOfChar[5]==boardOfChar[7]) {
				 
				  winner=2;
				  
			  }
			  else if(boardOfChar[4]!=' ' &&boardOfChar[4]==boardOfChar[5] && boardOfChar[5]==boardOfChar[6]) {
			
				  winner=2;
			  }
			  else if(boardOfChar[7]!=' ' &&boardOfChar[7]==boardOfChar[8] && boardOfChar[8]==boardOfChar[9]) {
				 
				  winner=2;
				  }
			 
			  
		  }
			*/  
		  
		  
	  }
	   
	  

	public static void main(String[] args) {
	    TicTacToe1 rv=new TicTacToe1();
	   
	    rv.boardOfCharacter();
	   
		   if(toss()==1) {
			   playerInput_UC1_();
			   printBoard();
		   }
		   else {
			  
			   computerMove();
			   printBoard();
		   }
	   
	    
	  
	    
		
	}
}
