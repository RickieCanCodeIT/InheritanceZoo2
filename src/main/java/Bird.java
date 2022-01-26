public abstract class Bird extends Animal {
    protected int numOfEggs;

    public Bird(String name, int weight, int numOfEggs) {
        super(name, weight);
        this.numOfEggs = numOfEggs;
    }

    public int getNumOfEggs() {
        return numOfEggs;
    }


    public abstract void Squawk();

}
