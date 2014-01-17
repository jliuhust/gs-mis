package com.youai.gs.common.game.model;

// Generated 2011-5-9 19:24:39 by Hibernate Tools 3.3.0.GA

import static javax.persistence.GenerationType.IDENTITY;

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
 * PlayerFriend generated by hbm2java
 */
@Entity
@Table(name = "player_friend")
public class PlayerFriend implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "player_key")
	private Integer playerKey;
	
	@Column(name = "friend_key")
	private Integer friendKey;
	
	@Column(name = "type")
	private Integer type;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	private Date createdAt;

	public PlayerFriend() {
	}

	public PlayerFriend(Integer id) {
		this.id = id;
	}

	public PlayerFriend(Integer id, Integer playerKey, Integer friendKey,
			Integer type, Date createdAt) {
		this.id = id;
		this.playerKey = playerKey;
		this.friendKey = friendKey;
		this.type = type;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlayerKey() {
		return this.playerKey;
	}

	public void setPlayerKey(Integer playerKey) {
		this.playerKey = playerKey;
	}

	public Integer getFriendKey() {
		return this.friendKey;
	}

	public void setFriendKey(Integer friendKey) {
		this.friendKey = friendKey;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}