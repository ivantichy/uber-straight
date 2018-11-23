package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the structure database table.
 * 
 */
@Entity
@NamedQuery(name = "Structure.findAll", query = "SELECT s FROM Structure s")
public class Structure implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "cd_flags")
	private String cdFlags;

	@Column(name = "cd_formula")
	private String cdFormula;

	@Column(name = "cd_fp1")
	private Integer cdFp1;

	@Column(name = "cd_fp10")
	private Integer cdFp10;

	@Column(name = "cd_fp11")
	private Integer cdFp11;

	@Column(name = "cd_fp12")
	private Integer cdFp12;

	@Column(name = "cd_fp13")
	private Integer cdFp13;

	@Column(name = "cd_fp14")
	private Integer cdFp14;

	@Column(name = "cd_fp15")
	private Integer cdFp15;

	@Column(name = "cd_fp16")
	private Integer cdFp16;

	@Column(name = "cd_fp2")
	private Integer cdFp2;

	@Column(name = "cd_fp3")
	private Integer cdFp3;

	@Column(name = "cd_fp4")
	private Integer cdFp4;

	@Column(name = "cd_fp5")
	private Integer cdFp5;

	@Column(name = "cd_fp6")
	private Integer cdFp6;

	@Column(name = "cd_fp7")
	private Integer cdFp7;

	@Column(name = "cd_fp8")
	private Integer cdFp8;

	@Column(name = "cd_fp9")
	private Integer cdFp9;

	@Column(name = "cd_hash")
	private Integer cdHash;

	@Column(name = "cd_molweight")
	private double cdMolweight;

	@Column(name = "cd_pre_calculated")
	private byte cdPreCalculated;

	@Column(name = "cd_screen_descriptor")
	private String cdScreenDescriptor;

	@Lob
	@Column(name = "cd_smiles")
	private String cdSmiles;

	@Column(name = "cd_sortable_formula")
	private String cdSortableFormula;

	@Lob
	@Column(name = "cd_structure")
	private String cdStructure;

	@Column(name = "cd_taut_frag_hash")
	private String cdTautFragHash;

	@Column(name = "cd_taut_hash")
	private Integer cdTautHash;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "cd_timestamp")
	private Date cdTimestamp;

	private String mf;

	private BigDecimal mwt;

	private String unknown;
	
    // bi-directional one-to-one association to Parent
	@Id
	@OneToOne
	@JoinColumn(name="CD_ID", referencedColumnName="STRUCTURE_ID")
	private Parent parent;

	public Structure() {
	}

	public String getCdFlags() {
		return this.cdFlags;
	}

	public void setCdFlags(String cdFlags) {
		this.cdFlags = cdFlags;
	}

	public String getCdFormula() {
		return this.cdFormula;
	}

	public void setCdFormula(String cdFormula) {
		this.cdFormula = cdFormula;
	}

	public Integer getCdFp1() {
		return this.cdFp1;
	}

	public void setCdFp1(Integer cdFp1) {
		this.cdFp1 = cdFp1;
	}

	public Integer getCdFp10() {
		return this.cdFp10;
	}

	public void setCdFp10(Integer cdFp10) {
		this.cdFp10 = cdFp10;
	}

	public Integer getCdFp11() {
		return this.cdFp11;
	}

	public void setCdFp11(Integer cdFp11) {
		this.cdFp11 = cdFp11;
	}

	public Integer getCdFp12() {
		return this.cdFp12;
	}

	public void setCdFp12(Integer cdFp12) {
		this.cdFp12 = cdFp12;
	}

	public Integer getCdFp13() {
		return this.cdFp13;
	}

	public void setCdFp13(Integer cdFp13) {
		this.cdFp13 = cdFp13;
	}

	public Integer getCdFp14() {
		return this.cdFp14;
	}

	public void setCdFp14(Integer cdFp14) {
		this.cdFp14 = cdFp14;
	}

	public Integer getCdFp15() {
		return this.cdFp15;
	}

	public void setCdFp15(Integer cdFp15) {
		this.cdFp15 = cdFp15;
	}

	public Integer getCdFp16() {
		return this.cdFp16;
	}

	public void setCdFp16(Integer cdFp16) {
		this.cdFp16 = cdFp16;
	}

	public Integer getCdFp2() {
		return this.cdFp2;
	}

	public void setCdFp2(Integer cdFp2) {
		this.cdFp2 = cdFp2;
	}

	public Integer getCdFp3() {
		return this.cdFp3;
	}

	public void setCdFp3(Integer cdFp3) {
		this.cdFp3 = cdFp3;
	}

	public Integer getCdFp4() {
		return this.cdFp4;
	}

	public void setCdFp4(Integer cdFp4) {
		this.cdFp4 = cdFp4;
	}

	public Integer getCdFp5() {
		return this.cdFp5;
	}

	public void setCdFp5(Integer cdFp5) {
		this.cdFp5 = cdFp5;
	}

	public Integer getCdFp6() {
		return this.cdFp6;
	}

	public void setCdFp6(Integer cdFp6) {
		this.cdFp6 = cdFp6;
	}

	public Integer getCdFp7() {
		return this.cdFp7;
	}

	public void setCdFp7(Integer cdFp7) {
		this.cdFp7 = cdFp7;
	}

	public Integer getCdFp8() {
		return this.cdFp8;
	}

	public void setCdFp8(Integer cdFp8) {
		this.cdFp8 = cdFp8;
	}

	public Integer getCdFp9() {
		return this.cdFp9;
	}

	public void setCdFp9(Integer cdFp9) {
		this.cdFp9 = cdFp9;
	}

	public Integer getCdHash() {
		return this.cdHash;
	}

	public void setCdHash(Integer cdHash) {
		this.cdHash = cdHash;
	}

	public double getCdMolweight() {
		return this.cdMolweight;
	}

	public void setCdMolweight(double cdMolweight) {
		this.cdMolweight = cdMolweight;
	}

	public byte getCdPreCalculated() {
		return this.cdPreCalculated;
	}

	public void setCdPreCalculated(byte cdPreCalculated) {
		this.cdPreCalculated = cdPreCalculated;
	}

	public String getCdScreenDescriptor() {
		return this.cdScreenDescriptor;
	}

	public void setCdScreenDescriptor(String cdScreenDescriptor) {
		this.cdScreenDescriptor = cdScreenDescriptor;
	}

	public String getCdSmiles() {
		return this.cdSmiles;
	}

	public void setCdSmiles(String cdSmiles) {
		this.cdSmiles = cdSmiles;
	}

	public String getCdSortableFormula() {
		return this.cdSortableFormula;
	}

	public void setCdSortableFormula(String cdSortableFormula) {
		this.cdSortableFormula = cdSortableFormula;
	}

	public String getCdStructure() {
		return this.cdStructure;
	}

	public void setCdStructure(String cdStructure) {
		this.cdStructure = cdStructure;
	}

	public String getCdTautFragHash() {
		return this.cdTautFragHash;
	}

	public void setCdTautFragHash(String cdTautFragHash) {
		this.cdTautFragHash = cdTautFragHash;
	}

	public Integer getCdTautHash() {
		return this.cdTautHash;
	}

	public void setCdTautHash(Integer cdTautHash) {
		this.cdTautHash = cdTautHash;
	}

	public Date getCdTimestamp() {
		return this.cdTimestamp;
	}

	public void setCdTimestamp(Date cdTimestamp) {
		this.cdTimestamp = cdTimestamp;
	}

	public String getMf() {
		return this.mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	public BigDecimal getMwt() {
		return this.mwt;
	}

	public void setMwt(BigDecimal mwt) {
		this.mwt = mwt;
	}

	public String getUnknown() {
		return this.unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	

}