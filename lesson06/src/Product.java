package src;

import java.time.LocalDate;
public class Product implements Comparable<Product>{
    private final int id;
    private final String type;
    private double price;
    private final boolean isDiscountable;
    private final LocalDate dateOfAdding;

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
                ", price=" + String.format("%.2f",price) +
                ", isDiscountable=" + isDiscountable +
                ", dateOfAdding=" + dateOfAdding +
                "}\n";
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price,o.price);
    }
}
