public class Owner {
    private String name;
    private Owner owner;


    public Owner (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    }
/*6) Gør det samme for offSpring. Dvs
private ArrayList<String> offSpring; bliver til
private ArrayList <Dog> offSpring;
        7) lav en metode der kan printe navnene på en hund's hvalpe.
        */


