package pro.sky;


public class Main {


    public static void main(String[] args) {
        book();
        book1();
    }


    public static void book() {
        //Книга 1.
        System.out.println("Книга 1");
        Author author = new Author("Steven", "King");
        Book book = new Book(new Author(author.getFirstName(), author.getSecondName()), "11/22/63", 2011);

        System.out.println("Автор: " + author.getFirstName() + " " + author.getSecondName() + ". Название книги: " + book.getBookName() + ". Год издания: " + book.getPublishingYear());
        book.setPublishingYear(2007);
        System.out.println("Автор: " + author.getFirstName() + " " + author.getSecondName() + ". Название книги: " + book.getBookName() + ". Год издания: " + book.getPublishingYear());

    }

    public static void book1() {
        //Книга 2.
        System.out.println("Книга 2");
        Author author1 = new Author("Fyodor", "Dostoevsky");
        Book book1 = new Book(new Author(author1.getFirstName(), author1.getSecondName()), "Demons", 2016);

        System.out.println("Автор: " + author1.getFirstName() + " " + author1.getSecondName() + ". Название книги: " + book1.getBookName() + ". Год издания: " + book1.getPublishingYear());

    }

}