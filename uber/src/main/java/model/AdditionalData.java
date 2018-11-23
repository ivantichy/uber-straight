package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the additional_data database table.
 * 
 */
@Entity
@Table(name="additional_data")
@NamedQuery(name="AdditionalData.findAll", query="SELECT a FROM AdditionalData a")
public class AdditionalData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AD_DICTIONARY_URL")
	private String adDictionaryUrl;

	@Column(name="AD_DICTIONARY_VALUES")
	private String adDictionaryValues;
	@Id
	@Column(name="AD_ID")
	private Integer adId;

	@Column(name="AD_INPUT_TYPE")
	private String adInputType;

	@Column(name="AD_NAME")
	private String adName;

	@Column(name="AD_VALIDATORS")
	private String adValidators;

	@Column(name="AD_VALUE")
	private String adValue;

	@Column(name="IS_DELETED")
	private String isDeleted;

	@Column(name="PREPARATION_ID")
	private Integer preparationId;

	@Column(name="VERSION_ID")
	private Integer versionId;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="PARENT_ID", referencedColumnName="PARENT_ID")
	private Parent parent;

	public AdditionalData() {
	}

	public String getAdDictionaryUrl() {
		return this.adDictionaryUrl;
	}

	public void setAdDictionaryUrl(String adDictionaryUrl) {
		this.adDictionaryUrl = adDictionaryUrl;
	}

	public String getAdDictionaryValues() {
		return this.adDictionaryValues;
	}

	public void setAdDictionaryValues(String adDictionaryValues) {
		this.adDictionaryValues = adDictionaryValues;
	}

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getAdInputType() {
		return this.adInputType;
	}

	public void setAdInputType(String adInputType) {
		this.adInputType = adInputType;
	}

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAdValidators() {
		return this.adValidators;
	}

	public void setAdValidators(String adValidators) {
		this.adValidators = adValidators;
	}

	public String getAdValue() {
		return this.adValue;
	}

	public void setAdValue(String adValue) {
		this.adValue = adValue;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getPreparationId() {
		return this.preparationId;
	}

	public void setPreparationId(Integer preparationId) {
		this.preparationId = preparationId;
	}

	public Integer getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}