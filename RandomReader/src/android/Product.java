package com.cfcc.deptone.randomreaderplugin;

public class Product {

	private int pos;
	
	private String productType;
	
	private String barCode;
	
	private String productName;
	
	private String address;
	
	private String buildArea;
	
	private String brand;
	
	private String model;
	
	private String passportNo;

	private String productNo;

	private String ssoftassetsname;

	private String sversionnum;

	private String checkinStatus;
	
	private String assetType;
	
	private String pandianDate;

	private String remarks;

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks() {

		return remarks;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getPandianDate() {
		return pandianDate;
	}

	public void setPandianDate(String pandianDate) {
		this.pandianDate = pandianDate;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public void setCheckinStatus(String checkinStatus) {
		this.checkinStatus = checkinStatus;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getCheckinStatus() {
		return checkinStatus;
	}

	public String getAssetType() {
		return assetType;
	}

	public String getSsoftassetsname() {
		return ssoftassetsname;
	}

	public void setSsoftassetsname(String ssoftassetsname) {
		this.ssoftassetsname = ssoftassetsname;
	}

	public String getSversionnum() {
		return sversionnum;
	}

	public void setSversionnum(String sversionnum) {
		this.sversionnum = sversionnum;
	}

	@Override
	public String toString() {
		return "Product{" +
				"pos=" + pos +
				", productType='" + productType + '\'' +
				", barCode='" + barCode + '\'' +
				", productName='" + productName + '\'' +
				", address='" + address + '\'' +
				", buildArea='" + buildArea + '\'' +
				", brand='" + brand + '\'' +
				", model='" + model + '\'' +
				", passportNo='" + passportNo + '\'' +
				", productNo='" + productNo + '\'' +
				", ssoftassetsname='" + ssoftassetsname + '\'' +
				", sversionnum='" + sversionnum + '\'' +
				", checkinStatus='" + checkinStatus + '\'' +
				", assetType='" + assetType + '\'' +
				", pandianDate='" + pandianDate + '\'' +
				", remarks='" + remarks + '\'' +
				'}';
	}
}
