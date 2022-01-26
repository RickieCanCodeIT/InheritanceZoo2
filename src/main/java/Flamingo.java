public class Flamingo extends Bird implements Flying {
    private int legLength;
    private String featherColor;

    public Flamingo(String name, int weight, int numOfEggs, int legLength, String featherColor) {
        super(name, weight, numOfEggs);
        this.legLength = legLength;
        this.featherColor = featherColor;
    }

    public int getLegLength() {
        return legLength;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    @Override
    public String toString() {
        return "Flamingo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", numOfEggs=" + numOfEggs +
                ", legLength=" + legLength +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }

    @Override
    public void makeAnimalSound() {
        System.out.println("chirp");
    }

    @Override
    public void Squawk() {
        System.out.println("SQUUUAAAAWK");
    }

    @Override
    public void fly(int speed) {
        System.out.println("The flamingo go zoom at " + speed + " miles an hour!");

    }
}
