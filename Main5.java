import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng thừa sau khi nhập số

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần tử cho mảng (các số cách nhau bằng khoảng trắng):");
        for (int i = 0; i < rows; i++) {
            System.out.print("Hàng " + (i + 1) + ": ");
            String[] line = scanner.nextLine().trim().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int sumEven = 0;
        int sumOdd = 0;

        // Duyệt mảng để tính tổng chẵn, lẻ
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumEven += matrix[i][j];
                } else {
                    sumOdd += matrix[i][j];
                }
            }
        }

        System.out.println("Tổng các số chẵn là: " + sumEven);
        System.out.println("Tổng các số lẻ là: " + sumOdd);

        scanner.close();
    }
}