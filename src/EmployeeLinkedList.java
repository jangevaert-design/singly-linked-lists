public class EmployeeLinkedList {

  private EmployeeNode head;

  public void addToFront(Employee employee) {
    EmployeeNode node = new EmployeeNode(employee);
    node.setNext(head);
    head = node;
  }

  public void printList() {
    EmployeeNode current = head;
    System.out.print("HEAD -> \n");
    while (current != null) {
      System.out.print(current);
      System.out.print(" -> \n");
      current = current.getNext();
    }
    System.out.println("null");
  }
}
