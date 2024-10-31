import java.util.Comparator;

public class SortByCena implements Comparator<Produkt> {
    @Override
    public int compare(Produkt produkt1, Produkt produkt2) {
        return produkt1.getCena().compareTo(produkt2.getCena());
    }
}
