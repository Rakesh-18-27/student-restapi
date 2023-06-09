package com.task.student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
		
<<<<<<< HEAD
		List<Subject> subjectss=Arrays.asList(new Subject("1","pps","1","cse"),
=======
		List<Subject> subjects=Arrays.asList(new Subject("1","pps","1","cse"),
>>>>>>> 97eabb8875b51afcd02cee589e9cb837a2776823
				new Subject("2","m1","1","cse"),
				new Subject("3","data structures","2","cse"),
				new Subject("4","bee","1","eee"),
				new Subject("5","circuits","1","eee"),
				new Subject("6","applied physics","1","cse"),
				new Subject("7","english","1","eee"),
				new Subject("8","java","2","cse"),
				new Subject("8","web programming","2","cse"),
				new Subject("9","operating system","2","cse")
				);
		Map<String,Boolean> attendence1= new HashMap<String, Boolean>() {{
		    put("2023-06-07", true);
		    put("2023-06-04", true);
		    put("2023-06-05", false);
		}};
		
		Map<String,Boolean> attendence2= new HashMap<String, Boolean>() {{
		    put("2023-06-07", false);
		    put("2023-06-06", true);
		    put("2023-06-05", true);
		}};
		
		Map<String,Boolean> attendence3= new HashMap<String, Boolean>() {{
		    put("2023-06-07", true);
		    put("2023-06-06", true);
		    put("2023-06-05", true);
		}};
		
		List<Teacher> teachers=Arrays
				.asList(new Teacher("srinivas","srinivas@123",Arrays.asList(new Subject("1","pps","1","cse"),new Subject("3","data structures","3","cse") ),attendence1),
						new Teacher("rakesh","rakesh@123",Arrays.asList(new Subject("4","bee","2","eee"),new Subject("5","circuits","3","eee") ),attendence2),
						new Teacher("ramesh","ramesh@123",Arrays.asList(new Subject("6","applied physics","1","cse"),new Subject("5","web programming","3","eee") ),attendence3)
						
						);

	}

}
