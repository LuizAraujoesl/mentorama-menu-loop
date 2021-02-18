package exercicioModulo06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alunos {
    Scanner receber = new Scanner(System.in);

    // atributos
    ArrayList<String> alunos = new ArrayList<>();

    // Datas
    List<String> datas = new ArrayList<>();

    // matriz
    String[][] tabela = new String[6][6];


    public Alunos() {
         
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                tabela[i][j] = "Present";
            }
        }

        // Luiz , Luna, Joel, Mary, Lucy
        tabela[0][0] = "    ";
        tabela[1][0] = "Luiz";
        tabela[2][0] = "Luna";
        tabela[3][0] = "Joel";
        tabela[4][0] = "Mary";
        tabela[5][0] = "Lucy";

        addDatas();
    }

    // methodo adicionar aluno
    public void addAlunos() {

        for (int i = 0; i < 5; i++) {
            System.out.println("\t Digite aluno: ");
            String name = receber.nextLine();

            alunos.add(name);

        }

        tabela[0][0] = "        ";
        tabela[1][0] = alunos.get(0);
        tabela[2][0] = alunos.get(1);
        tabela[3][0] = alunos.get(2);
        tabela[4][0] = alunos.get(3);
        tabela[5][0] = alunos.get(4);

    }// fim add alunos

    public void mostrarIndice() {

        System.out.println();

        String[][] matriz = new String[6][6];

        matriz[0][0] = "      ";
        matriz[0][1] = "Segunda";
        matriz[0][2] = "Terça  ";
        matriz[0][3] = "Quarta ";
        matriz[0][4] = "Quinta ";
        matriz[0][5] = "Sexta  ";

        matriz[0][0] = "    ";
        matriz[1][0] = alunos.get(0);
        matriz[2][0] = alunos.get(1);
        matriz[3][0] = alunos.get(2);
        matriz[4][0] = alunos.get(3);
        matriz[5][0] = alunos.get(4);

        matriz[1][1] = "  1.1  ";
        matriz[1][2] = "  1.2  ";
        matriz[1][3] = "  1.3  ";
        matriz[1][4] = "  1.4  ";
        matriz[1][5] = "  1.5  ";

        matriz[2][1] = "  2.1  ";
        matriz[2][2] = "  2.2  ";
        matriz[2][3] = "  2.3  ";
        matriz[2][4] = "  2.4  ";
        matriz[2][5] = "  2.5  ";

        matriz[3][1] = "  3.1  ";
        matriz[3][2] = "  3.2  ";
        matriz[3][3] = "  3.3  ";
        matriz[3][4] = "  3.4  ";
        matriz[3][5] = "  3.5  ";

        matriz[4][1] = "  4.1  ";
        matriz[4][2] = "  4.2  ";
        matriz[4][3] = "  4.3  ";
        matriz[4][4] = "  4.4  ";
        matriz[4][5] = "  4.5  ";

        matriz[5][1] = "  5.1  ";
        matriz[5][2] = "  5.2  ";
        matriz[5][3] = "  5.3  ";
        matriz[5][4] = "  5.4  ";
        matriz[5][5] = "  5.5  ";

        System.out.println("\t Siga indice para adicionar a Chamada Ex. Aluno 01 = 1.1 ");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("  %s |", matriz[i][j]);
            }
        }

    }

    public void addDatas() {
        datas.add("    ");
        datas.add("Segunda");
        datas.add("Terça  ");
        datas.add("Quarta ");
        datas.add("Quinta ");
        datas.add("Sexta  ");
    }

    // methodo adicionar data
    public void addChamada(int linha, int coluna, String valor) {

       if (linha == 0 || coluna == 0 || valor == "0") {
        tabela[linha][coluna] = "Present";
       } else {
        tabela[linha][coluna] = valor;
       }
        

        /*
         * tabela[0][1] = datas.get(0); tabela[0][2] = datas.get(1); tabela[0][3] =
         * datas.get(2); tabela[0][4] = datas.get(3); tabela[0][5] = datas.get(4);
         */

    }// fim add alunos

    public void addValoresMatriz() {

    }

    public void imprimir() {

        System.out.println();
        System.out.println();
        System.out.println("\t ********** Diário de Clasee **********");

        addDatas();

        tabela[0][0] = datas.get(0);
        tabela[0][1] = datas.get(1);
        tabela[0][2] = datas.get(2);
        tabela[0][3] = datas.get(3);
        tabela[0][4] = datas.get(4);
        tabela[0][5] = datas.get(5);

        for (int i = 0; i < tabela.length; i++) {
            System.out.println();
            for (int j = 0; j < tabela.length; j++) {
                if(tabela[i][i] == null){
                    System.out.printf("  %s |", tabela[i][j] = "Present");
                }
                
                else{
                    System.out.printf("  %s |", tabela[i][j]);
                }
                
            } // fim primeiro for

        } // fim segundo for
    }// fim imprimir

}
