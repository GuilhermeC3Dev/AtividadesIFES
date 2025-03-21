import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class AtivDistPoints {
    public static void main(String[] args) {
        // declarando tabela vazia
        int numLinhas = 11;
        int numCol = 5;
        String[][] tabela = new String[numLinhas][numCol];

        //adicionando legenda
        tabela[0][0] = "x1";
        tabela[0][1] = "y1";
        tabela[0][2] = "x2";
        tabela[0][3] = "y2";
        tabela[0][4] = "Distancia";

        //preenchendo a tabela
        for (int i = 1; i<numLinhas; i++) {
            List<Double> xy1 = genPoint();
            List<Double> xy2 = genPoint();
            float dist = calcDist(xy1, xy2);

            tabela[i][0] = String.format("%.2f", xy1.get(0));
            tabela[i][1] = String.format("%.2f", xy1.get(1));
            tabela[i][2] = String.format("%.2f", xy2.get(0));
            tabela[i][3] = String.format("%.2f", xy2.get(1));
            tabela[i][4] = String.format("%.2f", dist);
        }

        //print da tabela
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print(String.format("%-10s", tabela[i][j]));
            }
            System.out.println();
        }
    }

    // gerar 2 pontos
    public static List<Double> genPoint() {
        // gerando numeros aleatorios pra 2 pontos
        double x = genRndNmb();
        double y = genRndNmb();

        // adicionando em uma lista
        List<Double> nums = new ArrayList<>();
        nums.add(x);
        nums.add(y);

        return nums;
    }

    public static float calcDist(List<Double> xy1, List<Double> xy2) {
        float dist = (float) Math.sqrt(Math.pow((xy2.get(0) - xy1.get(0)), 2) + Math.pow((xy2.get(1) - xy1.get(1)), 2));
        return dist;
    }

    // funcao completamente nessessaria de gerar numeros aleatorios
    public static double genRndNmb() {
        return Math.random() * 100;
    }
}
