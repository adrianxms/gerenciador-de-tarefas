import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Testes {
    public static void main(String[] args) {
        /**     int menu;
        int esc1, esc2;
        int y = 0;
        Scanner scan = new Scanner(System.in);

      System.out.println("1 - Adicionar Tarefa\n2 - Lista de Tarefas\n3 - Editar Tarefa\n4 - Excluir Tarefa\n5 - Sair");
    menu = scan.nextInt();
       switch(menu){
           case 1:
               System.out.println("você escolheu 1");
               break;
           case 2:
               System.out.println("você escolheu 2");
               break;
           case 3:
               System.out.println("você escolheu 3");
               break;
           case 4:
               System.out.println("você escolheu 4");
               break;
           case 5:
               System.out.println("você escolheu 5");
               break;



        }*/

  /**     ArrayList<Integer> numero = new ArrayList<Integer>();
        do{ System.out.println("Atual lista:\n___________________________________");

        for (int i = 0; i < numero.size(); i++) {
            System.out.println(numero.get(i));
        }

            System.out.println("___________________________________");


               System.out.println("continuar? (1 - SIM  2 - NÃO)");

                  esc1 = scan.nextInt();

          if(esc1 == 1){


            for(int g = 0; g == y; g++){

                System.out.println("você deseja adicionar um numero? (1 sim 2 não)");
                esc2 = scan.nextInt();

            if(esc2 == 1){
                System.out.println("qual numero adicionar?");
                int n = scan.nextInt();
                numero.add(n);
            }else {
                y++;

             }
            }
          }
                  }while(esc1 == 1);




*/

/**Scanner scan = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Carlos");
        nome.add("Adrian");
        nome.add("Alex");
        nome.add("Jhonathan");

        System.out.println("___________________________________________________________");
        for (int i = 0; i < nome.size(); i++) {
            System.out.println(nome.get(i));
        }
        System.out.println("___________________________________________________________");

        System.out.println("gostaria de alterar algum? (1 - SIM 2 - NÃO)");
        int a = scan.nextInt();
        if(a == 1){
            System.out.println("Qual deseja alterar: ");
            int b = scan.nextInt();
            System.out.println("Novo nome: ");
            String c = scan.next();
            nome.set(b-1, c);

            System.out.println("Lista Atual: " + nome);
        }else;



scan.close();*/

int menu;
Scanner scan = new Scanner(System.in);
        JOptionPane.showInputDialog("1 - Adicionar Tarefa\n2 - Lista de Tarefas\n3 - Editar Tarefa\n4 - Remover Tarefa\n5 - Sair");
        menu = scan.nextInt();
        JOptionPane.showMessageDialog(null, menu);
    }
}