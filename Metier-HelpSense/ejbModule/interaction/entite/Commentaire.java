package interaction.entite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;

import contenu.entite.Article;

import utilisateurs.entite.User;

@Entity
public class Commentaire {
	
	

	@Id @GeneratedValue
	private Long id;
	
	private String contenu;
	

	/*
	 * private Long like; private Long dislike;
	 */
	/*
	 * @OneToOne private Like like;
	 * 
	 * //@OneToMany(mappedBy = "dislike")
	 * 
	 * @OneToOne private Dislike dislike;
	 */
	
	private Date date;
	
	@OneToOne(optional = false)
	@JoinColumn(name="user_id")
	private User user;
	
	
	  @ManyToMany
	  @JoinTable(name="response_commentaire", joinColumns=@JoinColumn(name="contenu_response"), inverseJoinColumns=@JoinColumn(name="commentaire_id") ) 
	//  private HashMap<Long, List<Long> >  responsesCommentaire = new HashMap<Long, List<Long> >();
	  private List<Commentaire> responsesCommentaire;
	
	
	 
	/*
	 * @OneToOne(optional = true) private Dislike dislike;
	 * 
	 * @OneToOne(optional = true) private Like like;
	 * 
	 * public Dislike getDislike() { return dislike; }
	 * 
	 * 
	 * public void setDislike(Dislike dislike) { this.dislike = dislike; }
	 * 
	 * 
	 * public Like getLike() { return like; }
	 * 
	 * 
	 * public void setLike(Like like) { this.like = like; }
	 */

	
	/*
	 * @OneToOne(optional = false)
	 * 
	 * @JoinColumn(name="article_id") private Article article;
	 */
	
	public void ajouterCommentaireInComment(Commentaire commentaire) {
		
		this.responsesCommentaire.add(commentaire);
		
	}
	
	public void ajouterCommentaireUser(User user) {
		
		this.setUser(user);
		
	}


	public List<Commentaire> getResponsesCommentaire() {
		return responsesCommentaire;
	}


	public void setResponsesCommentaire(List<Commentaire> responsesCommentaire) {
		this.responsesCommentaire = responsesCommentaire;
	}


	public Commentaire(String contenu) {
		super();
		this.contenu = contenu;
		//this.like=0L;
		//this.dislike=0L;
	}


	/*
	 * @ManyToOne
	 * 
	 * @JoinTable(name="article_commentaire",
	 * joinColumns=@JoinColumn(name="commentaire_id"),
	 * inverseJoinColumns=@JoinColumn(name="article_id") ) private List<Article >
	 * commentairesArticle;
	 * 
	 */
	//private Long likes;
	
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name="commentaire_user",
	 * joinColumns=@JoinColumn(name="comment_id"),
	 * inverseJoinColumns=@JoinColumn(name="fk_user") ) private Collection<User>
	 * user_id_comment = new ArrayList<User>();
	 * 
	 * 
	 * 
	 * @ManyToMany
	 * 
	 * @JoinTable(name="commentaire_comment",
	 * joinColumns=@JoinColumn(name="comment_id"),
	 * inverseJoinColumns=@JoinColumn(name="fk_comment_id") ) private
	 * Collection<Commentaire> commentaire_comment = new ArrayList<Commentaire>();
	 * 
	 * 
	 * 
	 * @ManyToMany
	 * 
	 * @JoinTable(name="commentaire_article",
	 * joinColumns=@JoinColumn(name="comment_id"),
	 * inverseJoinColumns=@JoinColumn(name="fk_article_id") ) private
	 * Collection<Article> article_id = new ArrayList<Article>();
	 * 
	 * 
	 * @OneToMany
	 * 
	 * @JoinTable(name="commentaire_skills",
	 * joinColumns=@JoinColumn(name="comment_id"),
	 * inverseJoinColumns=@JoinColumn(name="fk_skills_id_commentaire") ) private
	 * Collection<Skills> commentaire_skills= new ArrayList<Skills>();
	 */
	
/*
	@ManyToOne
	@JoinColumn(name="user_id")
	private Collection<User> userPublication = new ArrayList<User>();
	
	@ManyToOne
	@JoinColumn(name="article_id")
	private Collection<User> articlePublication = new ArrayList<User>();
	
	
	*/


	

	public Commentaire(Long comment_id, String comment_intitule, String comment_contenu, String url_image,
			String url_video, Long like) {
		super();

		this.contenu = comment_contenu;
		
		
		
		this.date = new Date();
	}


	public Commentaire() {
		// TODO Auto-generated constructor stub
	}
	
	




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	

	public User getUser() {
		return user;
	}

	

	public void setUser(User user) {
		this.user = user;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/*
	 * 
	 * public void ajouterLike() {
	 * 
	 * this.like = like++; } public void ajouterDisike() {
	 * 
	 * this.dislike = dislike++; } public Long getLike() { return like; }
	 * 
	 * 
	 * public void setLike(Long like) { this.like = like; }
	 * 
	 * 
	 * public Long getDislike() { return dislike; }
	 * 
	 * 
	 * public void setDislike(Long dislike) { this.dislike = dislike; }
	 */
	

	
	
	
}
