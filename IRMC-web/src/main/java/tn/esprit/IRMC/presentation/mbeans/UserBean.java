package tn.esprit.IRMC.presentation.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import tn.esprit.IRMC.persistence.User;
import tn.esprit.IRMC.services.UserServiceLocal;

@ManagedBean(name="UserBean")
@RequestScoped
public class UserBean {
	@EJB
	private UserServiceLocal userService;
	private List<User> users;

	private User user;
	public UserBean() {
	
	}
	@PostConstruct
	public void init() {
		users = userService.findAll();
		user = new User();
	}
	public String create() {
		String navigateTo = "/page/ajoutuser?faces-redirect=true";
		userService.create(user);
		return navigateTo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
