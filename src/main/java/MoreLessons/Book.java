package MoreLessons;

public class Book {

    private String name;
    private String author;
    private int buyingPrice;
    private int yearOfIssue;

    public Book(String name){
        this.name = name;
    }

    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }

    public Book(String name,String author, int yearOfIssue, int buyingPrice){
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.buyingPrice = buyingPrice;
    }

    public Book(){

    }

    public void setName(String n) {
        name = n;

    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setBuyingPrice(int bPrice) {
        if (bPrice <= 0) {
            System.out.println("Price must be positive");
            buyingPrice = 1;
        } else {
            buyingPrice = bPrice;
        }
    }

    public void setYearOfIssue(int year) {
        if (year > 2020 || year < 1950) {
            System.out.println("Year is wrong");
            yearOfIssue = 1950;
        } else {
            yearOfIssue = year;
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }


}

