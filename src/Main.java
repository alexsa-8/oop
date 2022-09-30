import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        human maxim = new human("Максим", "Минск", -35, "бренд-менеджер");
        human anay = new human("Аня", null, 29, "методист образовательных программ");
        human katay = new human(null, "Калининград", 28, "продакт-менеджер");
        human artem = new human("Артём", "Москва", 27, null);
        human vladimir = new human("Владимир", "Казань", 21, "не работаю");
        maxim.messagePerson();
        anay.messagePerson();
        katay.messagePerson();
        artem.messagePerson();
        vladimir.messagePerson();
        flower roza = new flower("Роза", null, "Голландия", 35.59, 0);
        flower hrizantema = new flower("Хризантема", null, null, 15, 5);
        flower pion = new flower("Пион", null, "Англия", 69.9, 1);
        flower gipsofila = new flower("Гипсофила", null, "Турция", 19.9, 10);
        roza.outputInformationFlower();
        hrizantema.outputInformationFlower();
        pion.outputInformationFlower();
        gipsofila.outputInformationFlower();
        int[] bouquet=new int[4];
        int numberRoza = 0;
        if (numberRoza>0){
            bouquet[0]=roza.getLifeSpan();
        }
        int numberHrizantema = 5;
        if (numberHrizantema>0){
            bouquet[1]=hrizantema.getLifeSpan();
        }
        int numberPion = 0;
        if (numberPion>0){
            bouquet[2]=pion.getLifeSpan();
        }
        int numberGipsofila = 4;
        if (numberGipsofila>0){
            bouquet[3]=gipsofila.getLifeSpan();
        }
        Arrays.sort(bouquet);
        int day=0;
        for (int j : bouquet) {
            if (j > 0) {
                day = j;
                break;
            }
        }
        double Bouquet = (roza.getCost() * numberRoza + hrizantema.getCost() * numberHrizantema +
                pion.getCost() * numberPion + gipsofila.getCost() * numberGipsofila) * 1.1;
        System.out.print("Букет из: " + roza.nameFlower + " - " + numberRoza + ", "
                + hrizantema.nameFlower + " - " + numberHrizantema + ", "
                + pion.nameFlower + " - " + numberPion + ", "
                + gipsofila.nameFlower + " - " +numberGipsofila+" стоит: ");
        System.out.printf("%.2f", Bouquet);
        System.out.println(" руб. Простоит "+day+" суток.");
    }
}