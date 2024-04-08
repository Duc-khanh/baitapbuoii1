import java.util.Scanner;

public class ktrnamnhuan {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int year;
        System.out.println("nhap mot nam");
        year = Scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

