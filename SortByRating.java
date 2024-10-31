import java.util.Comparator;

public class SortByRating implements Comparator<Produkt> {
    @Override
    public int compare(Produkt produkt1, Produkt produkt2) {
    return Double.compare(produkt1.getRating(), produkt2.getRating());
}
}
