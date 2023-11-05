package stu.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentID;
	private String studentName;
	
	
//	@Embedded
//	private Geo geoloc;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "year", nullable = false)
	Years year;// private 
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Students_Courses",
	    joinColumns = @JoinColumn(name = "StudentID"),
	    inverseJoinColumns = @JoinColumn(name = "CourseID"))
	
	private Set<Courses> courses = new HashSet<>();

}
