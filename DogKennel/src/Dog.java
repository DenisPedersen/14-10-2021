import java.util.ArrayList;

public class Dog {
    private boolean isHungry = true;
    private String name;
    private Owner owner;



    private ArrayList<Dog> offspring;


    public Dog(String name, Owner owner, boolean isHungry) {
        this.name = name;
        this.owner = owner;
        this.isHungry = true;
        offspring = new ArrayList<Dog>();
    }

    public void feedDog() {
        if (isHungry == true)
        {
            System.out.println("Your puppy is hungry, let's give it some delicious dogfood");
            isHungry = false;
        } else {
            System.out.println("Your doggy isn't hungry right now");
        }
    }
    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public ArrayList<Dog> getOffspring() {
        return offspring;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void setOffspring(ArrayList<Dog> offspring) {
        this.offspring = offspring;
    }


}
/*6) Gør det samme for offSpring. Dvs
private ArrayList<String> offSpring; bliver til
private ArrayList <Dog> offSpring;
        7) lav en metode der kan printe navnene på en hund's hvalpe.
        */