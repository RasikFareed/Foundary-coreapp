package com.aatek.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state_master")
public class StateMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "state_uid")
	private Integer id;
	@Column( name= "state_name" , nullable = false)
	private String statetName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatetName() {
		return statetName;
	}
	public void setStatetName(String statetName) {
		this.statetName = statetName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
	
	
	

}
