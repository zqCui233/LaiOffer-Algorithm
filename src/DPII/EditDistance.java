package DPII;

public class EditDistance {
    public int editDistance(String one, String two) {
        int[][] dis = new int[one.length() + 1][two.length() + 1];

        for (int i = 0; i <= one.length(); i++) {
            for (int j = 0; j <= two.length(); j++) {
                if (i == 0) dis[i][j] = j;
                else if (j == 0) dis[i][j] = i;
                else if (one.charAt(i - 1) == two.charAt(j - 1)) dis[i][j] = dis[i - 1][j - 1];
                else {
                    dis[i][j] = Math.min(dis[i - 1][j - 1] + 1, dis[i - 1][j] + 1);
                    dis[i][j] = Math.min(dis[i][j - 1] + 1, dis[i][j]);
                }
            }
        }

        return dis[one.length()][two.length()];
    }
}
