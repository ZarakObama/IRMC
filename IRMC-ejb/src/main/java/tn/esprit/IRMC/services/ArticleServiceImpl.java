package tn.esprit.IRMC.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.IRMC.persistence.Article;

@Stateless
public class ArticleServiceImpl implements ArticleService {
	
	@PersistenceContext
	EntityManager em;
	@EJB
	ArticleService se;

	@Override
	public void addArticle(Article a) {
		em.persist(a);
		
	}

	@Override
	public void updateArticle(Article a) {
   em.merge(a);		
	}


	@Override
	public List<Article> getAllArticle() {
		Query q = em.createQuery("select d from Article d",Article.class);
		return q.getResultList();

	}

	@Override
	public void deleteArticle(Integer id) {
		em.remove(getArticlebyid(id));		
	}

	@Override
	public Article getArticlebyid(Integer id) {
		return em.find(Article.class, id);
	}

}
