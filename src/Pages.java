import java.util.Scanner;

public class Pages {

    public Pages(int age) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Pages book = new Pages (age);
        int pagesToRead = book.calculatePagesToRead();

        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");
    }

    private int calculatePagesToRead() {
        return 0;
    }
}
