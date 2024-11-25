import java.util.ArrayList;

public class CowboyProjectTester {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Building> buildings = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        
        humans.add (new Cowboy("John", 180));
        humans.add(new Sheriff("Sheriff Joe", 200));
        humans.add(new Outlaw("Billy the Kid", 160));

        System.out.println("Humans (for loop):");
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i).getName());
        }

        System.out.println("Humans (for-each loop):");
        for (Human human : humans) {
            System.out.println(human.getName());
        }

        buildings.add(new House(1500, "Red"));
        buildings.add(new Barn(2000, "White"));
        buildings.add(new Garage(500, "Blue"));

        System.out.println("Buildings (for loop):");
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println("Building Color: " + buildings.get(i).getColor() + ", Size: " + buildings.get(i).getSize() + " sq ft");
        }

        System.out.println("Buildings (for-each loop):");
        for (Building building : buildings) {
            System.out.println("Building Color: " + building.getColor() + ", Size: " + building.getSize() + " sq ft");
        }

        animals.add(new Cow("Bessie", 1200));
        animals.add(new DairyCow("Daisy", 1300));
        animals.add(new BeefCow("Beefy", 1400));
        animals.add(new Horse("Spirit", 1000));
        animals.add(new Cat("Whiskers", 10));

        System.out.println("Animals (for loop):");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).getName());
        }

        System.out.println("Animals (for-each loop):");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}