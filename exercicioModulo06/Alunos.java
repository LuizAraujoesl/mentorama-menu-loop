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

    // methodo adicionar aluno
    public void addAlunos() {
        
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Digite valor aluno: ");
            String name = receber.nextLine();

            alunos.add(name);
            tabela[0][0] = "........";
        tabela[1][0] = alunos.get(0);
        tabela[2][0] = alunos.get(1);
        tabela[3][0] = alunos.get(2);
        tabela[4][0] = alunos.get(3);
        tabela[5][0] = alunos.get(4);
        }

        

    }// fim add alunos

    // methodo adicionar data
    public void addDatas() {

        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Digite valor data da Chamada Ex. dd/mm/yy: ou absence(Falta): ");
            String data = receber.nextLine();

            alunos.add(data);
        }

    }// fim add alunos


    public void imprimir(){

        tabela[0][0] = "        ";
        tabela[1][0] = "Aluno 01";
        tabela[2][0] = "Aluno 02";
        tabela[3][0] = "Aluno 03";
        tabela[4][0] = "Aluno 04";
        tabela[5][0] = "Aluno 05";
        for (int i = 0; i < tabela.length; i++) {
            System.out.println();
            for (int j = 0; j < tabela.length; j++) {
                System.out.printf("[ %s ]", tabela[i][j]);
            }// fim primeiro for
            
        }// fim segundo for
    }// fim imprimir

}
