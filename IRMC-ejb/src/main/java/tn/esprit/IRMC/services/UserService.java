package tn.esprit.IRMC.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.IRMC.persistence.User;

@Stateless
public class UserService implements UserServiceLocal ,UserServiceRemote{
	@PersistenceContext
	private EntityManager em;

	@Override
	public Boolean updateUser(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeUser(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		

		return  em.createQuery("select d from User d", User.class).getResultList();
				//em.createQuery("select d from user d",User.class).getResultList();
	}

	@Override
	public User FindById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void create(User usr) {
		
		em.persist(usr);
	}
}
