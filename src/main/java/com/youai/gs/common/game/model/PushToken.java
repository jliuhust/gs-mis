package com.youai.gs.common.game.model;

// Generated 2011-5-9 19:24:39 by Hibernate Tools 3.3.0.GA

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * PushToken generated by hbm2java
 */
@Entity
@Table(name = "push_token")
public class PushToken implements java.io.Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String deviceId;
	private String token;

	public PushToken() {
	}

	public PushToken(Integer id) {
		this.id = id;
	}

	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "device_id", length = 64)
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Column(name = "token", length = 128)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
