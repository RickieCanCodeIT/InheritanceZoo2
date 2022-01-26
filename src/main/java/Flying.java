public interface Flying {
    void fly(int speed);


    //Don't do this
    default void iCanFly() {
        System.out.println("I can fly!");
    }
}
