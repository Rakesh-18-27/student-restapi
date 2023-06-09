package com.task.student;

import java.util.Map;

public class Marks {
private Map<Subject,Integer> marks;

public Map<Subject, Integer> getMarks() {
	return marks;
}

public Marks(Map<Subject, Integer> marks) {
	super();
	this.marks = marks;
}

public void setMarks(Map<Subject, Integer> marks) {
	this.marks = marks;
}
}
