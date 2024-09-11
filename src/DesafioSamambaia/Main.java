package DesafioSamambaia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FlorSamambaia flor = new FlorSamambaia();


        System.out.println("Digite raio do caçador:");
        int r1 = scanner.nextInt();
        System.out.println("Digite a coordenada X do caçador:");
        int x1 = scanner.nextInt();
        System.out.println("Digite a coordenada Y do caçador:");
        int y1 = scanner.nextInt();
        System.out.println("Digite raio da flor:");
        int r2 = scanner.nextInt();
        System.out.println("Digite a coordenada X da flor:");
        int x2 = scanner.nextInt();
        System.out.println("Digite a coordenada Y da flor:");
        int y2 = scanner.nextInt();

        System.out.printf(flor.tentativaDesenhar(r1, x1, y1, r2, x2, y2));


    }
}