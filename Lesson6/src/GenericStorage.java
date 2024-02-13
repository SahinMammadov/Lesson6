public class GenericStorage<T extends Person> {
    private static int limit = 40;
    private T[] items;
    private int itemCounts;

    public GenericStorage() {
        items = (T[]) new Person[limit];
        itemCounts = 0;
    }

    public void add(T item) {
        if (itemCounts < limit) {
            items[itemCounts++] = item;
        } else {
            System.out.println("Storage is full");
        }
    }

    public void remove(int Id) {
        for (int i = 0; i < itemCounts; i++) {
            if (items[i].getId() == Id) {
                for (int j = i; j < itemCounts - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCounts - 1] = null;
                itemCounts--;
                return;
            } else {
                System.out.println("This Id is not found!");
            }
        }
    }

    public T search(int id) {
        for (T item : items) {
            if (item != null && item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void displayAllItems() {
        System.out.println("All Items:");
        for (T item : items) {
            if (item != null) {
                System.out.println("ID: " + item.getId() + ", Name: " + item.getName() + ", Age: " + item.getAge());
            }
        }
    }
}
