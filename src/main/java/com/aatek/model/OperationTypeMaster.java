package com.aatek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation_type_master")
public class OperationTypeMaster implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "operation_type_uid")
	private Integer id;
	@Column( name= "operation_type_name" , nullable = false)
	private String operationTypeName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperationTypeName() {
		return operationTypeName;
	}
	public void setOperationTypeName(String operationTypeName) {
		this.operationTypeName = operationTypeName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
