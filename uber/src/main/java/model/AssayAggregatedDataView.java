package model;

import java.io.Serializable;

import javax.annotation.processing.SupportedSourceVersion;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigInteger;


/**
 * The persistent class for the assay_aggregated_data_view database table.
 * 
 */
@Entity
@Immutable
@Table(name="assay_aggregated_data_view")
@NamedQuery(name="AssayAggregatedDataView.findAll", query="SELECT a FROM AssayAggregatedDataView a")
public class AssayAggregatedDataView implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ana;

	private String exp;

	@Column(name="exp_ana")
	private String expAna;
	@Id
	private BigInteger id;

	@Column(name="non_numeric_value")
	private String nonNumericValue;

	private byte notanumber;

	@Column(name="numeric_value")
	private double numericValue;

	@Column(name="param_type")
	private String paramType;

	@Column(name="relative_std")
	private double relativeStd;

	@Column(name="sample_size")
	private Integer sampleSize;

	//bi-directional many-to-one association to Parent
	@ManyToOne
	@JoinColumn(name="entity_id", referencedColumnName="PARENT_ID")
	private Parent parent;

	public AssayAggregatedDataView() {
	}

	public String getAna() {
		return this.ana;
	}

	public void setAna(String ana) {
		this.ana = ana;
	}

	public String getExp() {
		return this.exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getExpAna() {
		return this.expAna;
	}

	public void setExpAna(String expAna) {
		this.expAna = expAna;
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getNonNumericValue() {
		return this.nonNumericValue;
	}

	public void setNonNumericValue(String nonNumericValue) {
		this.nonNumericValue = nonNumericValue;
	}

	public byte getNotanumber() {
		return this.notanumber;
	}

	public void setNotanumber(byte notanumber) {
		this.notanumber = notanumber;
	}

	public double getNumericValue() {
		return this.numericValue;
	}

	public void setNumericValue(double numericValue) {
		this.numericValue = numericValue;
	}

	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public double getRelativeStd() {
		return this.relativeStd;
	}

	public void setRelativeStd(double relativeStd) {
		this.relativeStd = relativeStd;
	}

	public Integer getSampleSize() {
		return this.sampleSize;
	}

	public void setSampleSize(Integer sampleSize) {
		this.sampleSize = sampleSize;
	}

	public Parent getParent() {
		return this.parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

}