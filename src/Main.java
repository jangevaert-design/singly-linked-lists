import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Employee> employeeList = new LinkedList<>();
    Employee janeJones = new Employee("Jane", "Jones", 123);
    Employee johnDoe = new Employee("John", "Doe", 4567);
    Employee marySmith = new Employee("Mary", "Smith", 22);
    Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

    EmployeeLinkedList list = new EmployeeLinkedList();

    System.out.println("\nIs the list empty at this moment? : " + list.isEmpty());

    list.addToFront(janeJones);
    list.addToFront(johnDoe);
    list.addToFront(marySmith);
    list.addToFront(mikeWilson);

    System.out.println("\n" + list.getSize() + "\n");

    list.printList();

    list.removeFromFront();
    System.out.println("\n" + list.getSize() + "\n");
    list.printList();

  }

}
