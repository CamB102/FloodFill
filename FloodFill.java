package algorithmday1;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 }, };
		int sr = 1;
		int sc = 1;
		int color = 2;

		System.out.println("Old image: ");
		for (int[] row : image) {
			for (int pixel : row) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("New image: ");
		fillColor(image, sr, sc, color, image[sr][sc]);
		for (int[] row : image) {
			for (int pixel : row) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}

	}

	public static void fillColor(int image[][], int i, int j, int color, int num) {
		// check index [i][j] inside [m][n]
		// check whether new image and old image has the same color
		if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != num) {
			return;
		}

		image[i][j] = color;
		fillColor(image, i + 1, j, color, num);// bottom
		fillColor(image, i - 1, j, color, num);// top
		fillColor(image, i, j + 1, color, num);// right
		fillColor(image, i, j - 1, color, num);// left

	}
}
