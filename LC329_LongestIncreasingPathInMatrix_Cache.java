
public class LC329_LongestIncreasingPathInMatrix_Cache {

	public static final int[][] dirs = {
		{0, 1}, 
		{1, 0}, 
		{0, -1}, 
		{-1, 0}
	};
	
	public static void main(String[] args) {
		int[][] test = {
				{9, 9, 4},
				{6, 6, 8},
				{2, 1, 1}
		};
		
		System.out.println(longestIncreasingPath(test));

	}
	
	public static int longestIncreasingPath(int[][] matrix) {
		if(matrix.length == 0) {
			return 0;
		}
		
		int rows = matrix.length, cols = matrix[0].length;
		int[][] cache = new int[rows][cols];
		int max = 1;
		
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				int len = dfs(matrix, i, j, rows, cols, cache);
				max = Math.max(len, max);
			}
		}
		
//		for (int i = 0; i < cache.length; i++) {
//			System.out.println();
//			for (int j = 0; j < cache[0].length; j++) {
//				System.out.print(cache[i][j] + " ");
//			}
//		}
//		System.out.println("\n");
		
		
		return max;
	}
	
	public static int dfs(
			int[][] matrix, int rowIdx, int colIdx, int maxRow, int maxCol, int[][] cache) {
		if (cache[rowIdx][colIdx] != 0) {
			return cache[rowIdx][colIdx];
		}
		
		int max = 1;
		
		for (int[] dir : dirs) {
			int x = rowIdx + dir[0], y = colIdx + dir[1];
			if (x < 0
				|| x >= maxRow
				|| y < 0
				|| y >= maxCol
				|| matrix[x][y] <= matrix[rowIdx][colIdx]) {
				continue;
			}
			
			int len = 1 + dfs(matrix, x, y, maxRow, maxCol, cache);
			max = Math.max(max, len);
		}
		
		cache[rowIdx][colIdx] = max;
		return max;
	}

}
