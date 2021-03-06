package com.youai.gs.common.payment.model;

// Generated Apr 3, 2011 4:49:30 PM by Hibernate Tools 3.3.0.GA

import static javax.persistence.GenerationType.*;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * AppleStore generated by hbm2java
 */
@Entity
@Table(name = "apple_store")
public class AppleStore implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "product_id", length = 64)
	private String productId;
	
	@Column(name = "purchased_at", length = 64)
	private String purchasedAt;
	
	@Column(name = "transaction_id", length = 128)
	private String transactionId;
	
	@Column(name = "item_id", length = 64)
	private String itemId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	private Date createdAt = new Date();

	public AppleStore() {
	}

	public AppleStore(String productId, String purchasedAt,
			String transactionId, String itemId, Date createdAt) {
		this.productId = productId;
		this.purchasedAt = purchasedAt;
		this.transactionId = transactionId;
		this.itemId = itemId;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPurchasedAt() {
		return this.purchasedAt;
	}

	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
