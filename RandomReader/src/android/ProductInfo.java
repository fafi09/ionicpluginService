package com.cfcc.deptone.randomreaderplugin;

public class ProductInfo {
	
	public static final int SPLIT_MARK_LEN = 1;
	public static final int END_MARK_LEN = 2;

	//条形码
	private int barCodeBegin;
	private int barCodeLen;
	private int barCodeEnd;

	//资产名称
	private int productNameBegin;
	private int productNameLen;
	private int productNameEnd;

	//地址
	private int addressBegin;
	private int addressLen;
	private int addressEnd;

	//建筑面积
	private int buildAreaBegin;
	private int buildAreaLen;
	private int buildAreaEnd;

	//品牌
	private int brandBegin;
	private int brandLen;
	private int brandEnd;

	//型号
	private int modelBegin;
	private int modelLen;
	private int modelEnd;

	//车辆牌照号
	private int passportNoBegin;
	private int passportNoLen;
	private int passportNoEnd;

	//出厂产品编号
	private int productNoBegin;
	private int productNoLen;
	private int productNoEnd;

	//软件资产具体名称
	private int ssoftassetsnameBegin;
	private int ssoftassetsnameLen;
	private int ssoftassetsnameEnd;

	//版本号
	private int sversionnumBegin;
	private int sversionnumLen;
	private int sversionnumEnd;

	//资产类型
	private int assetTypeBegin;
	private int assetTypeLen;
	private int assetTypeEnd;

	//是否盘点
	private int checkinStatusBegin;
	private int checkinStatusLen;
	private int checkinStatusEnd;

	//盘点时间
	private int pandianDateBegin;
	private int pandianDateLen;
	private int pandianDateEnd;

	//备注
	private int remarksBegin;
	private int remarksLen;
	private int remarksEnd;
	
	public ProductInfo() {
		barCodeLen = 16;
		productNameLen = 50;
		addressLen = 128;
		buildAreaLen = 18;
		brandLen = 50;
		modelLen = 50;
		passportNoLen = 20;
		productNoLen = 20;
		ssoftassetsnameLen = 50;
		sversionnumLen = 30;
		assetTypeLen = 1;
		checkinStatusLen = 1;
		pandianDateLen = 19;
		remarksLen = 100;
		
		barCodeBegin = 0;
		barCodeEnd = barCodeBegin + barCodeLen;
		
		productNameBegin = barCodeEnd + SPLIT_MARK_LEN;
		productNameEnd = productNameBegin + productNameLen;

		addressBegin = productNameEnd + SPLIT_MARK_LEN;
		addressEnd = addressBegin + addressLen;

		buildAreaBegin = addressEnd + SPLIT_MARK_LEN;
		buildAreaEnd = buildAreaBegin + buildAreaLen;

		brandBegin = buildAreaEnd + SPLIT_MARK_LEN;
		brandEnd = brandBegin + brandLen;

		modelBegin=brandEnd + SPLIT_MARK_LEN;;
		modelEnd = modelBegin + modelLen;

		passportNoBegin=modelEnd + SPLIT_MARK_LEN;;
		passportNoEnd = passportNoBegin + passportNoLen;

		productNoBegin=passportNoEnd + SPLIT_MARK_LEN;
		productNoEnd = productNoBegin + productNoLen ;

		ssoftassetsnameBegin = productNoEnd + SPLIT_MARK_LEN;
		ssoftassetsnameEnd = ssoftassetsnameBegin + ssoftassetsnameLen;

		sversionnumBegin = ssoftassetsnameEnd + SPLIT_MARK_LEN;
		sversionnumEnd = sversionnumBegin + sversionnumLen;

		assetTypeBegin=sversionnumEnd + SPLIT_MARK_LEN;;
		assetTypeEnd = assetTypeBegin + assetTypeLen;

		checkinStatusBegin=assetTypeEnd + SPLIT_MARK_LEN;;
		checkinStatusEnd = checkinStatusBegin + checkinStatusLen;

		pandianDateBegin=checkinStatusEnd + SPLIT_MARK_LEN;;
		pandianDateEnd = pandianDateBegin + pandianDateLen;

		remarksBegin=pandianDateEnd + SPLIT_MARK_LEN;;
		remarksEnd = remarksBegin + remarksLen;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressBegin;
		result = prime * result + addressEnd;
		result = prime * result + addressLen;
		result = prime * result + assetTypeBegin;
		result = prime * result + assetTypeEnd;
		result = prime * result + assetTypeLen;
		result = prime * result + barCodeBegin;
		result = prime * result + barCodeEnd;
		result = prime * result + barCodeLen;
		result = prime * result + brandBegin;
		result = prime * result + brandEnd;
		result = prime * result + brandLen;
		result = prime * result + buildAreaBegin;
		result = prime * result + buildAreaEnd;
		result = prime * result + buildAreaLen;
		result = prime * result + checkinStatusBegin;
		result = prime * result + checkinStatusEnd;
		result = prime * result + checkinStatusLen;
		result = prime * result + modelBegin;
		result = prime * result + modelEnd;
		result = prime * result + modelLen;
		result = prime * result + pandianDateBegin;
		result = prime * result + pandianDateEnd;
		result = prime * result + pandianDateLen;
		result = prime * result + passportNoBegin;
		result = prime * result + passportNoEnd;
		result = prime * result + passportNoLen;
		result = prime * result + productNameBegin;
		result = prime * result + productNameEnd;
		result = prime * result + productNameLen;
		result = prime * result + productNoBegin;
		result = prime * result + productNoEnd;
		result = prime * result + productNoLen;
		result = prime * result + remarksBegin;
		result = prime * result + remarksEnd;
		result = prime * result + remarksLen;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductInfo other = (ProductInfo) obj;
		if (addressBegin != other.addressBegin)
			return false;
		if (addressEnd != other.addressEnd)
			return false;
		if (addressLen != other.addressLen)
			return false;
		if (assetTypeBegin != other.assetTypeBegin)
			return false;
		if (assetTypeEnd != other.assetTypeEnd)
			return false;
		if (assetTypeLen != other.assetTypeLen)
			return false;
		if (barCodeBegin != other.barCodeBegin)
			return false;
		if (barCodeEnd != other.barCodeEnd)
			return false;
		if (barCodeLen != other.barCodeLen)
			return false;
		if (brandBegin != other.brandBegin)
			return false;
		if (brandEnd != other.brandEnd)
			return false;
		if (brandLen != other.brandLen)
			return false;
		if (buildAreaBegin != other.buildAreaBegin)
			return false;
		if (buildAreaEnd != other.buildAreaEnd)
			return false;
		if (buildAreaLen != other.buildAreaLen)
			return false;
		if (checkinStatusBegin != other.checkinStatusBegin)
			return false;
		if (checkinStatusEnd != other.checkinStatusEnd)
			return false;
		if (checkinStatusLen != other.checkinStatusLen)
			return false;
		if (modelBegin != other.modelBegin)
			return false;
		if (modelEnd != other.modelEnd)
			return false;
		if (modelLen != other.modelLen)
			return false;
		if (pandianDateBegin != other.pandianDateBegin)
			return false;
		if (pandianDateEnd != other.pandianDateEnd)
			return false;
		if (pandianDateLen != other.pandianDateLen)
			return false;
		if (passportNoBegin != other.passportNoBegin)
			return false;
		if (passportNoEnd != other.passportNoEnd)
			return false;
		if (passportNoLen != other.passportNoLen)
			return false;
		if (productNameBegin != other.productNameBegin)
			return false;
		if (productNameEnd != other.productNameEnd)
			return false;
		if (productNameLen != other.productNameLen)
			return false;
		if (productNoBegin != other.productNoBegin)
			return false;
		if (productNoEnd != other.productNoEnd)
			return false;
		if (productNoLen != other.productNoLen)
			return false;
		if (remarksBegin != other.remarksBegin)
			return false;
		if (remarksEnd != other.remarksEnd)
			return false;
		if (remarksLen != other.remarksLen)
			return false;
		return true;
	}

	public String toBeginEndPos() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductInfo [barCodeBegin=");
		builder.append(barCodeBegin);
		builder.append(", barCodeEnd=");
		builder.append(barCodeEnd);
		builder.append(", productNameBegin=");
		builder.append(productNameBegin);
		builder.append(", productNameEnd=");
		builder.append(productNameEnd);
		builder.append(", addressBegin=");
		builder.append(addressBegin);
		builder.append(", addressEnd=");
		builder.append(addressEnd);
		builder.append(", buildAreaBegin=");
		builder.append(buildAreaBegin);
		builder.append(", buildAreaEnd=");
		builder.append(buildAreaEnd);
		builder.append(", brandBegin=");
		builder.append(brandBegin);
		builder.append(", brandEnd=");
		builder.append(brandEnd);
		builder.append(", modelBegin=");
		builder.append(modelBegin);
		builder.append(", modelEnd=");
		builder.append(modelEnd);
		builder.append(", passportNoBegin=");
		builder.append(passportNoBegin);
		builder.append(", passportNoEnd=");
		builder.append(passportNoEnd);
		builder.append(", productNoBegin=");
		builder.append(productNoBegin);
		builder.append(", productNoEnd=");
		builder.append(productNoEnd);
		builder.append(", assetTypeBegin=");
		builder.append(assetTypeBegin);
		builder.append(", assetTypeEnd=");
		builder.append(assetTypeEnd);
		builder.append(", checkinStatusBegin=");
		builder.append(checkinStatusBegin);
		builder.append(", checkinStatusEnd=");
		builder.append(checkinStatusEnd);
		builder.append(", pandianDateBegin=");
		builder.append(pandianDateBegin);
		builder.append(", pandianDateEnd=");
		builder.append(pandianDateEnd);
		builder.append(", remarksBegin=");
		builder.append(remarksBegin);
		builder.append(", remarksEnd=");
		builder.append(remarksEnd);
		builder.append("]");
		return builder.toString();
	}

	public String toLen() {
		return String
				.format("ProductInfo [barCodeLen=%s, productNameLen=%s, addressLen=%s, buildAreaLen=%s, brandLen=%s, modelLen=%s, passportNoLen=%s, productNoLen=%s, assetTypeLen=%s, checkinStatusLen=%s, pandianDateLen=%s, remarksLen=%s]",
						barCodeLen, productNameLen, addressLen, buildAreaLen,
						brandLen, modelLen, passportNoLen, productNoLen,
						assetTypeLen, checkinStatusLen, pandianDateLen,
						remarksLen);
	}


	public int getBarCodeBegin() {
		return barCodeBegin;
	}

	public void setBarCodeBegin(int barCodeBegin) {
		this.barCodeBegin = barCodeBegin;
	}

	public int getBarCodeLen() {
		return barCodeLen;
	}

	public void setBarCodeLen(int barCodeLen) {
		this.barCodeLen = barCodeLen;
	}

	public int getBarCodeEnd() {
		return barCodeEnd;
	}

	public void setBarCodeEnd(int barCodeEnd) {
		this.barCodeEnd = barCodeEnd;
	}

	public int getProductNameBegin() {
		return productNameBegin;
	}

	public void setProductNameBegin(int productNameBegin) {
		this.productNameBegin = productNameBegin;
	}

	public int getProductNameLen() {
		return productNameLen;
	}

	public void setProductNameLen(int productNameLen) {
		this.productNameLen = productNameLen;
	}

	public int getProductNameEnd() {
		return productNameEnd;
	}

	public void setProductNameEnd(int productNameEnd) {
		this.productNameEnd = productNameEnd;
	}

	public int getAddressBegin() {
		return addressBegin;
	}

	public void setAddressBegin(int addressBegin) {
		this.addressBegin = addressBegin;
	}

	public int getAddressLen() {
		return addressLen;
	}

	public void setAddressLen(int addressLen) {
		this.addressLen = addressLen;
	}

	public int getAddressEnd() {
		return addressEnd;
	}

	public void setAddressEnd(int addressEnd) {
		this.addressEnd = addressEnd;
	}

	public int getBuildAreaBegin() {
		return buildAreaBegin;
	}

	public void setBuildAreaBegin(int buildAreaBegin) {
		this.buildAreaBegin = buildAreaBegin;
	}

	public int getBuildAreaLen() {
		return buildAreaLen;
	}

	public void setBuildAreaLen(int buildAreaLen) {
		this.buildAreaLen = buildAreaLen;
	}

	public int getBuildAreaEnd() {
		return buildAreaEnd;
	}

	public void setBuildAreaEnd(int buildAreaEnd) {
		this.buildAreaEnd = buildAreaEnd;
	}

	public int getBrandBegin() {
		return brandBegin;
	}

	public void setBrandBegin(int brandBegin) {
		this.brandBegin = brandBegin;
	}

	public int getBrandLen() {
		return brandLen;
	}

	public void setBrandLen(int brandLen) {
		this.brandLen = brandLen;
	}

	public int getBrandEnd() {
		return brandEnd;
	}

	public void setBrandEnd(int brandEnd) {
		this.brandEnd = brandEnd;
	}

	public int getModelBegin() {
		return modelBegin;
	}

	public void setModelBegin(int modelBegin) {
		this.modelBegin = modelBegin;
	}

	public int getModelLen() {
		return modelLen;
	}

	public void setModelLen(int modelLen) {
		this.modelLen = modelLen;
	}

	public int getModelEnd() {
		return modelEnd;
	}

	public void setModelEnd(int modelEnd) {
		this.modelEnd = modelEnd;
	}

	public int getPassportNoBegin() {
		return passportNoBegin;
	}

	public void setPassportNoBegin(int passportNoBegin) {
		this.passportNoBegin = passportNoBegin;
	}

	public int getPassportNoLen() {
		return passportNoLen;
	}

	public void setPassportNoLen(int passportNoLen) {
		this.passportNoLen = passportNoLen;
	}

	public int getPassportNoEnd() {
		return passportNoEnd;
	}

	public void setPassportNoEnd(int passportNoEnd) {
		this.passportNoEnd = passportNoEnd;
	}

	public int getProductNoBegin() {
		return productNoBegin;
	}

	public void setProductNoBegin(int productNoBegin) {
		this.productNoBegin = productNoBegin;
	}

	public int getProductNoLen() {
		return productNoLen;
	}

	public void setProductNoLen(int productNoLen) {
		this.productNoLen = productNoLen;
	}

	public int getProductNoEnd() {
		return productNoEnd;
	}

	public void setProductNoEnd(int productNoEnd) {
		this.productNoEnd = productNoEnd;
	}

	public int getAssetTypeBegin() {
		return assetTypeBegin;
	}

	public void setAssetTypeBegin(int assetTypeBegin) {
		this.assetTypeBegin = assetTypeBegin;
	}

	public int getAssetTypeLen() {
		return assetTypeLen;
	}

	public void setAssetTypeLen(int assetTypeLen) {
		this.assetTypeLen = assetTypeLen;
	}

	public int getAssetTypeEnd() {
		return assetTypeEnd;
	}

	public void setAssetTypeEnd(int assetTypeEnd) {
		this.assetTypeEnd = assetTypeEnd;
	}

	public int getCheckinStatusBegin() {
		return checkinStatusBegin;
	}

	public void setCheckinStatusBegin(int checkinStatusBegin) {
		this.checkinStatusBegin = checkinStatusBegin;
	}

	public int getCheckinStatusLen() {
		return checkinStatusLen;
	}

	public void setCheckinStatusLen(int checkinStatusLen) {
		this.checkinStatusLen = checkinStatusLen;
	}

	public int getCheckinStatusEnd() {
		return checkinStatusEnd;
	}

	public void setCheckinStatusEnd(int checkinStatusEnd) {
		this.checkinStatusEnd = checkinStatusEnd;
	}

	public int getPandianDateBegin() {
		return pandianDateBegin;
	}

	public void setPandianDateBegin(int pandianDateBegin) {
		this.pandianDateBegin = pandianDateBegin;
	}

	public int getPandianDateLen() {
		return pandianDateLen;
	}

	public void setPandianDateLen(int pandianDateLen) {
		this.pandianDateLen = pandianDateLen;
	}

	public int getPandianDateEnd() {
		return pandianDateEnd;
	}

	public void setPandianDateEnd(int pandianDateEnd) {
		this.pandianDateEnd = pandianDateEnd;
	}

	public int getRemarksBegin() {
		return remarksBegin;
	}

	public void setRemarksBegin(int remarksBegin) {
		this.remarksBegin = remarksBegin;
	}

	public int getRemarksLen() {
		return remarksLen;
	}

	public void setRemarksLen(int remarksLen) {
		this.remarksLen = remarksLen;
	}

	public int getRemarksEnd() {
		return remarksEnd;
	}

	public void setRemarksEnd(int remarksEnd) {
		this.remarksEnd = remarksEnd;
	}

	public int getSsoftassetsnameBegin() {
		return ssoftassetsnameBegin;
	}

	public void setSsoftassetsnameBegin(int ssoftassetsnameBegin) {
		this.ssoftassetsnameBegin = ssoftassetsnameBegin;
	}

	public int getSsoftassetsnameLen() {
		return ssoftassetsnameLen;
	}

	public void setSsoftassetsnameLen(int ssoftassetsnameLen) {
		this.ssoftassetsnameLen = ssoftassetsnameLen;
	}

	public int getSsoftassetsnameEnd() {
		return ssoftassetsnameEnd;
	}

	public void setSsoftassetsnameEnd(int ssoftassetsnameEnd) {
		this.ssoftassetsnameEnd = ssoftassetsnameEnd;
	}

	public int getSversionnumBegin() {
		return sversionnumBegin;
	}

	public void setSversionnumBegin(int sversionnumBegin) {
		this.sversionnumBegin = sversionnumBegin;
	}

	public int getSversionnumLen() {
		return sversionnumLen;
	}

	public void setSversionnumLen(int sversionnumLen) {
		this.sversionnumLen = sversionnumLen;
	}

	public int getSversionnumEnd() {
		return sversionnumEnd;
	}

	public void setSversionnumEnd(int sversionnumEnd) {
		this.sversionnumEnd = sversionnumEnd;
	}

	public static void main(String[] args) {
		ProductInfo info = new ProductInfo();
		System.out.println(info.toBeginEndPos());
	}
	
}
