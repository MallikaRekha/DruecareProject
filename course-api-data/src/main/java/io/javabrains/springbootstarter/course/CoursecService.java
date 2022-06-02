package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class CoursecService {
	
	@Autowired
	private CourseRepository CourseRepository;
	
	public List<Course> getAllCourses(String topicId){
		
		List<Course> courses=new ArrayList<>();				
		CourseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	public Course getCourse(String id) {
		//return topicRepository.stream().filter(t-> t.findById(id).equals(id)).findFirst().get();
		return CourseRepository.findById(id).get();
	}
	
	public void addCourse(Course course) {
		CourseRepository.save(course);
		
	}
	public void updateCourse(Course course) {
		CourseRepository.save(course);
				
			}
		
		
	
	public void deleteCourse(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		CourseRepository.deleteById(id);
	}

}
