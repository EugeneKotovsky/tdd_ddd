import java.util.*;

public class PhoneBook {
    private final Map<String, String> nameToNumber = new HashMap<>();
    private final Map<String, String> numberToName = new HashMap<>();
    private final Set<String> sortedNames = new TreeSet<>();

    public int add(String name, String number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
            sortedNames.add(name);
        }
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}