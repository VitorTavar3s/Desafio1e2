package DesafioSnail;

import java.util.*;

public class Snail {

    public static List<Integer> caracolMatriz(int[][] matriz){
        List<Integer> resultado = new ArrayList<>();

        if (matriz == null || matriz.length == 0) {
            return resultado;
        }

        int linhaInicial = 0;
        int linhaFinal = matriz.length - 1;
        int colunaInicial = 0;
        int colunaFinal = matriz[0].length - 1;

        while (linhaInicial <= linhaFinal && colunaInicial <= colunaFinal) {
            for (int col = colunaInicial; col <= colunaFinal; col++) {
                resultado.add(matriz[linhaInicial][col]);
            }
            linhaInicial++;


            for (int row = linhaInicial; row <= linhaFinal; row++) {
                resultado.add(matriz[row][colunaFinal]);
            }
            colunaFinal--;


            if (linhaInicial <= linhaFinal) {
                for (int col = colunaFinal; col >= colunaInicial; col--) {
                    resultado.add(matriz[linhaFinal][col]);
                }
                linhaFinal--;
            }


            if (colunaInicial <= colunaFinal) {
                for (int row = linhaFinal; row >= linhaInicial; row--) {
                    resultado.add(matriz[row][colunaInicial]);
                }
                colunaInicial++;
            }
        }


        return resultado;
    }
}
