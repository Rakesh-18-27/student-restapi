package com.task.student;

import java.util.List;
import java.util.Map;

public class Teacher {
private String teacherName;
private String teacherEmail;
private List<Subject> subjects;
private Map<String,Boolean> attendence;
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public String getTeacherEmail() {
	return teacherEmail;
}
public void setTeacherEmail(String teacherEmail) {
	this.teacherEmail = teacherEmail;
}
public List<Subject> getSubjects() {
	return subjects;
}
public void setSubjects(List<Subject> subjects) {
	this.subjects = subjects;
}
public Map<String, Boolean> getAttendence() {
	return attendence;
}
public void setAttendence(Map<String, Boolean> attendence) {
	this.attendence = attendence;
}
public Teacher(String teacherName, String teacherEmail, List<Subject> subjects, Map<String, Boolean> attendence) {
	super();
	this.teacherName = teacherName;
	this.teacherEmail = teacherEmail;
	this.subjects = subjects;
	this.attendence = attendence;
}
public Teacher() {
	super();
}
@Override
public String toString() {
	return "Teacher [teacherName=" + teacherName + ", teacherEmail=" + teacherEmail + ", subjects=" + subjects
			+ ", attendence=" + attendence + "]";
}

}
