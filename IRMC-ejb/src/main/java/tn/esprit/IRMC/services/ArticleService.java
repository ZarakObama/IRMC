package tn.esprit.IRMC.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.IRMC.persistence.Article;

@Local
public interface ArticleService {


	public void addArticle(Article a);
	public void updateArticle(Article a);
	public void deleteArticle(Integer id);
	public Article getArticlebyid(Integer id);
	public List<Article> getAllArticle();


}
