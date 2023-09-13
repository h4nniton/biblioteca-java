package br.senai.jandira.sp.Model;

import br.senai.jandira.sp.Model.User;

import java.util.Scanner;


public class registerUser {

    User user = new User();
    Scanner teclado = new Scanner(System.in);


    public User userRegister(){

        System.out.println("-------------------------");
        System.out.println("  ✷ Cadastro Cliente ✷");
        System.out.println("-------------------------");
        System.out.println(" ");

        System.out.print("✷ Nome: ");
        user.nome = teclado.nextLine();
        System.out.print("✷ Número de cadastro: ");
        user.numero = teclado.nextLine();
        System.out.print("✷ Endereço: ");
        user.endereco = teclado.nextLine();
        System.out.print("✷ Email: ");
        user.email = teclado.nextLine();
        System.out.print("✷ Telefone: ");
        user.telefone = teclado.nextLine();
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("   ✷ Cliente cadastrado com sucesso! ✷");
        System.out.println(" ");


        return user;
    }


}

