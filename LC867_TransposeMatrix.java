// 1 2 3 4
// 5 6 7 8
// 9 0 1 2

// 1 5 9
// 2 6 0
// 3 7 1
// 4 8 2

public class Solution {
	public int[][] transpose(int[][] A) {
		int rows = A[0].length;
		int cols = A.length;
		int[][] transp = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transp[i][j] = A[j][i];
			}
		}

		return transpose;
	}
}
