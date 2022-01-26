import java.util.ArrayList;

public class InheritanceMain {
    public static void main(String[] args) {
        Animal wombat1 = new Wombat("Freddy", 50, "Blue", 8);
        Animal flamingo1 = new Flamingo("steve", 10, 5, 10, "Pink");
        Animal superWombat = new SuperWombat("Shaggy", 100, "Gold", 1000, 1000000);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(flamingo1);
        animals.add(wombat1);
        animals.add(superWombat);
        animals.add(new Flamingo("Daphne", 8, 10, 22, "Brown"));
        for (Animal currentAnimal : animals) {
            currentAnimal.makeAnimalSound();
            if (currentAnimal instanceof  Wombat) {
                System.out.println(currentAnimal);
                System.out.println(((Wombat)currentAnimal).getNumOfClaws());
            }
            else if (currentAnimal instanceof Flamingo) {
                System.out.println(currentAnimal);
                System.out.println(((Flamingo)currentAnimal).getNumOfEggs());
            }
            if (currentAnimal instanceof SuperWombat) {
                System.out.println(((SuperWombat)currentAnimal).getPowerLevel());
            }
            if (currentAnimal instanceof Flying) {
                ((Flying) currentAnimal).fly(100);
                ((Flying) currentAnimal).iCanFly();
            }
        }
    }
}
