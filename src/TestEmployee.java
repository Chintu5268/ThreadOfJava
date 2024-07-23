import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
  public static void main(String[] args) {
    List <Employee> list = new ArrayList<>();
    list.add(new Employee(103, "Sandesh", "862480"));
    list.add(new Employee(102, "Piyush", "63445"));
    list.add(new Employee(104, "Ritesh", "415515"));
    list.add(new Employee(101, "Amkol", "862480"));

    System.out.println("Before sorting"+list);
    System.out.println("");
    Collections.sort(list);
    System.out.println("After sorting"+list);
   
    
  }
}
