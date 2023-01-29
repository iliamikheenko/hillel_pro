package src;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Methods {
    public static List<Product> getBooksPriceMore250 (List<Product> products){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(s -> s.getPrice() > 250)
                .toList();
    }

    //2
    public static List<Product> getDiscountableBooks(List<Product> products){
        return products.stream()
                .filter(s -> "Book".equals(s.getType()))
                .filter(Product::isDiscountable)
                .peek(Product::setDiscount10)
                .toList();
    }

    //3
    public static Product getCheapestBook(List<Product> products){
        Optional<Product> cheapestBook = products.stream().
                filter(s -> "Book".equals(s.getType()))
                .min(Product::compareTo);
        return  cheapestBook.orElseThrow(() -> new NoSuchElementException("no books in list"));
    }
    //4
    //TODO finish comparator
    public static List<Product> getThreeLastAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateOfAdding).reversed())
                .limit(3)
                .toList();
    }

    //5
    public static List<Product> getSomeProducts(List<Product> products){
        return products.stream()
                .filter(s ->"Book".equals(s.getType()))
                .filter(s -> s.getDateOfAdding().getYear() == 2023)
                .filter(s -> s.getPrice() <= 75)
                .toList();
    }
    //6
    public static Map<String,List<Product>> getGroupedByTypeProducts(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getType,Collectors.toList()
                ));
    }
}
