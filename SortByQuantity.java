import java.util.Comparator;

public class SortByQuantity implements Comparator<Produkt> {
    @Override
    public int compare(Produkt produkt1, Produkt produkt2) {
        return Integer.compare(produkt1.getQuantity(), produkt2.getQuantity());
    }
}
