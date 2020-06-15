package br.com.integratorapi.domain;

import java.io.Serializable;


import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Rota implements Serializable{
		
	private static final long serialVersionUID = 1L;

	//@JsonProperty("lat")
	private String Latitude;
	
	//@JsonProperty("lng")
	private String Longitude;

		
	public Rota() {
	}

	public Rota(String latitude, String longitude) {
		Latitude = latitude;
		Longitude = longitude;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	@Override
	public String toString() {
		return "GeoCoordenada [Latitude=" + Latitude + ", Longitude=" + Longitude + "]";
	}

	
	
}
