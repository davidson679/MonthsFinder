/**Created by
 * Harley Davidson
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthsFinder {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner scanner = new Scanner(System.in);
        try {
            int month = scanner.nextInt();
            System.out.print(months[month]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Index is out of bounds");
        } catch (InputMismatchException exception) {
            System.out.print("Input mismatch");
        }
    }

}