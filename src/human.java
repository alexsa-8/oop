import java.util.Objects;

public class human {
    String name;
    private String town;
    private int yearOfBirth;
    String job;

    human(String name, String town, int yearOfBirth, String job) {
        //this.name = name;
        setTown(town);
        setYearOfBirth(yearOfBirth);
        //this.job = job;
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.job = Objects.requireNonNullElse(job, "Информация не указана");

    }
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    void messagePerson() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Мне " + yearOfBirth + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
