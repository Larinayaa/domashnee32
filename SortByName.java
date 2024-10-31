import java.util.Comparator;

public class SortByName implements Comparator<Produkt> {
    @Override
    public int compare(Produkt produkt1, Produkt produkt2) {
        return produkt1.getName().compareTo(produkt2.getName());
    }
}
