package com.offcn.pojo;

import java.util.Date;


public class Egg {
	  private int id;
	  private String eggName;
	  private double eggMin;
	  private double eggMean;
	  private double eggMax;
	  private Date eggData;
	
	  
	  
	  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEggName() {
		return eggName;
	}
	public void setEggName(String eggName) {
		this.eggName = eggName;
	}
	public double getEggMin() {
		return eggMin;
	}
	public void setEggMin(double eggMin) {
		this.eggMin = eggMin;
	}
	public double getEggMean() {
		return eggMean;
	}
	public void setEggMean(double eggMean) {
		this.eggMean = eggMean;
	}
	public double getEggMax() {
		return eggMax;
	}
	public void setEggMax(double eggMax) {
		this.eggMax = eggMax;
	}
	public Date getEggData() {
		return eggData;
	}
	public void setEggData(Date eggData) {
		this.eggData = eggData;
	}
	@Override
	public String toString() {
		return "Egg [id=" + id + ", eggName=" + eggName + ", eggMin=" + eggMin + ", eggMean=" + eggMean + ", eggMax="
				+ eggMax + ", eggData=" + eggData + "]";
	}
	  
	  
}
