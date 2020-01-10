public class Main{

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Leo");
        Person[] groupPerson = {person1, person2};

        
        Telemarketer p1 = new Telemarketer("Tim");
        HouseFly bug1 = new HouseFly();
        Ipest[] ip1 = {p1, bug1};

        DiningRoom diningRoom = new DiningRoom(groupPerson, ip1);
        diningRoom.serveDinner();
        
        System.out.println("------------------");
        Ipest ip2 = new Telemarketer();
        ip2.beAnnoying();

    }
}

class DiningRoom {
    Person[] dinigPeople;
    Ipest[] pests;

    DiningRoom(Person[] diningPeople, Ipest[] pests) {
        this.dinigPeople = diningPeople;
        this.pests = pests;
    }

    void serveDinner() {
        for(Ipest ipest : pests) {
            ipest.beAnnoying();
        }
    }
}

interface Ipest {
    public void beAnnoying();
}

class Person {
    protected String name;

    Person() {
        this.name = "Smith";
    }

    Person(String name) {
        this.name = name;
    }
}

class Telemarketer extends Person implements Ipest {

    Telemarketer() {
        this.name = "Simpson";
    }

    Telemarketer(String n1) {
        this.name = n1;
    }

    public void callDuringDinner(){
        System.out.println("Call from Telemarketer");
    }

    public void continueTalking() {
        System.out.println("Keep Talking...");
    }

    public void beAnnoying() {
        callDuringDinner();
        continueTalking();
    }
}

class Insect {
    protected String name;

    Insect() {
        this.name = "Fly";
    }

}

class HouseFly extends Insect implements Ipest {
    public void flyAround() {
        System.out.println("Aaaaaaaaa");
    }

    public void landOnThings() {
        System.out.println("Land on your stuff");
    }

    public void beAnnoying() {
        flyAround();
        landOnThings();
    }
}