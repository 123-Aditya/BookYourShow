package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Theatre {
	
	@Id
	@GeneratedValue
	@Column(name = "theatreId")
	private Integer theatreId;
	@Column(name = "theatreName")
	private String theatreName;
	@Column(name = "metroLocation")
	private String metroLocation;
	@Column(name = "district")
	private String district;
	@Column(name = "numberOfShows")
	private Integer numberOfShows;
	@Column(name = "seatingCapacity")
	private Integer seatingCapacity;
	@Column(name = "reservationCapacitRegular")
	private Integer reservationCapacityRegular;
	
	public Theatre() {
		// Constructor
		
	}
	
	/**
	 * @return the theatreId
	 */
	public Integer getTheatreId() {
		return theatreId;
	}
	/**
	 * @param theatreId the theatreId to set
	 */
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	/**
	 * @return the theatreName
	 */
	public String getTheatreName() {
		return theatreName;
	}
	/**
	 * @param theatreName the theatreName to set
	 */
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	/**
	 * @return the metroLocation
	 */
	public String getMetroLocation() {
		return metroLocation;
	}
	/**
	 * @param metroLocation the metroLocation to set
	 */
	public void setMetroLocation(String metroLocation) {
		this.metroLocation = metroLocation;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the numberOfShows
	 */
	public Integer getNumberOfShows() {
		return numberOfShows;
	}
	/**
	 * @param numberOfShows the numberOfShows to set
	 */
	public void setNumberOfShows(Integer numberOfShows) {
		this.numberOfShows = numberOfShows;
	}
	/**
	 * @return the seatingCapacity
	 */
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}
	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	/**
	 * @return the reservationCapacityRegular
	 */
	public Integer getReservationCapacityRegular() {
		return reservationCapacityRegular;
	}
	/**
	 * @param reservationCapacityRegular the reservationCapacityRegular to set
	 */
	public void setReservationCapacityRegular(Integer reservationCapacityRegular) {
		this.reservationCapacityRegular = reservationCapacityRegular;
	}
	
	

}