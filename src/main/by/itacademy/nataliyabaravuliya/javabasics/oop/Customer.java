package by.itacademy.nataliyabaravuliya.javabasics.oop;

public class Customer {
    private int idNumber;
    private String surName;
    private String firstName;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private String bankAccountNumber;

    public void setIdNumber(int newIdNumber) {
        idNumber = newIdNumber;
    }

    public void setSurName(String newSurName) {
        surName = newSurName;

    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setMiddleName(String newMiddleName) {
        middleName = newMiddleName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public void setCreditCardNumber(int newCreditCardNumber) {
        creditCardNumber = newCreditCardNumber;
    }

    public void setBankAccountNumber(String newBankAccountNumber) {
        bankAccountNumber = newBankAccountNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }
}