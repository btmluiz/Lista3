package com.company;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        int tam = 3;
        int[] qtdFrango = new int[tam];
        int[] qtdMisto = new int[tam];
        int menorFrango = 0, menorMisto = 0;
        int maiorFrango = 0, maiorMisto = 0;
        int totalFrango = 0, totalMisto = 0;
        float menorDia = 0, maiorDia = 0, totalF, totalM;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tam; i++){
            float aux = 0F;

            System.out.println("Dia " + (i+1));
            do {
                System.out.print("Digite a quantidade de coxoes de frango vendidos: ");
                qtdFrango[i] = scan.nextInt();
            } while (qtdFrango[i] > 100 || qtdFrango[i] < 0);
            totalFrango += qtdFrango[i];
            do {
                System.out.print("Digite a quantidade de croissants misto vendidos: ");
                qtdMisto[i] = scan.nextInt();
            } while (qtdMisto[i] > 100 || qtdMisto[i] < 0);
            totalMisto += qtdMisto[i];

            aux = (float) ((((float) qtdFrango[i]) * 4.0) + (((float) qtdMisto[i]) * 3.50));

            if(aux > maiorDia || maiorDia == 0F)
                maiorDia = aux;

            if (aux < menorDia || menorDia == 0F)
                menorDia = aux;
        }

        totalF = ((float) totalFrango) * 4.0F;
        totalM = ((float) totalMisto) * 3.50F;
        System.out.println("Faturamento total: " + ((double) totalF + totalM));
        System.out.println("Menor faturamento: " + menorDia);
        System.out.println("Maior faturamento: " + maiorDia);

        if (totalF > totalM)
            System.out.println("Mais vendido: coxao de frango");
        else if(totalF == totalM)
            System.out.println("Mais vendido: Empate");
        else
            System.out.println("Mais vendido: coxao de frango");
    }
}
