package com.country.demo1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="circus")
public class CircusEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cr_id;
	private String cr_name ;
	private String cr_type ;
	public Integer getCr_id() {
		return cr_id;
	}
	public void setCr_id(Integer cr_id) {
		this.cr_id = cr_id;
	}
	public String getCr_name() {
		return cr_name;
	}
	public void setCr_name(String cr_name) {
		this.cr_name = cr_name;
	}
	public String getCr_type() {
		return cr_type;
	}
	public void setCr_type(String cr_type) {
		this.cr_type = cr_type;
	}
	

}
