package com.StudentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.Student.CollegeDetails;
import com.Student.ResponseData;
import com.Student.Student;


@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private WebClient.Builder webClient;

	@Override
	public ResponseEntity<ResponseData> getStudent(Long studentId) {
		
		ResponseData responce =new ResponseData();
		
		Student studentDetails =new Student();
		studentDetails.setStudentId(201l);
		studentDetails.setStudentNm("Rekha");
		studentDetails.setEmailId("roudra2013@gmail.com");
		studentDetails.setMobileNo("9345");
		studentDetails.setStudentCityNm("Vijayawada");
		
		studentDetails.setStudentStateNm("Ap");
		studentDetails.setAddress("2-34,Pamuru");
		studentDetails.setCollegeId(101l);
		
		responce.setStudent(studentDetails);
		
		Long collegeId=studentDetails.getCollegeId();

		RestTemplate restTemplate = new RestTemplate();
		
		String endPointUrl="http://localhost:8012/college/{collegeId}";
		ResponseEntity<CollegeDetails> data= restTemplate.getForEntity(endPointUrl, CollegeDetails.class, collegeId);
		
		if(data.getStatusCodeValue()==200) {	
		CollegeDetails collegeDetails = data.getBody();
		responce.setCollege(collegeDetails);
		}
		
//		CollegeDetails collegeDetails=	webClient.build().get().uri("http://localhost:8012/college/"+collegeId).retrieve().bodyToMono(CollegeDetails.class).block();
//		responce.setCollege(collegeDetails);
		
		return new ResponseEntity<ResponseData>(responce,HttpStatus.OK);
	}

}