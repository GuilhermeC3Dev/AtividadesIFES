import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = ColetarInput.coletarInput();
        int mediaPar = CalcularMediaPar.calcularMediaPares(lista);
        int mediaImp = CalcularMediaImp.calcularMediaImp(lista);

        System.out.println("Essa é sua lista: " + lista);
        System.out.println("Essa é a media dos numeros pares: " + mediaPar);
        System.out.println("Essa é a media dos numeros impares: " + mediaImp);
    }
}

class ColetarInput {
    public static ArrayList<Integer> coletarInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int inputNum = 1;
        int mediaNumPar;
        int mediaNumInp;

        while (inputNum != 0) {
            System.out.println("Digite um numero, 0 para finalizar");
            inputNum = scanner.nextInt();
            if (inputNum!=0){
                lista.add(inputNum);
            }
        }
        scanner.close();
        return lista;
    }
}

class CalcularMediaPar {
    public static int calcularMediaPares(ArrayList<Integer> lista) {

        int mediaPar = 0;
        int somaPar = 0;
        int tamanhoLista = 0;

        for (int num : lista){
            if (num%2==0){
                somaPar += num;
                tamanhoLista += 1;
            }
        }
        mediaPar = somaPar/tamanhoLista;

        return mediaPar;
    }
}

class CalcularMediaImp {
    public static int calcularMediaImp(ArrayList<Integer> lista) {

        int mediaImp = 0;
        int tamanhoLista = 0;
        int somaImp = 0;

        for (int num : lista){
            if (num%2!=0){
                tamanhoLista +=1;
                somaImp+=num;
            }
            mediaImp = somaImp/tamanhoLista;
        }
        return mediaImp;
    }
}

