package com.cfcc.deptone.randomreaderplugin;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import android.util.Log;

import com.cfcc.deptone.randomreaderplugin.AssetConstants;
import com.cfcc.deptone.randomreaderplugin.Product;
import com.cfcc.deptone.randomreaderplugin.ProductInfo;

public class ProductWrap {
	
	private static final String TAG = ProductWrap.class.getSimpleName();
	
	public static Product getProduct(RandomAccessFile random, String barCode, int pos) {
		Product product = new Product();
		product.setPos(pos);
		
		byte[] byte50 = new byte[50];
		byte[] byte128 = new byte[128];
		byte[] byte18 = new byte[18];
		byte[] byte20 = new byte[20];
		byte[] byte1 = new byte[1];
		byte[] byte19 = new byte[19];
		byte[] byte16 = new byte[16];
		byte[] byte100 = new byte[100];
		byte[] byte30 = new byte[30];

		ProductInfo info = new ProductInfo();
		String tempStr = null;
		
		try {
			if(barCode != null) {
				product.setBarCode(barCode);
			} else {
				//条形码16
				random.read(byte16, 0, info.getBarCodeLen());
				tempStr = new String(byte16, AssetConstants.CONST_ENCODE);
				product.setBarCode(tempStr);
				Log.i(TAG, tempStr);
			}
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//资产名称50
			random.read(byte50, 0, info.getProductNameLen());
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setProductName(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//地址
			random.read(byte128, 0, info.getAddressLen());
			tempStr = new String(byte128,AssetConstants.CONST_ENCODE);
			product.setAddress(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//建筑面积
			random.read(byte18, 0, info.getBuildAreaLen());
			tempStr = new String(byte18,AssetConstants.CONST_ENCODE);
			product.setBuildArea(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//品牌
			random.read(byte50, 0, info.getBrandLen());
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setBrand(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//型号
			random.read(byte50, 0, info.getModelLen());
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setModel(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//车辆牌照号
			random.read(byte20, 0, info.getPassportNoLen());
			tempStr = new String(byte20,AssetConstants.CONST_ENCODE);
			product.setPassportNo(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//出厂产品编号
			random.read(byte20, 0, info.getProductNoLen());
			tempStr = new String(byte20,AssetConstants.CONST_ENCODE);
			product.setProductNo(tempStr);
			Log.i(TAG, tempStr);

			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//软件资产具体名称
			random.read(byte50, 0, info.getSsoftassetsnameLen());
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setSsoftassetsname(tempStr);
			Log.i(TAG, tempStr);

			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//版本号
			random.read(byte30, 0, info.getSversionnumLen());
			tempStr = new String(byte30,AssetConstants.CONST_ENCODE);
			product.setSversionnum(tempStr);
			Log.i(TAG, tempStr);

			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//资产类型
			random.read(byte1, 0, info.getAssetTypeLen());
			tempStr = new String(byte1,AssetConstants.CONST_ENCODE);
			product.setAssetType(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//是否盘点
			random.read(byte1, 0, info.getCheckinStatusLen());
			tempStr = new String(byte1,AssetConstants.CONST_ENCODE);
			product.setCheckinStatus(tempStr);
			Log.i(TAG, tempStr);
			
			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//盘点时间
			random.read(byte19, 0, info.getPandianDateLen());
			tempStr = new String(byte19,AssetConstants.CONST_ENCODE);
			product.setPandianDate(tempStr);
			Log.i(TAG, tempStr);

			random.skipBytes(ProductInfo.SPLIT_MARK_LEN);
			//备注
			random.read(byte100, 0, info.getRemarksLen());
			tempStr = new String(byte100,AssetConstants.CONST_ENCODE);
			product.setRemarks(tempStr);
			Log.i(TAG, tempStr);
		} catch (IOException e) {
			Log.e(TAG,e.getMessage());
			//com.orhanobut.logger.Logger.e(e.getMessage());
		}
		return product;
	}
	
	
	@Deprecated
	public static Product getProduct(String content, int pos) {
		
		Product product = new Product();
		product.setPos(pos);
		String tempStr = null;
		
		tempStr = content.substring(0, 16);
		product.setBarCode(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(16, 66);
		product.setProductName(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr =content.substring(66, 194);
		product.setAddress(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(194, 212);
		product.setBuildArea(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(212, 262);
		product.setBrand(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(262, 312);
		product.setModel(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr =  content.substring(312, 332);
		product.setPassportNo(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr =content.substring(332, 352);
		product.setProductNo(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(352, 353);
		product.setAssetType(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(353, 354);
		product.setCheckinStatus(tempStr);
		Log.i(TAG, tempStr);
		
		tempStr = content.substring(354, 373);
		product.setPandianDate(tempStr);
		Log.i(TAG, tempStr);
		
		return product;
		
	}

	@Deprecated
	public static Product getProduct(BufferedInputStream bis, int pos) {
		Product product = new Product();
		//product.setBarCode(barCode);
		product.setPos(pos);
		
		byte[] byte16 = new byte[16];
		byte[] byte50 = new byte[50];
		byte[] byte128 = new byte[128];
		byte[] byte18 = new byte[18];
		byte[] byte20 = new byte[20];
		byte[] byte1 = new byte[1];
		byte[] byte19 = new byte[19];
		byte[] byte100 = new byte[100];
		String tempStr = null;
		
		try {
			bis.read(byte16, 0, 16);
			tempStr = new String(byte16,AssetConstants.CONST_ENCODE);
			product.setBarCode(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte50, 0, 50);
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setProductName(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte128, 0, 128);
			tempStr = new String(byte128,AssetConstants.CONST_ENCODE);
			product.setAddress(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte18, 0, 18);
			tempStr = new String(byte18,AssetConstants.CONST_ENCODE);
			product.setBuildArea(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte50, 0, 50);
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setBrand(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte50, 0, 50);
			tempStr = new String(byte50,AssetConstants.CONST_ENCODE);
			product.setModel(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte20, 0, 20);
			tempStr = new String(byte20,AssetConstants.CONST_ENCODE);
			product.setPassportNo(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte20, 0, 20);
			tempStr = new String(byte20,AssetConstants.CONST_ENCODE);
			product.setProductNo(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte1, 0, 1);
			tempStr = new String(byte1,AssetConstants.CONST_ENCODE);
			product.setAssetType(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte1, 0, 1);
			tempStr = new String(byte1,AssetConstants.CONST_ENCODE);
			product.setCheckinStatus(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte19, 0, 19);
			tempStr = new String(byte19,AssetConstants.CONST_ENCODE);
			product.setPandianDate(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			bis.skip(1);
			bis.read(byte100, 0, 100);
			tempStr = new String(byte100,AssetConstants.CONST_ENCODE);
			product.setRemarks(tempStr);
			//System.out.println(tempStr.length()+":"+tempStr);
			
			//过滤掉回车换行
			bis.skip(2);
		} catch (IOException e) {
			Log.e(TAG,e.getMessage());
			//com.orhanobut.logger.Logger.e(e.getMessage());
		}
		return product;
	}


	public static Product getProduct(byte[] content, int pos) throws UnsupportedEncodingException {
		Product product = new Product();
		product.setPos(pos);

		ProductInfo info = new ProductInfo();

		String tempStr = null;
		try {
			//条形码16
			tempStr = new String(
					Arrays.copyOfRange(content, info.getBarCodeBegin(), info.getBarCodeEnd()),
					AssetConstants.CONST_ENCODE);
			product.setBarCode(tempStr);

			//资产名称50
			tempStr = new String(
					Arrays.copyOfRange(content, info.getProductNameBegin(), info.getProductNameEnd())
					,AssetConstants.CONST_ENCODE);
			product.setProductName(tempStr);

			/*//地址128
			tempStr = new String(
					Arrays.copyOfRange(content, 68, 196)
					,AssetConstants.CONST_ENCODE);
			product.setAddress(tempStr);

			//建筑面积18
			tempStr = new String(
					Arrays.copyOfRange(content, 197, 215)
					,AssetConstants.CONST_ENCODE);
			product.setBuildArea(tempStr);

			//品牌50
			tempStr = new String(
					Arrays.copyOfRange(content, 216, 266)
					,AssetConstants.CONST_ENCODE);
			product.setBrand(tempStr);

			//型号50
			tempStr = new String(
					Arrays.copyOfRange(content, 267, 317)
					,AssetConstants.CONST_ENCODE);
			product.setModel(tempStr);

			//车辆牌照号20
			tempStr = new String(
					Arrays.copyOfRange(content, 318, 338)
					,AssetConstants.CONST_ENCODE);
			product.setPassportNo(tempStr);

			//出厂产品编号20
			tempStr = new String(
					Arrays.copyOfRange(content, 339, 359)
					,AssetConstants.CONST_ENCODE);
			product.setProductNo(tempStr);

			//资产类型1
			tempStr = new String(
					Arrays.copyOfRange(content, 360, 361)
					,AssetConstants.CONST_ENCODE);
			product.setAssetType(tempStr);*/

			//资产盘点状态1
			tempStr = new String(
					Arrays.copyOfRange(content, info.getCheckinStatusBegin(), info.getCheckinStatusEnd())
					,AssetConstants.CONST_ENCODE);
			product.setCheckinStatus(tempStr);

			//盘点时间19
			tempStr = new String(
					Arrays.copyOfRange(content, info.getPandianDateBegin(), info.getPandianDateEnd())
					,AssetConstants.CONST_ENCODE);
			product.setPandianDate(tempStr);

			/*//备注100
			tempStr = new String(
					Arrays.copyOfRange(content, 384, 484)
					,AssetConstants.CONST_ENCODE);
			product.setRemarks(tempStr);*/

		} catch (UnsupportedEncodingException e) {
			throw e;
		}

		return product;
	}

	@Deprecated
	public static List getProducts(byte[] content, int basePos, int lines, String pandianFlg)
			throws UnsupportedEncodingException {
		List products = new ArrayList();
		try {
			for(int i = 0; i < lines; i++) {
				Product product = new Product();
				product.setPos(basePos+i);

				int baseLine = AssetConstants.LINE_CHARS * i ;

				String tempStr = null;
				//条形码16
				tempStr = new String(
						Arrays.copyOfRange(content,baseLine + 0, baseLine + 16),
						AssetConstants.CONST_ENCODE);
				product.setBarCode(tempStr);

				//资产名称50
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 17, baseLine + 67)
						, AssetConstants.CONST_ENCODE);
				product.setProductName(tempStr);

				//地址128
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 68, baseLine + 196)
						, AssetConstants.CONST_ENCODE);
				product.setAddress(tempStr);

				//建筑面积18
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 197, baseLine + 215)
						, AssetConstants.CONST_ENCODE);
				product.setBuildArea(tempStr);

				//品牌50
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 216, baseLine + 266)
						, AssetConstants.CONST_ENCODE);
				product.setBrand(tempStr);

				//型号50
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 267, baseLine + 317)
						, AssetConstants.CONST_ENCODE);
				product.setModel(tempStr);

				//车辆牌照号20
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 318, baseLine + 338)
						, AssetConstants.CONST_ENCODE);
				product.setPassportNo(tempStr);

				//出厂产品编号20
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 339, baseLine + 359)
						, AssetConstants.CONST_ENCODE);
				product.setProductNo(tempStr);

				//资产类型1
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 360, baseLine + 361)
						, AssetConstants.CONST_ENCODE);
				product.setAssetType(tempStr);

				//资产盘点状态1
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 362, baseLine + 363)
						, AssetConstants.CONST_ENCODE);
				product.setCheckinStatus(tempStr);

				//盘点时间19
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 364, baseLine + 383)
						, AssetConstants.CONST_ENCODE);
				product.setPandianDate(tempStr);

				//备注100
				tempStr = new String(
						Arrays.copyOfRange(content, baseLine + 384, baseLine + 484)
						, AssetConstants.CONST_ENCODE);
				product.setRemarks(tempStr);

				if(pandianFlg.equals(product.getCheckinStatus())) {
					products.add(product);
				}
			}
		} catch (UnsupportedEncodingException e) {
			throw e;
		}

		return products;
	}
}
