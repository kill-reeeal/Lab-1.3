package com.book;

public class BookTest extends Book {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Человек-неведимка");
        Book b3 = new Book("Скотный двор", "Джордж Оруэлл");
        Book b4 = new Book("Повелитель мух", "Уильям Голдинг", "roman");

        b1.setName("Республика ШКИД");
        b1.setAuthor("Григорий Белых");
        b1.setGenre("detective");
        b2.setAuthor("Джон Ле Карре");
        b2.setGenre("drama");
        b3.setGenre("novella");

        System.out.println(b1);
        b1.choice();
        System.out.println(b2);
        b2.choice();
        System.out.println(b3);
        b3.choice();
        System.out.println(b4);
        b4.choice();
    }
}