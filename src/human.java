import java.util.Objects;

public class human {
    String name;
    String town;
    int yearOfBirth;
    String job;

    public human(String name, String town, int yearOfBirth) {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }

    human(String name, String town, int yearOfBirth, String job) {
        this.name= Objects.requireNonNullElse(name,"Информация не указана");
        this.town=Objects.requireNonNullElse(town,"Информация не указана");
        this.job=Objects.requireNonNullElse(job,"Информация не указана");

        if (yearOfBirth < 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    void messagePerson() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Мне " + yearOfBirth + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }

}
