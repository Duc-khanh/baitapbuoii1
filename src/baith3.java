import java.util.Scanner;

public class baith3 {
    public static void main(String[] args) {
        System.out.println(" Trinh giai phuong trinh bac nhat");
        System.out.println("Cho phương trình 'a * x + b = c', hãy nhập hằng số:");
        Scanner Scanner = new Scanner(System.in);
        System.out.print("a:");
        double a = Scanner.nextDouble();
        System.out.print("b:");
        double b = Scanner.nextDouble();
        System.out.print("c:");
        double c = Scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Truyền phương trình với x = %f!\\n\", trả lời");
        } else {
            if (b == c) {
                System.out.print(" giqi phqp tqt ca la X");
        } else {
                System.out.println("khong co giai phap");
            }
        }
    }
}
