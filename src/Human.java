import java.util.Random;

public class Human {

    private String name;
    private int age = generateRandomAge();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int generateRandomAge() {
        Random random = new Random();
        int min = 18;
        int max = 40;
        return random.nextInt((max - min) + 1) + min;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name +
                "\n Age: " + this.age);

    }
}
