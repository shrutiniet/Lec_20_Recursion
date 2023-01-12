package Lec_20;
import java.util.*;
public class Maze_Blocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean [][] Visited=new boolean[maze.length][maze[0].length];
		Maze(0,0,"",maze,Visited);
	}
public static void Maze(int r, int c, String path, int[][]maze, boolean[][]visited)
{
	if(r<0 || c<0 || r==maze.length || c==maze[0].length || maze[r][c]==1 ||visited[r][c])
	{
		return;
	}
	if(r==maze.length-1 && c==maze[0].length-1)
	{
		System.out.println(path);
		return;
	}
	visited[r][c]=true;
	Maze(r-1,c,path+"U",maze,visited);
	Maze(r+1,c,path+"D",maze,visited);
	Maze(r,c+1,path+"R",maze,visited);
	Maze(r,c-1,path+"L",maze,visited);
	visited[r][c]=false;
}
}
