import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 배열의 크기 설정 3
        int m = sc.nextInt();   // 배열의 크기 설정 3

        int[][] arr1 = new int[n][m];   // 3*3 배열 arr1을 생성
        int[][] arr2 = new int[n][m];   // 3*3 배열 arr2을 생성

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();  // 배열에다가 3*3의 숫자를 넣음.
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();  // 배열에다가 3*3의 숫자를 넣음.
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");    // 3*3 배열 arr1과 arr2를 하나로 합치고 이를 출력.
                if (j == m - 1) {   // 줄 바꿈.
                    System.out.println();
                }
            }

        }
    }
}