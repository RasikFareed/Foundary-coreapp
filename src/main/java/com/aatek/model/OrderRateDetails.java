package com.aatek.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_rate_details")
public class OrderRateDetails {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_rate_details_id")
	private Integer id;
		
	@ManyToOne
	@JoinColumn(name = "order_uid", nullable = false)
	private OrderMaster order;

	@ManyToOne
	@JoinColumn(name = "operation_type_uid", nullable = false)
	private OperationTypeMaster operationType;
	
	@Column( name= "rate_per_piece" , nullable = false)
	private Integer ratePerPiece;
	
	@Column( name= "memo" , nullable = false)
	private String memo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrderMaster getOrder() {
		return order;
	}

	public void setOrder(OrderMaster order) {
		this.order = order;
	}

	public OperationTypeMaster getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationTypeMaster operationType) {
		this.operationType = operationType;
	}

	public Integer getRatePerPiece() {
		return ratePerPiece;
	}

	public void setRatePerPiece(Integer ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
