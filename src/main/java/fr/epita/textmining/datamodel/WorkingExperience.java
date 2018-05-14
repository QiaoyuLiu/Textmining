package fr.epita.textmining.datamodel;

import javax.persistence.*;

@Entity @Table (name = "WorkingEperience")
public class WorkingExperience {
@Id @GeneratedValue
@Column(name = "Id")
private long Id;

@Column(name = "Company")
private String Company;

@Column(name = "Position")
private String Position;

@Column(name = "Details")
private String Details;

public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}
public String getPosition() {
	return Position;
}
public void setPosition(String position) {
	Position = position;
}
public String getDetails() {
	return Details;
}
public void setDetails(String details) {
	Details = details;
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}

}
