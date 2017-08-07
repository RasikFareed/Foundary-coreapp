package com.aatek.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_master")

public class OrderMaster implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_uid")
	private Integer id;
		
	@ManyToOne
	@JoinColumn(name = "customer_uid", nullable = false)
	private User customer;

	@ManyToOne
	@JoinColumn(name = "facility_uid", nullable = false)
	private FacilityTypeMaster facilityType;
	
	@Column( name= "customer_ref_order_no" , nullable = false)
	private Integer customerRefOrderNo;
	
	@Column( name= "customer_ref_order_date" , nullable = false)
	private LocalDate customerRefOrderDate;
	
	@Column( name= "product_uid" , nullable = false)
	private Integer productUid;
	
	@Column( name= "product/drawing_no" , nullable = false)
	private String drawingNo;
	
	@Column( name= "product/our_reference_no" , nullable = false)
	private String referenceNo;

	@Column( name= "grade_uid" , nullable = false)
	private Integer gradeUid;
	
	@Column( name= "per_piece_weight" , nullable = false)
	private Double perPieceWeight;
	
	@ManyToOne
	@JoinColumn(name = "uom_uid", nullable = false)
	private UomMaster uom;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public FacilityTypeMaster getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(FacilityTypeMaster facilityType) {
		this.facilityType = facilityType;
	}

	public Integer getCustomerRefOrderNo() {
		return customerRefOrderNo;
	}

	public void setCustomerRefOrderNo(Integer customerRefOrderNo) {
		this.customerRefOrderNo = customerRefOrderNo;
	}

	public LocalDate getCustomerRefOrderDate() {
		return customerRefOrderDate;
	}

	public void setCustomerRefOrderDate(LocalDate customerRefOrderDate) {
		this.customerRefOrderDate = customerRefOrderDate;
	}

	public Integer getProductUid() {
		return productUid;
	}

	public void setProductUid(Integer productUid) {
		this.productUid = productUid;
	}

	public String getDrawingNo() {
		return drawingNo;
	}

	public void setDrawingNo(String drawingNo) {
		this.drawingNo = drawingNo;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Integer getGradeUid() {
		return gradeUid;
	}

	public void setGradeUid(Integer gradeUid) {
		this.gradeUid = gradeUid;
	}

	public Double getPerPieceWeight() {
		return perPieceWeight;
	}

	public void setPerPieceWeight(Double perPieceWeight) {
		this.perPieceWeight = perPieceWeight;
	}

	public UomMaster getUom() {
		return uom;
	}

	public void setUom(UomMaster uom) {
		this.uom = uom;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
