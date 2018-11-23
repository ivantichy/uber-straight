package model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

/**
 * The persistent class for the parent_iupac_name database table.
 * 
 */
@Entity
@Immutable
@Table(name = "parent_iupac_name")
@NamedQuery(name = "ParentIupacName.findAll", query = "SELECT p FROM ParentIupacName p")
public class ParentIupacName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ad_value")
	private String adValue;
	// bi-directional many-to-one association to Parent
	@OneToOne
	@Id
	@JoinColumn(name = "parent_id", referencedColumnName = "PARENT_ID")
	private Parent parent;

	public ParentIupacName() {
	}

	public String getAdValue() {
		return this.adValue;
	}

	public void setAdValue(String adValue) {
		this.adValue = adValue;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}