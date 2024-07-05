package arrays;

public class MovieTheatre {
    private final char[][] seats;

    // Constructor
    public MovieTheatre(int rows, int cols) {
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                seats[i][j] = 'O';
        }
    }

    // display the seats
    public void displaySeats() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seats[0].length; i++)
            System.out.print(" " + i);
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < seats[i].length; j++)
                System.out.print(" " + seats[i][j]);
            System.out.println();
        }
    }

    // reserve a seat
    public boolean reserveSeat(int row, int col) {
        if (row < 1 || row > seats.length || col < 1 || col > seats[0].length) {
            System.out.println("Wrong input!");
            return false;
        }
        if (seats[row - 1][col - 1] == 'B') {
            System.out.println("That ticket has already been purchased!");
            return false;
        }
        seats[row - 1][col - 1] = 'B';
        return true;
    }

    public static void main(String[] args) {
        MovieTheatre theatre = new MovieTheatre(7, 8);
        theatre.displaySeats();
        theatre.reserveSeat(1, 1);
        theatre.reserveSeat(1, 1);
        theatre.reserveSeat(1, 2);
        theatre.displaySeats();
    }



}
