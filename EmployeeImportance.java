import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// https://leetcode.com/problems/employee-importance/description/
public class EmployeeImportance {

	public static void main(String[] args) {
		
//		[1, 5, [2, 3]], [2, 3, []], [3, 3, []]
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		Employee employee1 = new Employee();
		employee1.id = 1;
		employee1.importance = 5;
		employee1.subordinates = list;
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(4);
		Employee employee2 = new Employee();
		employee2.id = 2;
		employee2.importance = 3;
		employee2.subordinates = list1;
		
		List<Integer> list2 = new ArrayList<Integer>();
		Employee employee3 = new Employee();
		employee3.id = 3;
		employee3.importance = 4;
		employee3.subordinates = list2;
		
		Employee employee4 = new Employee();
		employee4.id = 4;
		employee4.importance = 1;
		employee4.subordinates = list2;
		
		List<Employee> lstEmployee = new ArrayList<>();
		lstEmployee.add(employee1);
		lstEmployee.add(employee2);
		lstEmployee.add(employee3);
		lstEmployee.add(employee4);
		
		List<Integer> temp = new ArrayList<Integer>();
		Queue<Integer> queue = new LinkedList<>();
		
		int id = 1;
		int total = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (Employee employee : lstEmployee) {
			map.put(employee.id, employee.importance);
			
			if(employee.id == id) {
				temp = employee.subordinates;
				total = employee.importance;
			}
		}
		
		for (int i = 0; i < temp.size(); i++) {
			queue.add(temp.get(i));
		}

		while(!queue.isEmpty()) {
		
			int current = queue.poll();
			for (Employee employee : lstEmployee) {
				if(employee.id == current) {
					total += employee.importance;
					List<Integer> currList = employee.subordinates;
					for(int i = 0; i<currList.size();i++) {
						queue.add(currList.get(i));
					}
					break;
				}
			}
			
			
		}
		
		System.out.println(total);
	}


}

class Employee {
	
	public int id;
    public int importance;
    public List<Integer> subordinates;

}
