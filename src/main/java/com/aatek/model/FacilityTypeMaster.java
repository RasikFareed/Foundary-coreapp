package com.aatek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility_type_master")
public class FacilityTypeMaster implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "facility_type_uid")
	private Integer id;
	@Column( name= "facility_type_name" , nullable = false)
	private String facilityTypeName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getFacilityTypeName() {
		return facilityTypeName;
	}
	public void setFacilityTypeName(String facilityTypeName) {
		this.facilityTypeName = facilityTypeName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
