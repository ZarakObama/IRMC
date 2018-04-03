package tn.esprit.IRMC.presentation.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="AdminViewBean")
@RequestScoped
public class AdminViewBean {
	public String redirectapprouver() {
		return "/page/user/users?faces-redirect=true";
	}

}
