package by.itacademy.nataliyabaravuliya.javabasics.oop;
//import com.github.javafaker.idnumbers.EnIdNumber;


public class DemoOOP {
    public static void main(String[] args) {
        Customer myCustomer = new Customer();
        myCustomer.setFirstName("Liza");
        myCustomer.setAddress("75 PARK PLACE 8TH FLOOR NEW YORK NY 10007 United States");
        myCustomer.setBankAccountNumber("LB 2222 3454 3334");
        System.out.println(myCustomer.getFirstName());
        System.out.println(myCustomer.getAddress());
        System.out.println(myCustomer.getBankAccountNumber());



        Car myCar = new Car();
        myCar.setCarBrand("Lexus");
        myCar.setCarModel("GS IV");
        myCar.setRegistrationNumber("AB 2545-7");
        System.out.println(myCar.getCarBrand());
        System.out.println(myCar.getCarModel());
        System.out.println(myCar.getRegistrationNumber());


        Book myBook = new Book();
        myBook.setTitle("Harry Potter and the Prisoner of Azkaban");
        myBook.setAuthor("Joanne Kathleen Rowling");
        myBook.setPrice(112.00);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPrice());

    }
}



