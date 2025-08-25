package main.java.chess;



import main.java.chess.service.ChessService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChessService service = new ChessService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ChessBoard Move Simulator ===");
        System.out.println("Enter input in the form of (Piece, Position) eg: King, D5");
        System.out.println("Type 'exit' to quit the program.\n");

        while (true) {
            System.out.print("Enter input: ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting");
                break;
            }

            try {
                List<String> moves = service.getMoves(input);
                if (moves.isEmpty()) {
                    System.out.println("No valid moves available for given input.");
                } else {
                    System.out.println("Possible Moves: " + String.join(", ", moves));
                }
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
            System.out.println();
        }

        sc.close();
    }
}
