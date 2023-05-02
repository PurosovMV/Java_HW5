import java.util.*;

public class PhoneBook {
    private Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();

    void addNumber(String name, int numberPhone) {
        if (bookPhone.containsKey(name)) {
            bookPhone.get(name).add(numberPhone);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(numberPhone);
            bookPhone.put(name, list);
        }

    }

    String printAllBook() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : bookPhone.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    String getByNume(String name) {
        return name + ": " + bookPhone.get(name);
    }

}
