package io.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;



@RestController
public class CourseController {
	@Autowired
	private CoursecService courseservice;
	@RequestMapping("/topics/{id}/Courses")
	public List<Course> getAllCourses(@PathVariable String id) {
	return courseservice.getAllCourses(id);
			}
	@RequestMapping("/topics/{topicId}/Couses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseservice.getCourse(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/Courses")
	public void addTopic(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.addCourse(course);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId},Courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		courseservice.updateCourse(course);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId},Course/{id}")
	public void deleteTopic(@PathVariable String id) {
		courseservice.deleteCourse(id);
		
	}


}