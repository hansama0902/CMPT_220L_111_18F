package Lab5;
import java.util.*;
public class Lab3 {
	public static void main(String[] args) {
		int numSt;
		System.out.println("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		numSt = sc.nextInt();
		LinkedHashMap< String,Integer> students =  
		new LinkedHashMap< String,Integer>();
		for(int i=0; i<numSt; i++) {
			System.out.println("Enter the name and score of students");
			String name = sc.next();
			int score = sc.nextInt();
			students.put(name, score);
		}

		LinkedHashMap<String, Integer> sortedStudents = sortStudents(students);
		System.out.println(sortedStudents);
	}

	public static LinkedHashMap<String, Integer> sortStudents(LinkedHashMap<String, Integer> st) {

		List<Map.Entry<String, Integer>> capitalList = new LinkedList<>(st.entrySet());
		Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		LinkedHashMap<String, Integer> stud = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : capitalList)
		{
			stud.put(entry.getKey(), entry.getValue());
		}
		return stud;
	}
}
