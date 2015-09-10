package org.springframework.data.rest.example.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonTypeName(Address.LOGICAL_NAME)
public class Address {

	public static final String LOGICAL_NAME = "address";

	@Id
	@GeneratedValue
	private Long id;
	@ElementCollection
	private List<String> lines;
	private String city;
	private String province;
	private String postalCode;

	public Address() {
	}

	public Address(List<String> lines, String city, String province, String postalCode) {
		this.lines = lines;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getLines() {
		return lines;
	}

	public void setLines(List<String> lines) {
		this.lines = lines;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address{" + "id=" + id + ", lines=" + lines + ", city='" + city + '\'' + ", province='" + province
				+ '\'' + ", postalCode='" + postalCode + '\'' + '}';
	}

}
