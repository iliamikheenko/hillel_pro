package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        this.setPrice(price);
        this.isDiscountable = isDiscountable;
        this.dateOfAdding = dateOfAdding;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        BigDecimal bd = new BigDecimal(price).setScale(1, RoundingMode.HALF_UP);
        this.price = bd.doubleValue();
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
        setPrice(this.price*0.9);

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