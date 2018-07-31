package com.leetcode.my_inverse;

public class MyInverse {
	
	public static void main(String[] args) {
		
		int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][] A1 = {{1,1,0},{1,0,0},{0,1,1},{1,0,1}};
		int[][] result = flipAndInvertImage(A1);
		for(int i=0;i<result.length;i++){
			for(int j=0;j < result[i].length;j++){
				System.out.print(result[i][j] + ",");
			}
			System.out.println();
		}
	}
	
	private static int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int index = 0;
            
            for(int j = A[i].length-1 ;j>=A[i].length/2;j--){
            	//翻
            	int a1 = A[i][index];
            	A[i][index] = A[i][j];
            	A[i][j]=a1;
            	//反
                if(A[i][j] == 0){
                	A[i][j] = 1;
                }else{
                	A[i][j] = 0;
                }
                if(j==A[i].length/2&&A[i].length%2!=0){
                	break;
                }
	                if(A[i][index] == 0){
	                	A[i][index++] = 1;
	                }else{
	                	A[i][index++] = 0;
	                }
                
            }
//            if(A[i].length%2 != 0){
//            	if(A[i][A[i].length/2] == 1){
//            		A[i][A[i].length/2] = 0;
//            	}else{
//            		A[i][A[i].length/2] = 1;
//                }
//            }
        }
        return A;
    }
}
