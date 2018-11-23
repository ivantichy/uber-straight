package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the version database table.
 * 
 */
@Entity
@NamedQuery(name = "Version.findAll", query = "SELECT v FROM Version v")
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "CALCULATED_MWT")
	private BigDecimal calculatedMwt;

	private String cn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Lob
	@Column(name = "FUSED_IMAGE")
	private String fusedImage;

	@Column(name = "CHEMIST_ID")
	private String chemistId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INIT_DATE")
	private Date initDate;

	@Column(name = "IS_DELETED")
	private String isDeleted;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MOD_DATE")
	private Date modDate;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	private BigDecimal mwt;

	@Column(name = "SALT_FINGERPRINT")
	private String saltFingerprint;

	@Column(name = "STRUCTURE_ID")
	private Integer structureId;

	@Column(name = "VERSION_ID")
	private Integer versionId;

	// bi-directional many-to-one association to Parent
	@ManyToOne
	@Id
	@JoinColumn(name = "PARENT_ID", referencedColumnName = "PARENT_ID")
	private Parent parent;

	public Version() {
	}

	public BigDecimal getCalculatedMwt() {
		return this.calculatedMwt;
	}

	public void setCalculatedMwt(BigDecimal calculatedMwt) {
		this.calculatedMwt = calculatedMwt;
	}

	public String getCn() {
		return this.cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getFusedImage() {
		return this.fusedImage;
	}

	public void setFusedImage(String fusedImage) {
		this.fusedImage = fusedImage;
	}

	public String getChemistId() {
		return this.chemistId;
	}

	public void setChemistId(String chemistId) {
		this.chemistId = chemistId;
	}

	public Date getInitDate() {
		return this.initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public String getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getModDate() {
		return this.modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public BigDecimal getMwt() {
		return this.mwt;
	}

	public void setMwt(BigDecimal mwt) {
		this.mwt = mwt;
	}

	public String getSaltFingerprint() {
		return this.saltFingerprint;
	}

	public void setSaltFingerprint(String saltFingerprint) {
		this.saltFingerprint = saltFingerprint;
	}

	public Integer getStructureId() {
		return this.structureId;
	}

	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
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