
public class LC329_LongestIncreasingPathInMatrix_NoCache {

	public static final int[][] dirs = {
		{0, 1},
		{1, 0},
		{0, -1},
		{-1, 0}
	};
	
	public static void main(String[] args) {
		int[][] testMatrix = {
			{9, 9, 4},
			{6, 6, 8},
			{2, 1, 1}
		};

		System.out.println(longestIncreasingPath(testMatrix));
	}
	
	public static int longestIncreasingPath(int[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		
		int maxRows = matrix.length, maxCols = matrix[0].length;
		int max = 1;
		for (int row = 0; row < maxRows; row++) {
			for (int col = 0; col < maxCols; col++) {
				int len = dfs(matrix, row, col, maxRows, maxCols);
				max = Math.max(max, len);
			}
		}
		return max;
	}
	
	public static int dfs(
			int[][] matrix, int row, int col, int maxRows, int maxCols) {
		int max = 1;
		
		for (int[] dir : dirs) {
			int nextRow = row + dir[0];
			int nextCol = col + dir[1];
			
			if (nextRow < 0
				|| nextRow >= maxRows
				|| nextCol < 0
				|| nextCol >= maxCols
				|| matrix[nextRow][nextCol] <= matrix[row][col]) {
				continue;
			}
			
			int len = 1 + dfs(matrix, nextRow, nextCol, maxRows, maxCols);
			max = Math.max(max, len);
		}
		return max;
	}

}
