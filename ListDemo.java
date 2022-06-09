import java.util.LinkedList;
import java.util.ListIterator;
public class ListDemo{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.addFirst("Urus");
        cars.addLast("Cardillac");
        cars.addFirst("Bentley");
        ListIterator<String> brands = cars.listIterator();
        brands.add("Balenciaga");
        brands.add("Nike");
        brands.add("Louis Vuitton");
        brands.add("Yvess Saint Laurent");
        System.out.println(cars);
    }
}