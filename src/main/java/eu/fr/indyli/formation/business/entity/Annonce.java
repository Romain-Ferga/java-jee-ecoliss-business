package eu.fr.indyli.formation.business.entity;
// Generated 25 juin 2017 02:21:10 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Annonce generated by hbm2java
 */
@Entity
@Table(name = "annonce", catalog = "bd_colis_esic")
public class Annonce extends AbstractEcolisEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 52399207140791213L;
	private Integer idAnnonce;
	private Utilisateur utilisateur;
	private String natureColis;
	private long poids;
	private int unitePoids;
	private Date dateDepot;
	private Date dateDepart;
	private Date dateArrivee;
	private String villeDepart;
	private String villeArrivee;
	private long prime;
	private int devise;
	private String statut;
	private int typeAnnonce;
	private String detail;
	private Set<Message> messages = new HashSet<Message>(0);

	public Annonce() {
	}

	public Annonce(Utilisateur utilisateur, long poids, int unitePoids, Date dateDepot, Date dateDepart,
			Date dateArrivee, long prime, int devise, int typeAnnonce) {
		this.utilisateur = utilisateur;
		this.poids = poids;
		this.unitePoids = unitePoids;
		this.dateDepot = dateDepot;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.prime = prime;
		this.devise = devise;
		this.typeAnnonce = typeAnnonce;
	}

	public Annonce(Utilisateur utilisateur, String natureColis, long poids, int unitePoids, Date dateDepot,
			Date dateDepart, Date dateArrivee, String villeDepart, String villeArrivee, long prime, int devise,
			String statut, int typeAnnonce, String detail, Set<Message> messages) {
		this.utilisateur = utilisateur;
		this.natureColis = natureColis;
		this.poids = poids;
		this.unitePoids = unitePoids;
		this.dateDepot = dateDepot;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.prime = prime;
		this.devise = devise;
		this.statut = statut;
		this.typeAnnonce = typeAnnonce;
		this.detail = detail;
		this.messages = messages;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_annonce", unique = true, nullable = false)
	public Integer getIdAnnonce() {
		return this.idAnnonce;
	}

	public void setIdAnnonce(Integer idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_utilisateur", nullable = false)
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Column(name = "nature_colis")
	public String getNatureColis() {
		return this.natureColis;
	}

	public void setNatureColis(String natureColis) {
		this.natureColis = natureColis;
	}

	@Column(name = "poids", nullable = false, precision = 10, scale = 0)
	public long getPoids() {
		return this.poids;
	}

	public void setPoids(long poids) {
		this.poids = poids;
	}

	@Column(name = "unite_poids", nullable = false)
	public int getUnitePoids() {
		return this.unitePoids;
	}

	public void setUnitePoids(int unitePoids) {
		this.unitePoids = unitePoids;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_depot", nullable = false, length = 19)
	public Date getDateDepot() {
		return this.dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_depart", nullable = false, length = 19)
	public Date getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_arrivee", nullable = false, length = 19)
	public Date getDateArrivee() {
		return this.dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	@Column(name = "ville_depart", length = 50)
	public String getVilleDepart() {
		return this.villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	@Column(name = "ville_arrivee", length = 50)
	public String getVilleArrivee() {
		return this.villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	@Column(name = "prime", nullable = false, precision = 10, scale = 0)
	public long getPrime() {
		return this.prime;
	}

	public void setPrime(long prime) {
		this.prime = prime;
	}

	@Column(name = "devise", nullable = false)
	public int getDevise() {
		return this.devise;
	}

	public void setDevise(int devise) {
		this.devise = devise;
	}

	@Column(name = "statut", length = 10)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Column(name = "type_annonce", nullable = false)
	public int getTypeAnnonce() {
		return this.typeAnnonce;
	}

	public void setTypeAnnonce(int typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

	@Column(name = "detail", length = 250)
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "annonce")
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

}
