

public class AtivSenCosSin {

    public static void main(String[] args) {
        imprimirTabela();
    }

    public static void imprimirTabela () {

        //declarando tabela vazia
        int numLinhas = 362;
        int numCol = 4;
        String[][] tabela = new String[numLinhas][numCol];


        //preenchendo tabela
        for (int i = 0 ; i < numLinhas ; i++) {
            for (int j = 0 ; j < numCol ; j++) {
                tabela[i][0] = String.valueOf(i-1);
                tabela[i][1] = String.format("%.3f", Math.sin(Math.toRadians(i-1)));
                tabela[i][3] = String.format("%.3f", Math.cos(Math.toRadians(i-1)));
                tabela[i][3] = String.format("%.3f", Math.tan(Math.toRadians(i-1)));
            }3
        }
        //adicionando categorias na tabela
        tabela[0][0] = "Angulo";
        tabela[0][1] = "Seno";
        tabela[0][2] = "Cosseno";
        tabela[0][3] = "Tangente";

        //print da tabela
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print(String.format("%-10s", tabela[i][j]));
            }
            System.out.println();
        }
    }
}
