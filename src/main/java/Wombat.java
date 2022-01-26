public class Wombat extends Animal{
    protected String furColor;
    protected int numOfClaws;

    public Wombat(String name, int weight, String furColor, int numOfClaws) {
        super(name, weight);
        this.furColor = furColor;
        this.numOfClaws = numOfClaws;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getNumOfClaws() {
        return numOfClaws;
    }

    @Override
    public String toString() {
        return "Wombat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", furColor='" + furColor + '\'' +
                ", numOfClaws=" + numOfClaws +
                '}';
    }

    @Override
    public void makeAnimalSound() {
        System.out.println("Screee");
    }
}
