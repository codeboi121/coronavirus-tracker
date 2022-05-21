package com.coronavirus.springboot.coronavirustracker.models;


public class LocationStats {
	private String state;
	private String country;
	private int latestTotalCases;

	private int[] weeklyCases=new int[7];

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int[] getWeeklyCases() {
		return weeklyCases;
	}
	public void setWeeklyCases(int[] weeklyCases) {
		this.weeklyCases = weeklyCases;
	}
	
}
