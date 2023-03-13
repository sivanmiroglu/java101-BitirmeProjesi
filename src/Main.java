import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome the mine sweeper game!\n"
                + "First of all you should declare the size of the gameboard."
                + "Enter the number of rows: ");
        int numOfRows = scanner.nextInt();

        System.out.print("Now, enter the number of columns: ");
        int numOfColumns = scanner.nextInt();

        MinesWeeper game = new MinesWeeper (numOfRows, numOfColumns);
        game.run();

        scanner.close();
    }
}