package arraysort.practiceds1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import arraysort.practiceds1.Employee;

public class Main {
    private static Map<String, Employee> emps; 
    public static void main(String[] args) {
        emps = new HashMap<>();

        System.out.println("Type names of employees");
        
        while(true) {
            System.out.println("Id, First Name, and Last Name please : ");
            Scanner sc = new Scanner(System.in);
            String temp = sc.nextLine();

            if (temp.equals("exit")) break;
            String[] tempArr = temp.split(" ");
            
            Employee emp = new Employee(tempArr[0], tempArr[1], tempArr[2]);

            emps.put(tempArr[0], emp); 

        }

        



    }
}


// Report Program.
// Each employee can write reports which are going to be given to employers.
// Each employee only can read their own reports. While, employers can read all reports. 
// I am going to use linked list as stack to sort reports in recently sent order, 
// and queue to send reports in sent order.
// In addition, I am going to use hashmap to map each employee to each key. 


// Let's upgrade this program more and more. 
// Add more and more. 
// Let's make this without database and only String, which would delete all records when terminated. 
// And then, we are going to add database, stream function, etc. 

