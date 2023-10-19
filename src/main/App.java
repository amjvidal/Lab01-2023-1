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

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
