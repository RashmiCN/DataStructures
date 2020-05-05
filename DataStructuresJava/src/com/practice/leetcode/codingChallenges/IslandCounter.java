package com.practice.leetcode.codingChallenges;

public class IslandCounter {
	public static void main(String[] args) {
//		char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		int count = 0;
//		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if( grid[i][j] == '1') {
					count++;
					markIsland(i,j, grid);
				}
			}
		}
		System.out.println(count);
	}
	
	static void markIsland(int x, int y,char[][] grid) {
		if( x < 0 || x > grid.length -1 || y< 0 || y > grid[0].length - 1  || grid[x][y] != '1') {
			return;
		}
		if(grid[x][y] == '0') {
			return;
		}
		
//		visited[x][y] = true;
		grid[x][y] = '2';
		markIsland(x-1, y,grid);
		markIsland(x+1, y,grid);
		markIsland(x, y-1,grid);
		markIsland(x, y+1,grid);
	}
}
 