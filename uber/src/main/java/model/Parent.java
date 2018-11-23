package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the parent database table.
 * 
 */
@Entity
@NamedQuery(name = "Parent.findAll", query = "SELECT p FROM Parent p")
public class Parent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String biological;
	@Id
	@Column(name = "PARENT_ID")
	private Integer parentId;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CST_ORIGINAL")
	private String cstOriginal;

	@Column(name = "DIRTY_STATUS")
	private String dirtyStatus;

	@Column(name = "GEOMETRIC_ISOMERISM")
	private String geometricIsomerism;

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

	private String pcn;

	private Integer restricted;

	private String stereochemistry;

	@Column(name = "STRUCTURE_TYPE")
	private Integer structureType;

	@Column(name = "UNKNOWN_ID")
	private Integer unknownId;

	@Column(name = "STRUCTURE_ID")
	private String structureId;

	// bi-directional many-to-one association to AdditionalData
	@OneToMany(mappedBy = "parent")
	private List<AdditionalData> additionalData;

	// bi-directional many-to-one association to AssayAggregatedDataView
	@OneToMany(mappedBy = "parent")
	private List<AssayAggregatedDataView> assayAggregatedDataViews;

	@OneToOne(mappedBy = "parent")
	private ParentIupacName parentIupacName;

	// bi-directional one-to-one association to Structure
	@OneToOne(mappedBy = "parent", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Structure structure;

	// bi-directional many-to-one association to Version
	@OneToMany(mappedBy = "parent")
	private List<Version> versions;

	public Parent() {
	}

	public String getBiological() {
		return this.biological;
	}

	public void setBiological(String biological) {
		this.biological = biological;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCstOriginal() {
		return this.cstOriginal;
	}

	public void setCstOriginal(String cstOriginal) {
		this.cstOriginal = cstOriginal;
	}

	public String getDirtyStatus() {
		return this.dirtyStatus;
	}

	public void setDirtyStatus(String dirtyStatus) {
		this.dirtyStatus = dirtyStatus;
	}

	public String getGeometricIsomerism() {
		return this.geometricIsomerism;
	}

	public void setGeometricIsomerism(String geometricIsomerism) {
		this.geometricIsomerism = geometricIsomerism;
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

	public String getPcn() {
		return this.pcn;
	}

	public void setPcn(String pcn) {
		this.pcn = pcn;
	}

	public Integer getRestricted() {
		return this.restricted;
	}

	public void setRestricted(Integer restricted) {
		this.restricted = restricted;
	}

	public String getStereochemistry() {
		return this.stereochemistry;
	}

	public void setStereochemistry(String stereochemistry) {
		this.stereochemistry = stereochemistry;
	}

	public Integer getStructureType() {
		return this.structureType;
	}

	public void setStructureType(Integer structureType) {
		this.structureType = structureType;
	}

	public Integer getUnknownId() {
		return this.unknownId;
	}

	public void setUnknownId(Integer unknownId) {
		this.unknownId = unknownId;
	}

	public List<AdditionalData> getAdditionalData() {
		return this.additionalData;
	}

	public void setAdditionalData(List<AdditionalData> additionalData) {
		this.additionalData = additionalData;
	}

	public AdditionalData addAdditionalData(AdditionalData additionalData) {
		getAdditionalData().add(additionalData);
		additionalData.setParent(this);

		return additionalData;
	}

	public AdditionalData removeAdditionalData(AdditionalData additionalData) {
		getAdditionalData().remove(additionalData);
		additionalData.setParent(null);

		return additionalData;
	}

	public List<AssayAggregatedDataView> getAssayAggregatedDataViews() {
		return this.assayAggregatedDataViews;
	}

	public void setAssayAggregatedDataViews(
			List<AssayAggregatedDataView> assayAggregatedDataViews) {
		this.assayAggregatedDataViews = assayAggregatedDataViews;
	}

	public AssayAggregatedDataView addAssayAggregatedDataView(
			AssayAggregatedDataView assayAggregatedDataView) {
		getAssayAggregatedDataViews().add(assayAggregatedDataView);
		assayAggregatedDataView.setParent(this);

		return assayAggregatedDataView;
	}

	public AssayAggregatedDataView removeAssayAggregatedDataView(
			AssayAggregatedDataView assayAggregatedDataView) {
		getAssayAggregatedDataViews().remove(assayAggregatedDataView);
		assayAggregatedDataView.setParent(null);

		return assayAggregatedDataView;
	}

	public ParentIupacName getParentIupacName() {
		return this.parentIupacName;
	}

	public void setParentIupacName(ParentIupacName parentIupacNames) {
		this.parentIupacName = parentIupacNames;
	}

	public ParentIupacName addParentIupacName(ParentIupacName parentIupacName) {
		this.parentIupacName = parentIupacName;
		parentIupacName.setParent(this);
		return parentIupacName;
	}

	public Structure getStructure() {
		return this.structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	public List<Version> getVersions() {
		return this.versions;
	}

	public void setVersions(List<Version> versions) {
		this.versions = versions;
	}

	public Version addVersion(Version version) {
		getVersions().add(version);
		version.setParent(this);

		return version;
	}

	public Version removeVersion(Version version) {
		getVersions().remove(version);
		version.setParent(null);

		return version;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public static List<Parent> allParents() {

		EntityManager em = Persistence.createEntityManagerFactory("uber")
				.createEntityManager();
		return em.createNamedQuery("Parent.findAll").getResultList();
	}

	public String getStructureId() {
		return structureId;
	}

	public void setStructureId(String structureId) {
		this.structureId = structureId;
	}
}