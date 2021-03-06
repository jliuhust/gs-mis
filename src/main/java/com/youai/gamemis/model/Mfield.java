package com.youai.gamemis.model;

// Generated 2011-4-2 19:12:15 by Hibernate Tools 3.3.0.GA

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 * Mfield generated by hbm2java
 */
@Entity
@Table(name = "mfield")
public class Mfield implements java.io.Serializable, Cloneable, Comparable<Mfield> {
	
	private String id;
	private String name;
	private String type;
	
	/*
	 * 参数类型为json时，此处存储，处理过的json的值
	 */
	@Transient
	private String fieldRealValues;
	
	/*
	 * 基本只存储json串
	 */
	private String fieldValues;
	private Integer valueUitype;
	private String nickname;
	private String comment;
	private String mentityId;
	private Integer isKey;
	private Integer unmodified;
	private Integer num;
	private String ajaxUrl;
	private String ajaxRelatedInput;
	
	@Transient
	private transient List<OptionValue> optionValues;
	@Transient
	private transient Map<String,String> optionValueMap;
	@Transient
	private String showValue;
	@Transient
	private Object value;
	@Transient
	public String getShowValue() {
		return showValue;
	}
	@Transient
	public void setShowValue(String showValue) {
		this.showValue = showValue;
	}
	@Transient
	public Object getValue(){
		return this.value;
	}
	@Transient
	public void setValue(Object value ){
		this.value = value;
	}
	@Transient
	private String dependField=null;
	
	@Transient
	public String getFieldRealValues() {
		return fieldRealValues;
	}
	@Transient
	public void setFieldRealValues(String fieldRealValues) {
		this.fieldRealValues = fieldRealValues;
	}
	@Column(name="unmodified")
	public Integer getUnmodified() {
		return unmodified;
	}
	public void setUnmodified(Integer unmodified) {
		this.unmodified = unmodified;
	}
	@Column(name = "is_key")
	public Integer getIsKey() {
		return isKey;
	}
	public void setIsKey(Integer isKey) {
		this.isKey = isKey;
	}



	@Column(name = "mentity_id", length = 32)
	public String getMentityId() {
		return mentityId;
	}

	public void setMentityId(String mentityId) {
		this.mentityId = mentityId;
	}

	public Mfield() {
	}

	public Mfield(String id) {
		this.id = id;
	}



	@Id
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@GeneratedValue(generator = "idGenerator")
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "field_values", length = 1024)
	public String getFieldValues() {
		return this.fieldValues;
	}

	public void setFieldValues(String fieldValues) {
		this.fieldValues = fieldValues;
	}

	@Column(name = "value_uitype")
	public Integer getValueUitype() {
		return this.valueUitype;
	}

	public void setValueUitype(Integer valueUitype) {
		this.valueUitype = valueUitype;
	}

	@Column(name = "nickname")
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "comment")
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Column(name = "num")
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	@Transient
	public String getDependField() {
		return dependField;
	}
	
	@Transient
	public void setDependField(String dependField) {
		this.dependField = dependField;
	}
	
	
	@Transient
	public List<OptionValue> getOptionValues() {
		return optionValues;
	}
	@Transient
	public void setOptionValues(List<OptionValue> optionValues) {
		this.optionValues = optionValues;
	}
	
	@Transient
	public Map<String, String> getOptionValueMap() {
		return optionValueMap;
	}
	@Transient
	public void setOptionValueMap(Map<String, String> optionValueMap) {
		this.optionValueMap = optionValueMap;
	}
	
	@Column(name = "ajax_url", length = 1024)
	public String getAjaxUrl() {
		return ajaxUrl;
	}
	public void setAjaxUrl(String ajaxUrl) {
		this.ajaxUrl = ajaxUrl;
	}
	@Column(name = "ajax_related_input", length = 128)
	public String getAjaxRelatedInput() {
		return ajaxRelatedInput;
	}
	public void setAjaxRelatedInput(String ajaxRelatedInput) {
		this.ajaxRelatedInput = ajaxRelatedInput;
	}
	
	public Object clone() {
		Mfield o = null;
		try {
			o = (Mfield) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
	public int compareTo(Mfield arg0) {
		// TODO Auto-generated method stub
		if( num == null ) return 0;
		if( arg0.getNum() == null )return 0;
		return num - arg0.getNum();
	}

}
