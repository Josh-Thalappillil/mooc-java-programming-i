import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name) {
        items.add(new Item(name));
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Items itemsList = new Items();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            itemsList.addItem(name);
        }

        itemsList.printItems();
    }
}
