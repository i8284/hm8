import java.util.Random;

public class Main {
    public static final int SIZE = 8;
    static int [][] colors = new int [SIZE][SIZE];
    static int [][] rotatedColors = new int [SIZE][SIZE];
    static Random random = new Random();

    public static void main(String[] args) {
        rotateColors();

    }


    public static void rotateColors() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Исходный матрица:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }


        System.out.println("Перевернутая матрица на 90 градусов:");


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][i] = colors[SIZE -1 - i][j];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }

}
