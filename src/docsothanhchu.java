import java.util.Scanner;

public class docsothanhchu {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String readThreeDigitNumber(int n) {
        if (n == 0) {
            return "zero";
        }

        String result = "";
        int hundredsDigit = n / 100;
        if (hundredsDigit > 0) {
            result += ones[hundredsDigit] + " hundred ";
        }

        n %= 100;
        if (n >= 20) {
            int tensDigit = n / 10;
            result += tens[tensDigit] + " ";
            n %= 10;
        }

        if (n > 10 && n < 20) {
            result += teens[n % 10];
        } else {
            result += ones[n];
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số  có tối đa 3 chữ  ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ.");
        } else {
            System.out.println(readThreeDigitNumber(number));
        }
    }
}

