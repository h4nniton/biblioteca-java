package br.senai.jandira.sp.Model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    br.senai.jandira.sp.Model.registerUser registerUser = new registerUser();
    br.senai.jandira.sp.Model.registerBook registerBook = new registerBook();

    public void Menu(){

        boolean exit = true;

        while(exit) {

            System.out.println("----------------------------");
            System.out.println("        ✷ M E N U ✷");
            System.out.println("----------------------------");
            System.out.println(" ");
            System.out.println("Escolha uma opção:");
            System.out.println("- 1 : Cadastrar Cliente ");
            System.out.println("- 2 : Cadastrar Livro ");
            System.out.println("- 3 : Consultar Livro ");
            System.out.println("- 4 : Exit ");
            System.out.println(" ");

            int opcao = teclado.nextInt();
            System.out.println(" ");

            switch (opcao){

                case 1:
                    registerUser.userRegister();
                    break;

                case 2:
                    registerBook.bookRegister();
                    break;

                case 3:
                    // terminar quando fizer a consulta //
                    break;
            }

        }

    }

}
