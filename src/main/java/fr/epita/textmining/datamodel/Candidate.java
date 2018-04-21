package fr.epita.textmining.datamodel;

import java.util.List;

public class Candidate {
private String Name;
private String Email;
private String Phonenumber;
private List<WorkingExperience> we;
private List<EducationBackGround> ebg;
private List<Paper> papers;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(String phonenumber) {
	Phonenumber = phonenumber;
}
public List<WorkingExperience> getWe() {
	return we;
}
public void setWe(List<WorkingExperience> we) {
	this.we = we;
}
public List<EducationBackGround> getEbg() {
	return ebg;
}
public void setEbg(List<EducationBackGround> ebg) {
	this.ebg = ebg;
}
public List<Paper> getPapers() {
	return papers;
}
public void setPapers(List<Paper> papers) {
	this.papers = papers;
}
}
