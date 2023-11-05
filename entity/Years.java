package stu.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data

public class Years {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long year;
	//private String contributorName;
	
	//@Column(unique = true)
	//private String contributorEmail;
	
	@EqualsAndHashCode.Exclude // to avoid recursion, call each other 
	@ToString.Exclude
	
	@OneToMany(mappedBy = "year", cascade = CascadeType.ALL)
	private Set<Students> students = new HashSet<>();

}
