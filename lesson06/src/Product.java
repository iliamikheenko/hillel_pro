package src;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Product implements Comparable<Product>{
    private int id;
    private String type;
    private double price;
    private boolean isDiscountable;
    private LocalDate dateOfAdding;

    public Product(int id, String type, double price, boolean isDiscountable, LocalDate dateOfAdding) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isDiscountable = isDiscountable;
        this.dateOfAdding = dateOfAdding;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscountable() {
        return isDiscountable;
    }

    public LocalDate getDateOfAdding() {
        return dateOfAdding;
    }
    public void setDiscount10(){
        this.price = this.price * 0.9;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isDiscountable=" + isDiscountable +
                ", dateOfAdding=" + dateOfAdding +
                "}\n";
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price,o.price);
    }
}
