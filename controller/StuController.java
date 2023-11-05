package stu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import stu.controller.model.StuData;
import stu.entity.Students;
import stu.service.StuService;

@RestController
@RequestMapping("/stu")
@Slf4j

public class StuController {
	@Autowired 
	StuService stuService;
	@PostMapping("/students")
	public StuData insertStudent(
			@RequestBody StuData stuData) {
		log.info("Creating student {}", stuData);
		return stuService.saveStudent(stuData);
		
/*		
		@PostMapping("/years")
		public YearData insertContributor(
				@RequestBody YearData yearData) {
			log.info("Creating contributor {}", yearData);
			return stuService.saveYear(yearData);		
			*/
		
	}

}


//public PetParkResponse(PetPark petPark) {
//	// TODO Auto-generated constructor stub
//}