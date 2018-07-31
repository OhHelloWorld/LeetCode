package com.leetcode.city_sky;

public class CitySky {
	
	public static void main(String[] args) {
		int[][] grid = {{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0}};
		int result = maxIncreaseKeepingSkyline(grid);
		System.out.println(result);
	}
	
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
        
		int result = 0;
		
		for(int i = 0;i < grid.length;i++){
        	for(int j = 0;j<grid[i].length;j++){
        		int horTemp = 0;
        		int verTemp = 0;
        		int horMax = grid[i][0];
        		int verMax = grid[0][j];
        		while(horTemp < grid[i].length){
        			if(horMax < grid[i][horTemp]){
        				horMax = grid[i][horTemp];
        			}
        			horTemp++;
        		}
        		while(verTemp < grid.length){
        			if(verMax < grid[verTemp][j]){
        				verMax = grid[verTemp][j];
        			}
        			verTemp++;
        		}
        		int max = horMax > verMax ? verMax : horMax;
        		if(max > grid[i][j]){
        			result += (max - grid[i][j]);
        		}
        	}
        }
        return result;
    }
}
