package Lec_20;
import java.util.*;
public class Queens_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int seats=sc.nextInt();
int queens=sc.nextInt();
boolean seat[]=new boolean[seats];
Queen(queens,seat,"");
}
public static void Queen(int queens,boolean[] seats, String path)
{
	if(queens==0)
	{
		System.out.println(path);
		return;
	}
	for(int i=0;i<seats.length;i++)
	{
		if(seats[i]==false)
		{
			seats[i]=true;
			Queen(queens-1,seats,path+"q"+i);
			seats[i]=false;
		}
	}
}
}

