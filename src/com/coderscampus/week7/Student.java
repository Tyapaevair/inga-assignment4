package com.coderscampus.week7;

public class Student {
	 private String studentId;
	 private String studentName;
	 private String course;
	 private Integer grade;

	 public Student(String studentId, String studentName, String course, Integer grade) {
		  this.studentId = studentId;
		  this.studentName = studentName;
		  this.course = course;
		  this.grade = grade;
	 }

	 public String getStudentId() {
		  return studentId;
	 }

	 public void setStudentId(String studentId) {
		  this.studentId = studentId;
	 }

	 public String getStudentName() {
		  return studentName;
	 }

	 public void setStudentName(String studentName) {
		  this.studentName = studentName;
	 }

	 public String getCourse() {
		  return course;
	 }

	 public void setCourse(String course) {
		  this.course = course;
	 }

	 public Integer getGrade() {
		  return grade;
	 }

	 public void setGrade(Integer grade) {
		  this.grade = grade;
	 }

	 @Override
	 public String toString() {
		  return (studentName + ", " + studentId + ", " + course + ", " + grade);
	 }
}
