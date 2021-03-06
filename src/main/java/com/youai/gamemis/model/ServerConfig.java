package com.youai.gamemis.model;

// Generated 2013-5-7 11:48:40 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Transient;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ServerConfig generated by hbm2java
 */
@Entity
@Table(name = "server_config")
public class ServerConfig implements java.io.Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer serverIdx;
	private String name;
	private Integer sellGoodsFactor;
	private Integer sellSpecialityFactor;
	private Integer status;
    private Integer mergeServer;

    @Column(name = "status")
	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}


	@Column(name = "merge_server")
	public Integer getMergeServer() {
		return mergeServer;
	}



	public void setMergeServer(Integer mergeServer) {
		this.mergeServer = mergeServer;
	}



	public ServerConfig() {
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

	@Column(name = "server_idx")
	public Integer getServerIdx() {
		return this.serverIdx;
	}

	public void setServerIdx(Integer serverIdx) {
		this.serverIdx = serverIdx;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sell_goods_factor")
	public Integer getSellGoodsFactor() {
		return this.sellGoodsFactor;
	}

	public void setSellGoodsFactor(Integer sellGoodsFactor) {
		this.sellGoodsFactor = sellGoodsFactor;
	}

	@Column(name = "sell_speciality_factor")
	public Integer getSellSpecialityFactor() {
		return this.sellSpecialityFactor;
	}

	public void setSellSpecialityFactor(Integer sellSpecialityFactor) {
		this.sellSpecialityFactor = sellSpecialityFactor;
	}

}
