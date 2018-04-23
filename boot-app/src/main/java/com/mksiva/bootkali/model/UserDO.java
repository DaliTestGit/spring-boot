package com.mksiva.bootkali.model;

import io.swagger.annotations.ApiModelProperty;

public class UserDO {
	@ApiModelProperty(required = true)
	private String name;

	@ApiModelProperty(required = true)
	private String email;

	@ApiModelProperty(required = true)
	private String phone;

	private String aboutMe;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
}