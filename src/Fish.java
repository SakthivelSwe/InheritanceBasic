public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int wight, int gills, int eyes, int fins) {
        super(name, 1,1, size, wight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest() {

    }
    private void moveMuscles() {

    }
    private void moveBackFin() {

    }
    private void swim(int speed) {
        moveBackFin();
        moveMuscles();
        super.move(speed);
    }
}
