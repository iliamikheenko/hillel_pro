package src;
import java.time.LocalDate;
import java.util.ArrayList;

import static src.Methods.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Toy", 50, true, LocalDate.of(2022,1,1)));
        products.add(new Product(2, "Toy", 50, true, LocalDate.of(2023,1,1)));
        products.add(new Product(3, "Toy", 150, false, LocalDate.of(2024,1,1)));
        products.add(new Product(4, "Toy", 250, true, LocalDate.of(2019,1,1)));
        products.add(new Product(5, "Toy", 350, false, LocalDate.of(2016,1,1)));
        products.add(new Product(6, "Toy", 450, true, LocalDate.of(2007,1,1)));

        products.add(new Product(7, "Book", 74, true, LocalDate.of(2023,1,1)));
        products.add(new Product(8, "Book", 150, false, LocalDate.of(2022,1,1)));
        products.add(new Product(9, "Book", 249.9, true, LocalDate.of(2025,1,1)));
        products.add(new Product(10, "Book", 350, false, LocalDate.of(2002,1,1)));
        products.add(new Product(11, "Book", 331, true, LocalDate.of(2032,1,1)));
        products.add(new Product(12, "Book", 250.01, true, LocalDate.of(2032,1,1)));
        products.add(new Product(13, "Book", 49.9, true, LocalDate.of(2023,1,1)));
        products.add(new Product(14, "Phone", 49.9, true, LocalDate.of(2023,1,1)));

//        System.out.println(getBooksPriceMore250(products));
        System.out.println(getDiscountableBooks(products));
//        System.out.println(getCheapestBook(products));
//        System.out.println(getThreeLastAddedProducts(products));
//        System.out.println(getSpecificProducts(products));
//        System.out.println(getGroupedByTypeProducts(products));
    }

}
