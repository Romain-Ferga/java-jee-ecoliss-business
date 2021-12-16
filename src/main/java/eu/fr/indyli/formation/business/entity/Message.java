package eu.fr.indyli.formation.business.entity;
// Generated 25 juin 2017 02:21:10 by Hibernate Tools 5.2.0.CR1

import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Message generated by hbm2java
 */
@Entity
@Table(name = "message", catalog = "bd_colis_esic")
public class Message extends AbstractEcolisEntity implements java.io.Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 5315428355602942960L;
  private Integer idMessage;
  private Annonce annonce;
  private Utilisateur utilisateur;
  private String corps;
  private Date dateCreation;

  public Message() {}

  public Message(Annonce annonce, Date dateCreation) {
    this.annonce = annonce;
    this.dateCreation = dateCreation;
  }

  public Message(Annonce annonce, Utilisateur utilisateur, String corps, Date dateCreation) {
    this.annonce = annonce;
    this.utilisateur = utilisateur;
    this.corps = corps;
    this.dateCreation = dateCreation;
  }

  public Message(Integer idMessage, String corps, Date dateCreation) {
    super();
    this.idMessage = idMessage;
    this.corps = corps;
    this.dateCreation = dateCreation;
  }

  @Id
  @GeneratedValue(strategy = IDENTITY)

  @Column(name = "id_message", unique = true, nullable = false)
  public Integer getIdMessage() {
    return this.idMessage;
  }

  public void setIdMessage(Integer idMessage) {
    this.idMessage = idMessage;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_annonce", nullable = false)
  public Annonce getAnnonce() {
    return this.annonce;
  }

  public void setAnnonce(Annonce annonce) {
    this.annonce = annonce;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_utilisateur")
  public Utilisateur getUtilisateur() {
    return this.utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  @Column(name = "corps", length = 65535)
  public String getCorps() {
    return this.corps;
  }

  public void setCorps(String corps) {
    this.corps = corps;
  }

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "date_creation", nullable = false, length = 19)
  public Date getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
  }

  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
