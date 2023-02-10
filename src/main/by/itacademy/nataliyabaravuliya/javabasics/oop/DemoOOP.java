package by.itacademy.nataliyabaravuliya.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        myCustomer.setFirstName("Liza");
        myCustomer.setAddress("75 PARK PLACE 8TH FLOOR NEW YORK NY 10007 United States");
        myCustomer.setBankAccountNumber("2222 3454 3334");

        System.out.println(myCustomer.getFirstName());
        System.out.println(myCustomer.getAddress());
        System.out.println(myCustomer.getBankAccountNumber());

    }
}
