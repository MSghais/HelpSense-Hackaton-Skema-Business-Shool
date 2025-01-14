package contenu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import contenu.entite.Article;

import utilisateurs.entite.User;




public class ModelContenu {
	private List<Article> articles;

	private List<User> usersLectures;
	
	private Article article;

	private Map<Long,Article> articlesMap;
	
	public ModelContenu() {

	}
	
	public ModelContenu(List<Article> articles, List<User> usersLectures, HashMap<Long,Article> articlesMap) {
		super();
		this.articles = new ArrayList<Article>();

		this.usersLectures =  new ArrayList<User>();
		
		this.articlesMap = new HashMap<Long, Article>();
	}

	public ModelContenu(List<Article> articles, List<User> usersLectures) {
		super();
		this.articles = articles;

		this.usersLectures = usersLectures;
	}



	public List<Article> getArticles() {
		return articles;
	}
	
	public void addArticle(Article article) {
		
		articles.add(article);
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	


	public List<User> getUsersLectures() {
		return usersLectures;
	}


	public void setUsersLectures(List<User> usersLectures) {
		this.usersLectures = usersLectures;
	}

	@Override
	public String toString() {
		return "ModelContenu [articles=" + articles + ", usersLectures="
				+ usersLectures + "]";
	}

	public Map<Long, Article> getArticlesMap() {
		return articlesMap;
	}

	public void setArticlesMap(Map<Long, Article> articlesMap) {
		this.articlesMap = articlesMap;
	}

	public void addArticleMap(User user,Article article) {
		
		articlesMap.put(user.getUser_id(), article);
	
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	

	
}
