package com.coderscampus.week7;

import java.io.*;

public class StudentService {

	 public Student[] getStudentsFromFile() {

		  try (BufferedReader fileReader = new BufferedReader(new FileReader("student-master-list.csv"))) {
				int i = 0;
				String line;
				Student[] students = new Student[100];

				fileReader.readLine();
				while((line = fileReader.readLine()) != null) {

					 String[] lineData = line.split(",");
					 Integer myIntVal = Integer.parseInt(lineData[3]);
					 Student student = new Student(lineData[0], lineData[1], lineData[2], myIntVal);
					 student.setStudentId(lineData[0]);
					 student.setStudentName(lineData[1]);
					 student.setCourse(lineData[2]);
					 student.setGrade(myIntVal);
					 students[i] = student;
					 i++;

				}
				return students;
		  } catch(IOException e) {
				e.printStackTrace();
		  }
		  return new Student[0];
	 }

	 public void putStudentsToFile(Student[] students, String fileName) {
		  try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
				writer.write("Student ID,Student Name,Course,Grade\n");
				for(Student student : students) {
					 if(student != null) {
						  writer.write(student.toString() + "\n ");
					 }
				}
		  } catch(IOException e) {
				e.printStackTrace();
		  }
	 }
}

