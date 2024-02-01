package Java_Practices_problem;

//import java.util.Scanner;

//public class SDA {
//
//	public static void main(String[] args) {
//		int[][] matA=new int[2][2];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<2;j++)1
//			{
//				System.out.println("Enter row "+(i+1)+" column "+(j+1)+" value");
//				matA[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++)
//			{
//				System.out.print(matA[i][j]+"\t");
//			}
//			System.out.println();
//		}
//	}
//
//}


import java.util.Scanner;

public class SDA {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub
      int marks[]= {30,23,40,45,10};
      int score[]=new int[5];
    /*  for(int i=0;i<5;i++)
      {
    	  System.out.println(marks[i]);
      }
      System.out.println("Enhanced for");
      for(int x:marks)
      {
    	  System.out.println(x);
      }*/
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
      {
    	  System.out.println("Enter position "+(i+1)+" value");
    	  score[i]=sc.nextInt();
      }
//      for(int i=0;i<5;i++)
//      {
//    	  System.out.println(score[i]);
//      }
      System.out.println(score);
	}

}