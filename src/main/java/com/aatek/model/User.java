package com.aatek.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_master")

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_uid")
	private Integer id;
	
	@Column( name= "cutomer_name" , nullable = false)
	private String customerName;
	
	@Column( name= "address_1" , nullable = false)
	private String address1;
	
	@Column( name= "address_2" , nullable = false)
	private String address2;
	
	@ManyToOne
	@JoinColumn(name = "city_uid", nullable = false)
	private CityMaster city;
	
	@Column( name= "zip_code" , nullable = false)
	private Integer zipCode;
	
	@ManyToOne
	@JoinColumn(name = "state_uid", nullable = false)
	private StateMaster state;
	
	@ManyToOne
	@JoinColumn(name = "country_uid", nullable = false)
	private CountryMaster country;
	
	@ManyToOne
	@JoinColumn(name = "continent_uid", nullable = false)
	private ContinentMaster continent;
	
	@Column( name= "company_website" , nullable = false)
	private String companyWebsite;
	
	@Column( name= "company_phone_no" , nullable = false)
	private Integer companyPhoneNo;
	
	@Column( name= "company_email" , nullable = false)
	private String companyEmail;
	
	@Column( name= "company_fax" , nullable = false)
	private Integer companyFax;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public CityMaster getCity() {
		return city;
	}

	public void setCity(CityMaster city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public StateMaster getState() {
		return state;
	}

	public void setState(StateMaster state) {
		this.state = state;
	}

	public CountryMaster getCountry() {
		return country;
	}

	public void setCountry(CountryMaster country) {
		this.country = country;
	}

	public ContinentMaster getContinent() {
		return continent;
	}

	public void setContinent(ContinentMaster continent) {
		this.continent = continent;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public Integer getCompanyPhoneNo() {
		return companyPhoneNo;
	}

	public void setCompanyPhoneNo(Integer companyPhoneNo) {
		this.companyPhoneNo = companyPhoneNo;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public Integer getCompanyFax() {
		return companyFax;
	}

	public void setCompanyFax(Integer companyFax) {
		this.companyFax = companyFax;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
