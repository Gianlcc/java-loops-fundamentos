package loops;

public class Matriz {

    public static void main(String[] args) {
        int[][] jogoDaVelha = new int[3][3];
        jogoDaVelha[0][0] = 2;
        jogoDaVelha[1][0] = 1;
        jogoDaVelha[2][2] = 2;

        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(jogoDaVelha[i][j]);
            }
        }
    }
}
