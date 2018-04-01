package tn.esprit.IRMC.persistence;


import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */

@Entity
public class User implements Serializable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String login;
	private String password;
	private String adress;
	private Integer tel;
	private Date date;


	
	private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy="sender")
	private List<Message> getMessagesFromTo;
	@OneToMany(mappedBy="receiver")
	private List<Message> getMessagesFor;
	
	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public User() {
		
	}   
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}  
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  
	
	public String getAdress() {
		return this.adress;
	}
	
	public List<Message> getGetMessagesFromTo() {
		return getMessagesFromTo;
	}
	
	public void setGetMessagesFromTo(List<Message> getMessagesFromTo) {
		this.getMessagesFromTo = getMessagesFromTo;
	}
	
	public List<Message> getGetMessagesFor() {
		return getMessagesFor;
	}
	public void setGetMessagesFor(List<Message> getMessagesFor) {
		this.getMessagesFor = getMessagesFor;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	public User(Integer id, String nom, String prenom, String email, String login, String password, String adress,
			String type) {
	
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
		this.adress = adress;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
   
	
}