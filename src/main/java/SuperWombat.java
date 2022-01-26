public class SuperWombat extends Wombat{
    private int powerLevel;

    public SuperWombat(String name, int weight, String furColor, int numOfClaws, int powerLevel) {
        super(name, weight, furColor, numOfClaws);
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public String toString() {
        return "SuperWombat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", powerLevel=" + powerLevel +
                ", furColor='" + furColor + '\'' +
                ", numOfClaws=" + numOfClaws +
                '}';
    }
}
