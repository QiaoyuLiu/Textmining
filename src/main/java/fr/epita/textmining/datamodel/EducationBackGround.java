package fr.epita.textmining.datamodel;

import javax.persistence.*;

@Entity(name = "EducationBackGroundTable")
public class EducationBackGround {
@javax.persistence.Id @GeneratedValue
@Column(name = "Id")
private String Id;

@Column(name = "Schoolname")
private String Schoolname;

@Column(name = "Educationlevel")
private String Educationlevel;

public String getSchoolname() {
	return Schoolname;
}
public void setSchoolname(String schoolname) {
	Schoolname = schoolname;
}
public String getEducationlevel() {
	return Educationlevel;
}
public void setEducationlevel(String educationlevel) {
	Educationlevel = educationlevel;
}
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}

}
