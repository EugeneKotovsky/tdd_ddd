import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PhoneBookTest {

    @Test
    public void testAddSingleContact() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Alice", "12345");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testAddDuplicateName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        int result = phoneBook.add("Alice", "54321");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testAddMultipleContacts() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        int result = phoneBook.add("Bob", "11111");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testFindByNumberExists() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        String name = phoneBook.findByNumber("12345");
        Assertions.assertEquals("Alice", name);
    }

    @Test
    public void testFindByNameExists() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "12345");
        String number = phoneBook.findByName("Alice");
        Assertions.assertEquals("12345", number);
    }

    @Test
    public void testPrintAllNamesSorted() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Charlie", "333");
        phoneBook.add("Alice", "111");
        phoneBook.add("Bob", "222");
        List<String> names = phoneBook.printAllNames();
        Assertions.assertEquals(List.of("Alice", "Bob", "Charlie"), names);
    }

    @Test
    public void testPrintAllNamesEmpty() {
        PhoneBook phoneBook = new PhoneBook();
        List<String> names = phoneBook.printAllNames();
        Assertions.assertTrue(names.isEmpty());
    }

}