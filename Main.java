/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();
        char[][] matrix = new char[y][x];

        for (int j = 0; j < y; j++)
            for (int i = 0; i < x; i++)
                matrix[j][i] = in.next().charAt(0);
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++)
                if (matrix[j][i] == '0') {
                    if (matrix[j - 1][i] == '*' && j != 0) {
                        matrix[j][i]++;
                    }
                    if (matrix[j + 1][i] == '*' && j != y - 1) {
                        matrix[j][i]++;
                    }
                    if (matrix[j - 1][i] == '*' && j != 0) {
                        matrix[j][i]++;
                    }
                    if (matrix[j][i - 1] == '*' && i != 0) {
                        matrix[j][i]++;
                    }
                    if (matrix[j][i + 1] == '*' && i != x - 1) {
                        matrix[j][i]++;
                    }
                    if (matrix[j - 1][i - 1] == '*' && i != 0 && j != 0) {
                        matrix[j][i]++;
                    }
                    if (matrix[j + 1][i + 1] == '*' && i != x - 1 && j != y - 1) {
                        matrix[j][i]++;
                    }
                    if (matrix[j - 1][i + 1] == '*' && j != 0 && i != x - 1) {
                        matrix[j][i]++;
                    }
                    if (matrix[j + 1][i - 1] == '*' && j != y - 1 && i != 0) {
                        matrix[j][i]++;
                    }

                }
        }
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                System.out.print(matrix[j][i]);
            }
            System.out.print("\n");
        }
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        char matrix[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            String input = in.next();
            matrix[i] = input.toCharArray();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    if (i != 0 && matrix[i - 1][j] == '*') {
                        matrix[i][j]++;
                    }
                    if (i != m - 1 && matrix[i + 1][j] == '*') {

                        matrix[i][j]++;
                    }
                    if (j != 0 && matrix[i][j - 1] == '*') {
                        matrix[i][j]++;
                    }
                    if (j != n - 1 && matrix[i][j + 1] == '*') {
                        matrix[i][j]++;
                    }
                    if (i != m - 1 && j != n - 1 && matrix[i + 1][j + 1] == '*') {
                        matrix[i][j]++;

                    }
                    if (i != 0 && j != 0 && matrix[i - 1][j - 1] == '*') {
                        matrix[i][j]++;
                    }
                    if (j != 0 && i != m - 1 && matrix[i + 1][j - 1] == '*') {
                        matrix[i][j]++;
                    }
                    if (j != n - 1 && i != 0 && matrix[i - 1][j + 1] == '*') {
                        matrix[i][j]++;
                    }
                }

            }



        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(matrix[k][l]);

            }
            System.out.print("\n");
        }
    }
}


