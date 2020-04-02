package MoreLessons;

public class MethodAll {

    public static void main(String[] args) {

        Book threeFriends = new Book();

        threeFriends.setName("New name");
        threeFriends.setName("Name of Book");
        threeFriends.setAuthor("Pushkin");
        threeFriends.setBuyingPrice(-50);
        threeFriends.setYearOfIssue(1900);

        String bookName = threeFriends.getName();
        String bookAuthor = threeFriends.getAuthor();
        int bPrice = threeFriends.getBuyingPrice();
        int bookYear = threeFriends.getYearOfIssue();

        System.out.println(bookName + " " + bookAuthor + " " + bookYear + " " + bPrice);

        Book book1 = new Book("anchar");
        Book book2 = new Book();
        Book book3 = new Book("Name", "Author", 15 , 2001);


    }
}
