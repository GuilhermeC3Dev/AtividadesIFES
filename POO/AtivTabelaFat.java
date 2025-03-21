public class AtivTabelaFat{

    public static long calculaFatorial(int numero){
        long fatorial = 1;
        for (int i=1; i <=numero; i++) {
            fatorial *=i;
        }
        return fatorial;
    }

    public static void main(String[] args){
        imprimirTabela();
    }

    public static void imprimirTabela(){
        int numLinhas = 16;
        int numCol = 3;
        String[][] tabela = new String[numLinhas][numCol];

        for(int i = 0; i < numLinhas; i++) {
            for (int j =0 ; j < numCol; j++){
                tabela[i][0] = String.valueOf(i);
                tabela[i][1] = String.valueOf(calculaFatorial(i));
        
            }
        }
        System.out.println("Número | Fatorial");
        for (int i = 0; i < numLinhas; i++){
            System.out.println(tabela[i][0]+  "      | " + tabela[i][1]);
        }
        
        
    }
}