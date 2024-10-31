import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produkt> produkts = List.of(
                new Produkt("Киви", new BigDecimal("0.42"), 8.9, 99),
                new Produkt("Банан", new BigDecimal("0.85"), 6.5, 84),
                new Produkt("Манго", new BigDecimal("2.99"), 9.7, 11),
                new Produkt("Кокос", new BigDecimal("1.89"), 8.1, 43),
                new Produkt("Ананас", new BigDecimal("2.43"), 7.6, 19)
        );
        print(produkts);

        Comparator<Produkt> comparator=null;
        do {
            comparator = typSort();
            if (comparator != null) {
                print(sozdatListSort(produkts, comparator));
            }
        } while (comparator!=null);
    }

    public static Comparator<Produkt> typSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой тип сортировки воспроизвести? ");
        System.out.println("1. По названию.");
        System.out.println("2. По цене.");
        System.out.println("3. По рейтингу.");
        System.out.println("4. По количеству на складе.");
        System.out.println("5. По названию (в обратном порядке).");
        System.out.println("6. По цене по убыванию.");
        System.out.println("7. По рейтингу по убыванию.");
        System.out.println("8. По количеству по убыванию.");

        System.out.println("Для выхода нажмите любую другую цифру.");
        int vybor = scanner.nextInt();
        switch (vybor){
            case 1: return new SortByName();
            case 2: return new SortByCena();
            case 3: return new SortByRating();
            case 4: return new SortByQuantity();
            case 5: return new SortByName().reversed(); //обратный список
            case 6: return new SortByCena().reversed();
            case 7: return new SortByRating().reversed();
            case 8: return new SortByQuantity().reversed();
            default: return null;
        }
    }
    public static List<Produkt> sozdatListSort(List<Produkt> list, Comparator<Produkt> comparator){
        ArrayList<Produkt> result = new ArrayList<>(list);
        result.sort(comparator);
        return result;
    }
    public static void print(List<Produkt> produkts){
        for (Produkt produkt: produkts ){
            System.out.println(produkt);
        }
    }
}
