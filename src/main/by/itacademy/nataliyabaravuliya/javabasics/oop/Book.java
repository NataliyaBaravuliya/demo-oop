package by.itacademy.nataliyabaravuliya.javabasics.oop;

public class Book {
    private int idNumber;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublication;
    private int quantityPage;
    private double price;

    public void setIdNumber(int newIdNumber) {
        idNumber = newIdNumber;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setPublishingHouse(String newPublishingHouse) {
        publishingHouse = newPublishingHouse;
    }

    public void setYearOfPublication(int newYearOfPublication) {
        yearOfPublication = newYearOfPublication;
    }

    public void setQuantityPage(int newQuantityPage) {
        quantityPage = newQuantityPage;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getQuantityPage() {
        return quantityPage;
    }

    public double getPrice() {
        return price;
    }
}
