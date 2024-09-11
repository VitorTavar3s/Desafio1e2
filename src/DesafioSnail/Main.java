package DesafioSnail;



public class Main {
    public static void main(String[] args) {

        Snail snail = new Snail();

        // Coloque os números da matriz na matriz abaixo.
        int[][] matriz = {
                {1,2,3,10,15},
                {4,5,6,11,16},
                {7,8,9,12,17}
        };
        System.out.println( snail.caracolMatriz(matriz));
    }
}
