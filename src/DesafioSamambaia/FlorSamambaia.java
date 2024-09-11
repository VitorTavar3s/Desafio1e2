package DesafioSamambaia;

public class FlorSamambaia {

    public static String tentativaDesenhar(int r1, int x1,int y1,int r2,int  x2,int y2){

        double distanciaEntreCentros = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        if(distanciaEntreCentros + r2 <= r1){
            return "RICO";
        }else {
            return "MORTO";
        }

    }
}
