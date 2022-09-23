public class Main {
    public static void main(String[] args) {

        human maxim = new human("Максим", "Минск", 2022 - 35);
        human anay = new human("Аня", "Москва", 2022 - 29);
        human katay = new human("Катя", "Калининград", 2022 - 28);
        human artem = new human("Артём", "Москва", 2022 - 27);
        System.out.println();
        human maxim1 = new human("Максим", "Минск", -35, "бренд-менеджер");
        human anay1 = new human("Аня", null, 29, "методист образовательных программ");
        human katay1 = new human(null, "Калининград", 28, "продакт-менеджер");
        human artem1 = new human("Артём", "Москва", 27, null);
        maxim1.messagePerson();
        anay1.messagePerson();
        katay1.messagePerson();
        artem1.messagePerson();

    }
}