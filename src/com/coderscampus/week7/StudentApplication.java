package com.coderscampus.week7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class StudentApplication {

	 public static void main(String[] args) throws IOException {
		  StudentService studentService = new StudentService();
		  Student[] students = studentService.getStudentsFromFile();

		  Student[] courseOne = new Student[100];
		  Student[] courseTwo = new Student[100];
		  Student[] courseThree = new Student[100];

		  for(int i = 0; i < students.length; i++) {

				if(students[i].getCourse().startsWith("COMPSCI")) {
					 courseOne[i] = students[i];

				} else if(students[i].getCourse().startsWith("STAT")) {
					 courseTwo[i] = students[i];

				} else if(students[i].getCourse().startsWith("APMTH")) {

					 courseThree[i] = students[i];
				}
		  }
		  Arrays.sort(courseOne, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					 if(o1 != null && o2 == null) {
						  return -1;
					 } else if(o1 == null && o2 == null) {
						  return 0;
					 } else if(o1 == null) {
						  return 1;
					 }
					 return o2.getGrade().compareTo(o1.getGrade());
				}

		  });
		  Arrays.sort(courseTwo, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					 if(o1 != null && o2 == null) {
						  return -1;
					 } else if(o1 == null && o2 == null) {
						  return 0;
					 } else if(o1 == null) {
						  return 1;
					 }
					 return o2.getGrade().compareTo(o1.getGrade());
				}

		  });
		  Arrays.sort(courseThree, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					 if(o1 != null && o2 == null) {
						  return -1;
					 } else if(o1 == null && o2 == null) {
						  return 0;
					 } else if(o1 == null) {
						  return 1;
					 }
					 return o2.getGrade().compareTo(o1.getGrade());
				}

		  });
		  studentService.putStudentsToFile(courseOne, "course1.csv");
		  studentService.putStudentsToFile(courseTwo, "course2.csv");
		  studentService.putStudentsToFile(courseThree, "course3.csv");
	 }
}