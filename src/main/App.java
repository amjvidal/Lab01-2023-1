package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for(int i = 0; i < arrayOrdenado.length; i++){
            if(arrayOrdenado[i] == num){
                return 1;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        int memoria = -9999;
        for(int i=0;i<arrayDesordenado.length;i++){
            if(arrayDesordenado[i]>memoria){
                memoria=arrayDesordenado[i];
            }
        }
        return memoria;
    }

    public static Double parMaisProximo(Integer[][] pares){
        if (pares.length < 2) {
            return null; 
        }

        double menorDistancia = Double.MAX_VALUE; 

        for (int i = 0; i < pares.length; i++) {
            for (int j = i + 1; j < pares.length; j++) {
                double distancia = Math.sqrt(Math.pow(pares[i][0] - pares[j][0], 2) + Math.pow(pares[i][1] - pares[j][1], 2));
                if (distancia < menorDistancia) {
                    menorDistancia = distancia;
                }
            }
        }

        return menorDistancia;
    }
}
