package com.bridgelabz.day_11_12;

public class TraderInformation {

	public String time;
	public String operation;
	public String traderName;
	public String companyName;
	public int noOfShare;

	public TraderInformation(String traderName, String operation, String companyName, int noOfShare, String time) {
		this.traderName = traderName;
		this.noOfShare = noOfShare;
		this.companyName = companyName;
		this.operation = operation;
		this.time = time;
	}

	@Override

	public String toString() {
		return "TradeInformation{ " + traderName + "You" + operation + " " + companyName + "s " + noOfShare
				+ "shares at " + time + " }";
	}
}
