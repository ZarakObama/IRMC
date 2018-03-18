package tn.esprit.IRMC.persistence;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Article
 *
 */
@Entity

public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String titre;
	private String Source;
	private Date date;
	private Integer numero;
	private String pays;
	private String abstrait;
	private Timestamp date_ajout;
	private String file;
	

    @ManyToMany(cascade = { 
        CascadeType.PERSIST, 
        CascadeType.MERGE
    })
    @JoinTable(name = "Article_Auteur",
        joinColumns = @JoinColumn(name = "article_id"),
        inverseJoinColumns = @JoinColumn(name = "auteur_id")
    )
    private List<Auteur> Auteurs = new ArrayList<>();
    
    @OneToMany(
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	    private List<Reference> references = new ArrayList<>();
	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getAbstrait() {
		return abstrait;
	}

	public void setAbstrait(String abstrait) {
		this.abstrait = abstrait;
	}

	public Timestamp getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(Timestamp date_ajout) {
		this.date_ajout = date_ajout;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public List<Auteur> getAuteurs() {
		return Auteurs;
	}

	public void setAuteurs(List<Auteur> auteurs) {
		Auteurs = auteurs;
	}

	public Article() {
		super();
	}
   
}
