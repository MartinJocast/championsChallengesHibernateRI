package fr.formation.inti.entities;
// Generated 5 sept. 2019 14:30:50 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clubs generated by hbm2java
 */
@Entity
@Table(name = "clubs", catalog = "championschallengeproject")
public class Clubs implements java.io.Serializable {

	private Integer idClub;
	private String name;
	private String clubCode;
	private String countryCode;
	private String group;
	private int rate;
	private Set<Players> playerses = new HashSet<Players>(0);

	public Clubs() {
	}

	public Clubs(String name, String clubCode, String countryCode, String group, int rate) {
		this.name = name;
		this.clubCode = clubCode;
		this.countryCode = countryCode;
		this.group = group;
		this.rate = rate;
	}

	public Clubs(String name, String clubCode, String countryCode, String group, int rate, Set<Players> playerses) {
		this.name = name;
		this.clubCode = clubCode;
		this.countryCode = countryCode;
		this.group = group;
		this.rate = rate;
		this.playerses = playerses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_club", unique = true, nullable = false)
	public Integer getIdClub() {
		return this.idClub;
	}

	public void setIdClub(Integer idClub) {
		this.idClub = idClub;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "club_code", nullable = false, length = 3)
	public String getClubCode() {
		return this.clubCode;
	}

	public void setClubCode(String clubCode) {
		this.clubCode = clubCode;
	}

	@Column(name = "country_code", nullable = false, length = 3)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "group", nullable = false, length = 3)
	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Column(name = "rate", nullable = false)
	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clubs")
	public Set<Players> getPlayerses() {
		return this.playerses;
	}

	public void setPlayerses(Set<Players> playerses) {
		this.playerses = playerses;
	}

}
