package com.task.student;

public class Subject {
private String subjectId;	
private String subjectName;
private String year;

private Integer marks;

public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public String getSubjectId() {
	return subjectId;
}
public void setSubjectId(String subjectId) {
	this.subjectId = subjectId;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}

public Subject(String subjectId, String subjectName, String year, String branch) {
	super();
	this.subjectId = subjectId;
	this.subjectName = subjectName;
	this.year = year;
	
}
public Subject() {
	super();
}
@Override
public String toString() {
	return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", year=" + year + ", branch=" 
			+ "]";
}


}
