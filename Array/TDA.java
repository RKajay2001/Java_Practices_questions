package Java_Practices_problem;

import java.util.Scanner;

public class TDA {

	public static void main(String[] args) {
		int[][] matA=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter row "+(i+1)+" column "+(j+1)+" value");
				matA[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
			{
				System.out.print(matA[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int x[]:matA)
		{
			for(int y:x)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
	}

}
