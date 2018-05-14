package fr.epita.textmining.datamodel;
import javax.persistence.*;

@Entity @Table(name = "Paper")
public class Paper {
@Id @GeneratedValue
@Column(name = "Id")
private long Id;

@Column(name = "Title")
private String Title;

@Column(name = "Journal")
private String Journal;

@Column(name = "Details")
private String Details;

public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getDetails() {
	return Details;
}
public void setDetails(String details) {
	Details = details;
}
public String getJournal() {
	return Journal;
}
public void setJournal(String journal) {
	Journal = journal;
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
}
