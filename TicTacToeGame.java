package Array2D;
import java.util.Scanner;
public class TicTacToeGame {
	public static void ticTacX(char pos,char arr[][]) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]==pos){
					arr[i][j]='X';
				}
				
			}
		}
		for(int p=0;p<3;p++) {
			for(int q=0;q<3;q++) {
				System.out.print(arr[p][q]+" ");
			}
			System.out.println();
		}
		
	}
	public static void ticTacO(char pos,char arr[][]) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]==pos){
					arr[i][j]='O';
				}
			}
		}
		for(int p=0;p<3;p++) {
			for(int q=0;q<3;q++) {
				System.out.print(arr[p][q]+" ");
			}
			System.out.println();
		}
	}
	public static int xWinLoss(char arr[][]) {
		int c=0;
		if(arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X') {
			c=1;
		}else if(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X') {
			c=1;
		}else if(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X') {
			c=1;
		}else if(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X') {
			c=1;
		}else if(arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O') {
			c=2;
		}else if(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O') {
			c=2;
		}else if(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O') {
			c=2;
		}else if(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O') {
			c=2;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][]arr=new char[3][3];
		char count='a';
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=count;
				count++;
			}
		}
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		char position;
		int c;
		for(int k=1;k<=9;k++) {
			if(k%2==0) {
				System.out.println("Enter the position ,you want X");
				position=sc.next().charAt(0);
				ticTacX(Character.toLowerCase(position),arr);
				c=xWinLoss(arr);
				if(c==1) {
					System.out.println("Player1 won ");
					break;
				}
			}else {
				System.out.println("Enter the position ,you want O");
				position=sc.next().charAt(0);
				ticTacO(Character.toLowerCase(position),arr);
				c=xWinLoss(arr);
				if(c==2) {
					System.out.println("Player2 won ");
					break;
				}
			}
		}
	}
}