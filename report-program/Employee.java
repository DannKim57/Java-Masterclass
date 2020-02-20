package arraysort.practiceds1;

// import java.util.ArrayList;
import java.util.LinkedList;

public class Employee {

    private String firstName;
    private String lastName;
    private String id;
    
    private StackForMessage<Message> messageSentList;
    private StackForMessage<Message> messageReceivedList;

    public getFirstName() {
        return firstName;
    }

    public setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public getLastName() {
        return lastName;
    }

    public setLastName(String ln) {
        lastName = ln;
    }

    public getId() {
        return id;
    }

    public Employee(String id) {
        this(id, null, null);
    }

    public Employee(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        messageSentList = new StackForMessage<Message>();
        messageReceivedList = new StackForMessage<Message>();
    }

   
    
    @Override
    public String toString() {
        return "Employee{" + 
                firstName + " " + lastName +
                ", id= " + id + 
                "}";
                
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


}