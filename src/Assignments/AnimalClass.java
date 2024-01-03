package Assignments;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class AnimalClass {
    String AnimalName;


    public void enterAnimalName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Animal breed");
        AnimalName = input.nextLine();

    }
}

class dog extends AnimalClass{
    String sound = "ho ho ho";
    public void enterAnimalName(){
        super.enterAnimalName();
        System.out.println("dog is barking + " + sound);
    }
}
class Cat extends AnimalClass {
    String sound = "mew mew mew";

    public void enterAnimalName() {
        super.enterAnimalName();
        System.out.println("cat is making a " + sound + "fuss");
    }
}

    class MainAnimal {
        public static void main(String[] args) {
            Scanner choice = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1. for dog");
            System.out.println("2. for cat");
            int a = choice.nextInt();
            switch (a) {
                case 1:
                    dog dg = new dog();
                    dg.enterAnimalName();
                    break;
                case 2:
                    Cat Ct = new Cat();
                    Ct.enterAnimalName();
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }




