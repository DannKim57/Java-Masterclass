public class Main {

    public static void main(String[] args) {
        Ladybug bug1 = new Ladybug();
        

        System.out.println(bug1.get()); // String Insect.get();
        System.out.println(bug1.getAge()); // int Ladybug.getAge();


        bug1.set("Smith"); // void Insect.set(...);
        System.out.println(bug1.get()); 

        
    }
}

class Insect {
    private String name;

    Insect() {
        this.name = "HouseFlyy";
    }

    protected String get() {
        return name;
    }

    public void set(String name) {
        this.name = name;
    }
}


// I don't have to declare String name 
// since I extend Insect class.
class Ladybug extends Insect{

    private int age;

    Ladybug() {
        this.age = 10;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
