public class human {
    String name;
    String town;
    int yearOfBirth;
    String job;

    public human(String name, String town, int yearOfBirth) {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }

    public human(String name, String town, int yearOfBirth, String job) {
        System.out.println("Привет! Меня зовут " + name + ". Я из города "
                + town + ". Мне " + yearOfBirth + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }

}
