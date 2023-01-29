package src;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Methods {

    public static List<Product> getBooksPriceMore250 (List<Product> products){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(s -> s.getPrice() > 250)
                .toList();
    }

    public static List<Product> getDiscountableBooks(List<Product> products){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(Product::isDiscountable)
                .peek(Product::setDiscount10)
                .toList();
    }

    public static Product getCheapestBook(List<Product> products){
        Optional<Product> cheapestBook = products.stream().
                filter(s -> "Book".equals(s.getType()))
                .min(Product::compareTo);
        return  cheapestBook.orElseThrow(() -> new NoSuchElementException("No books in list"));
    }
    public static List<Product> getThreeLastAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateOfAdding).reversed())
                .limit(3)
                .toList();
    }

    public static List<Product> getSpecificProducts(List<Product> products){
        return products.stream()
                .filter(s ->"Book".equals(s.getType()))
                .filter(s -> LocalDate.now().getYear() == s.getDateOfAdding().getYear())
                .filter(s -> s.getPrice() <= 75)
                .toList();
    }

    public static Map<String,List<Product>> getGroupedByTypeProducts(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getType,Collectors.toList()
                ));
    }
}
