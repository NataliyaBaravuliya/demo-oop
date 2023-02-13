package by.itacademy.nataliyabaravuliya.javabasics.oop;

public class Customer {
    private int idNumber;
    private String surname;
    private String name;
    private String middlename;
    private String address;
    private int creditCardNumber;
    private String bankAccountNumber;
    public void setSurname(String newSurname) {
        surname = newSurname;

    }

    public void setFirstName(String newFirstName) {
        name = newFirstName;
    }

    public void setMiddlename(String newMiddlename) {
        middlename = newMiddlename;
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

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
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
