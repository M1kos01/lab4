import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(1, new Employee("Mihail", "sales", 2100));
        employeeHashMap.put(2, new Employee("Hovard", "sales", 1000));
        employeeHashMap.put(3, new Employee("Robert", "sales", 950));
        employeeHashMap.put(4, new Employee("Tom", "clerk", 550));

        employeeHashMap.get(1).add(employeeHashMap.get(2));
        employeeHashMap.get(1).add(employeeHashMap.get(3));
        employeeHashMap.get(3).add(employeeHashMap.get(4));

        System.out.println(employeeHashMap.get(1));
        System.out.println("Tree:");
        Employee.printHierarchyTree(employeeHashMap.get(1), 0);

        System.out.println(employeeHashMap.get(3));
        System.out.println("Tree:");
        Employee.printHierarchyTree(employeeHashMap.get(3), 0);
    }
}