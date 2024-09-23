import java.util.ArrayList;

public class LibraryCollection<T> {
    private ArrayList<T> items;
    public LibraryCollection() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public ArrayList<T> getAllItems() {
        return new ArrayList<>(items);
    }
}
