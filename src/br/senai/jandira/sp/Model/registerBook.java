package br.senai.jandira.sp.Model;

import br.senai.jandira.sp.Model.Book;

import java.util.Scanner;

public class registerBook {

    Book book = new Book();
    Scanner teclado = new Scanner(System.in);

    public Book bookRegister() {

    System.out.println("-------------------------");
        System.out.println("   ✷ Cadastro Livro ✷");
        System.out.println("-------------------------");
        System.out.println(" ");

        System.out.print("✷ Título: ");
        book.titulo = teclado.nextLine();
        System.out.print("✷ Autor (a): ");
        book.autor = teclado.nextLine();
        System.out.print("✷ ISBN: ");
        book.isbn = teclado.nextLine();
        System.out.print("✷ Gênero: ");
        book.genero = teclado.nextLine();
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("    ✷ Livro cadastrado com sucesso! ✷");
        System.out.println(" ");


        return book;

    }
}
