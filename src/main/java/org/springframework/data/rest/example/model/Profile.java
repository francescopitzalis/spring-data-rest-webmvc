package org.springframework.data.rest.example.model;

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
public class Profile {

	public static final String LOGICAL_NAME = "profile";

	@Id
	@GeneratedValue
	private Long id;
	private String type;
	private String url;

	public Profile() {
	}

	public Profile(String type, String url) {
		this.type = type;
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Profile)) {
			return false;
		}

		final Profile p2 = (Profile) o;

		boolean idEq;
		if (null != id) {
			idEq = id.equals(p2.id);
		} else {
			idEq = p2.id == null;
		}

		boolean typeEq;
		if (null != type) {
			typeEq = type.equals(p2.type);
		} else {
			typeEq = p2.type == null;
		}

		boolean urlEq;
		if (null != url) {
			urlEq = url.equals(p2.url);
		} else {
			urlEq = p2.url == null;
		}

		return idEq && typeEq && urlEq;
	}

	@Override
	public String toString() {
		return "Profile{" + "id=" + id + ", type='" + type + '\'' + ", url='" + url + '\'' + '}';
	}

}
