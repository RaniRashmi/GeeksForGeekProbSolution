package Graph;

public class FindIsland {
    static final int ROW = 5, COL= 5;
    
	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 1 }, 
            { 1, 0, 0, 1, 1 }, 
            { 0, 0, 0, 0, 0 }, 
            { 1, 0, 1, 0, 1 } }; 
            FindIsland I = new FindIsland(); 
	        System.out.println("Number of islands is: " + I.countIslands(M)); 
	}

	private int countIslands(int[][] matrix) {
		boolean [][] visited = new boolean[ROW][COL];
		int count =0;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				if(matrix[i][j] ==1 && !visited[i][j]) {
					dfs(matrix, i, j, visited);
					count++;
				}
			}
		}
		return count;
	}

	private void dfs(int[][] matrix, int row, int col, boolean[][] visited) {
		int [] rowNbr = {-1, -1,-1, 0, 0, 1, 1, 1};
		int [] colNbr = {-1, 0, 1, -1, 1,-1, 0, 1};
		
		visited[row][col] = true;
		for(int i=0;i<8;i++) {
			if(isCellIncludedInDFS(matrix,row+rowNbr[i],col+colNbr[i], visited)) {
				dfs(matrix,row+rowNbr[i],col+colNbr[i], visited);
			}
		}
	}

	private boolean isCellIncludedInDFS(int[][] matrix, int row, int col, boolean[][] visited) {
		return (row >= 0 && row < ROW && col >=0 && col < COL && (matrix[row][col] == 1 && !visited[row][col]));
	}

}
