package Collections;

import java.util.*;


class student implements Comparable<student>{
	
	int rollno;
	String name;
	
	public student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student Rollno : "+rollno+" Student Name : "+name;
		
	}

	@Override
	public int compareTo(student o) {
		
		return 0;
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		
        List<student> std = new ArrayList<>();
        
        std.add(new student(172,"Mahesh"));
        std.add(new student(174,"Harish"));
        
        Collections.sort(std,(i,j) -> i.rollno > j.rollno ?  1 : -1);
        
        for(student s : std) {
        	System.out.println(s);
        }
	}

}
