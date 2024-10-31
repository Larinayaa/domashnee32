import java.math.BigDecimal;

public class Produkt {
    private String name;
    private BigDecimal cena;
    private double rating;
    private int quantity;
    public Produkt(String name, BigDecimal cena, double rating, int quantity) {
        this.name = name;
        this.cena = cena;
        this.rating = rating;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getCena() {
        return cena;
    }
    public double getRating() {
        return rating;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "title='" + name + '\'' +
                ", price=" + cena +
                ", rating=" + rating +
                ", quantity=" + quantity +
                '}';
    }
}