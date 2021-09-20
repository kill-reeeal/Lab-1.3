package com.company;
import java.util.Scanner;

public class Main extends Author {

    public Main(String n, String e, Char g) {
        super(n, e, g);
    }

    public static void main(String[] args) {
        Author a1 = new Author("mikhail bulgakov", "mibuga@mail.ru", 'm');
        System.out.println(a1);
    }

}
