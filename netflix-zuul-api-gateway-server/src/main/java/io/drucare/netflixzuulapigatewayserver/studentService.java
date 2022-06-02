package io.drucare.netflixzuulapigatewayserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentService {
	private List<student> students=new ArrayList<>(Arrays.asList(new student("101","Raga priya","MCA"),
			new student("102","Saritha","MSC"),
			new student("103","Aarti","MSC")
			));
	public List<student> getAllstudents(){
		return students;
		
	}
	public student getstudent(String stdId) {
		return students.stream().filter(t-> t.getId().equals(stdId)).findFirst().get();
	}
	public void addstudent(student student) {
		students.add(student);
		
	}
	public void updatestudent(String stdId,student student) {
		for(int i=0;i<students.size();i++) {
			student t=students.get(i);
			if(t.getId().equals(stdId)) {
				students.set(i, student);
				return;
			}
		}
		
	}
	public void deletestudent(String stdId, student student) {
		students.removeIf(t->t.getId().equals(stdId));
	}

}
