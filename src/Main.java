public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Lev", "Tolstoy", "War & Peace", 1951);
        System.out.printf("Книга называется %s, автор %s %s, год издания %s", book1.getName(), book1.author.getFirstName(), book1.author.getMiddleName(), book1.getYear());
        book1.setYear(1964);
        System.out.printf("\n" + "Книга называется %s, автор %s %s, год издания %s", book1.getName(), book1.author.getFirstName(), book1.author.getMiddleName(), book1.getYear());

        System.out.println("\n");

        Book book2 = new Book("Alexander", "Nevskiy", "Wot tak wot, absolutly", 2000);
        System.out.printf("Книга называется %s, автор %s %s, год издания %s", book2.getName(), book2.author.getFirstName(), book2.author.getMiddleName(), book2.getYear());
        book2.setYear(2005);
        System.out.printf("\n" + "Книга называется %s, автор %s %s, год издания %s", book2.getName(), book2.author.getFirstName(), book2.author.getMiddleName(), book2.getYear());

    }
}