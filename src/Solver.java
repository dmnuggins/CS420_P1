import java.util.Scanner;

public class Solver {
    private Solver(Board initial) {          // find a solution to the initial board

    }
    private boolean isSolvable() {           // is the initial board solvable?
        return false;
    }
    private int moves() {                    // return min number of moves to solve initial board; -1 if no solution
        return 0;
    }
    private Iterable<Board> solution() {     // return an Iterable of board positions in solution
        return null;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] tiles = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tiles[i][j] = scn.nextInt();
        Board initial = new Board(tiles);
        Solver solver = new Solver(initial);
        for (Board board : solver.solution())
            System.out.println(board);
        if (!solver.isSolvable()) System.out.println("No solution possible");
        else System.out.println("Minimum number of moves = " + solver.moves());
    }
}
