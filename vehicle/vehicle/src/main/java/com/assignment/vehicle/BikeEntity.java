package com.assignment.vehicle;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BIKE")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bike_id;
	private String bike_name;
	private Integer no_of_tyres;
	public Integer getBike_id() {
		return bike_id;
	}
	public void setBike_id(Integer bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public Integer getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(Integer no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	
	 

}
