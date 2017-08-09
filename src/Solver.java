import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;

public class Solver {

    private static int[] board;

    private class Node {
        private int moves;
        private Board board;
        private Node prev;

        public Node(Board initState) {
            moves = 0;
            prev = null;
            board = initState;

        }
    }

    private Solver(Board initial) {          // find a solution to the initial board

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean loop = true;
        String yesNO;

        while(loop) {
            board = createBoard();
            printInitialState(board);
            System.out.print("\nConfirm state(Y/N): ");
            yesNO = scn.next().toLowerCase();
            if(yesNO.equals("y")) {
                loop = false;
            } else if(yesNO.equals("n")) {
                System.out.print("\n\n");
            } else {
                System.out.print("\n\n");
                System.out.println("Invalid response, re-enter initial state.\n");
            }

        }

//
//        Board initial = new Board(tiles);
//        Solver solver = new Solver(initial);
//        for (Board board : solver.solution())
//            System.out.println(board);
//        if (!solver.isSolvable()) System.out.println("No solution possible");
//        else System.out.println("Minimum number of moves = " + solver.moves());
    }

    private static int[] createBoard() {
        Scanner scn = new Scanner(System.in);
        int[] boardValues = new int[9];
        int pCounter = 9;
        int arrayCounter = 0;
        int input;
        System.out.println("Please enter a number from 0-8 (NO REPEATS)\n");
        while(pCounter > 0) {
            System.out.print(pCounter + " slots left:");
            input = scn.nextInt();
            boardValues[arrayCounter] = input;
            arrayCounter++;
            pCounter--;
        }
        return boardValues;
    }

    private static void printInitialState(int[] board) {
        System.out.println("\nInitial State:");
        int lineMark = 0;
        for(int i = 0;i < 9;i++) {
            System.out.print(board[i] + " ");
            lineMark++;
            if(lineMark == 3) {
                System.out.println();
                lineMark = 0;
            }
        }
    }
}
