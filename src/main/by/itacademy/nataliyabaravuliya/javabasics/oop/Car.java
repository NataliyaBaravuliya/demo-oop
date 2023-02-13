package by.itacademy.nataliyabaravuliya.javabasics.oop;

public class Car {
    private int idNumber;
    private String carBrand;
    private String carModel;
    private int yearOfIssue;
    private String color;
    private double price;
    private String registrationNumber;

    public void setIdNumber(int newIdNumber) {
        idNumber = newIdNumber;
    }

    public void setCarBrand(String newCarBrand) {
        carBrand = newCarBrand;
    }

    public void setCarModel(String newCarModel) {
        carModel = newCarModel;
    }

    public void setYearOfIssue(int newYearOfIssue) {
        yearOfIssue = newYearOfIssue;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setRegistrationNumber(String newRegistrationNumber) {
        registrationNumber = newRegistrationNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }


    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getCarModel() {
        return carModel;
    }
}
