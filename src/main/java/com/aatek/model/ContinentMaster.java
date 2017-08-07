package com.aatek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continent_master")
public class ContinentMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "continent_uid")
	private Integer id;
	@Column( name= "continent_name" , nullable = false)
	private String continentName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
