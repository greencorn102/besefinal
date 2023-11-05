package stu.service;

import java.util.NoSuchElementException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stu.controller.model.StuData;
import stu.dao.StudentDao;
import stu.entity.Students;
import stu.entity.Years;

@Service
public class StuService {
	
	@Autowired 
	private StudentDao studentDao;

	@Transactional(readOnly = false)
	public StuData saveStudent(StuData stuData) {
		Long year = stuData.getYears();
		Students students = null;
		Years years = null;
		
		
		
		
		if (Objects.isNull(students)) {
			students = new Students();
		}
		else {
			students = null; // findStu(year);
		}
		// TODO Auto-generated method stub
		students.setYear(years);//, stuData);
		return new StuData(studentDao.save(years));
	}


	public void setFieldStu(Years years, StuData stuData) {
		years.setYear(stuData.getYears());
		//contributor.setContributorName(contributorData.getContributorName());
		// TODO Auto-generated method stub
		
	}


	private Years findStu(Long students) {
		return studentDao.findById(students).orElseThrow(() -> new NoSuchElementException("Year" + students + "not found..."));
	}
	
	
}
