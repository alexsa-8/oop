public class Main {
    public static void main(String[] args) {

        human maxim = new human("Максим", "Минск", 2022 - 35);
        human anay = new human("Аня", "Москва", 2022 - 29);
        human katay = new human("Катя", "Калининград", 2022 - 28);
        human artem = new human("Артём", "Москва", 2022 - 27);

        human maxim1 = new human("Максим", "Минск", 35, "бренд-менеджер");
        human anay1 = new human("Аня", "Москва", 29, "методист образовательных программ");
        human katay1 = new human("Катя", "Калининград", 28, "продакт-менеджер");
        human artem1 = new human("Артём", "Москва", 27, "директор по развитию бизнеса");

        maxim1.messagePerson("Максим", "Минск", 35, "бренд-менеджер");
        anay1.messagePerson("Аня", "Москва", 29, "методист образовательных программ");
        katay1.messagePerson("Катя", "Калининград", 28, "продакт-менеджер");
        artem1.messagePerson("Артём", "Москва", 27, "директор по развитию бизнеса");

    }
}