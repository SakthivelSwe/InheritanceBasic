public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,7);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
       // dog.eat();
         // dog.walk();
       // dog.run();
        Fish fish = new Fish("shark",10,10,2,2,4);
        fish.move(50);
    }
}
