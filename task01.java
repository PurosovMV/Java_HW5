

/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

public class task01 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addNumber("Иванов Виктор", 894566);
        phoneBook.addNumber("Иванов Виктор", 898989);
        phoneBook.addNumber("Иванов Виктор", 656565);
        phoneBook.addNumber("Смирнов Олег", 999991);
        phoneBook.addNumber("Гаврилова Алёна", 787878);
        phoneBook.addNumber("Гаврилова Алёна", 464646);
        phoneBook.addNumber("Гавердов Семён", 585858);
        phoneBook.addNumber("Агабабян Анна", 123321);
        phoneBook.addNumber("Абзалов Айдар", 963147);

        System.out.println(phoneBook.printAllBook());
        System.out.println(phoneBook.getByNume("Иванов Виктор"));

    }

}
