class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int iniColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != iniColor) {
            return;
        }
        image[sr][sc] = color;
        fill(image, sr - 1, sc, color, iniColor);
        fill(image, sr + 1, sc, color, iniColor);
        fill(image, sr, sc - 1, color, iniColor);
        fill(image, sr, sc + 1, color, iniColor);
    }
}
