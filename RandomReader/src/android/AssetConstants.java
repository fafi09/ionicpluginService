package com.cfcc.deptone.randomreaderplugin;

public class AssetConstants {
	/**
	 * 盘点状态-已盘点
	 */
	public static final String PANDIAN = "1";

	/**
	 * 盘点状态-未盘点
	 */
	public static final String NO_PANDIAN = "0";

	/**
	 * 盘点状态-初始
	 */
	public static final String INIT_PANDIAN = "0";
	
	public static final String PANDIAN_FLG = "pandian_flg";
	
	public static final int ASSET_RECORD_READING = 0;
	public static final int ASSET_RECORD_READED = 1;
	
	public static final int MAX_PROGRESS = 100;
	
	public static final int LINE_CHARS = /*486*/568;

	public static final int LINE_BYTES_ARRAY = 1024;

	public static final String SEARCHBYBARCODE = "SEARCHBYBARCODE";

	public static final String PANDIAN_FILE_NAME = "pandian.txt";
	public static final String PANDIAN_TMPFILE_NAME = "pandianTmp";
	public static final String PANDIAN_EXPFILE_NAME = "pandianexp.txt";

	public static final String PRODUCT_COLNAME_POS = "POS";
	public static final String PRODUCT_COLNAME_BARCODE = "BARCODE";
	public static final String PRODUCT_COLNAME_PRODUCTNAME = "PRODUCTNAME";
	public static final String PRODUCT_COLNAME_ADDRESS = "ADDRESS";
	public static final String PRODUCT_COLNAME_BUILDAREA = "BUILDAREA";
	public static final String PRODUCT_COLNAME_BRAND = "BRAND";
	public static final String PRODUCT_COLNAME_MODEL = "MODEL";
	public static final String PRODUCT_COLNAME_PASSPORTNO = "PASSPORTNO";
	public static final String PRODUCT_COLNAME_PRODUCTNO = "PRODUCTNO";
	public static final String PRODUCT_COLNAME_SOFTASSETSNAME = "SOFTASSETSNAME";
	public static final String PRODUCT_COLNAME_VERSIONNUM = "VERSIONNUM";
	public static final String PRODUCT_COLNAME_ASSETTYPE = "ASSETTYPE";
	public static final String PRODUCT_COLNAME_PANDIANFLG = "PANDIANFLG";
	public static final String PRODUCT_COLNAME_PANDIANDATE = "PANDIANDATE";
	public static final String PRODUCT_COLNAME_REMARK = "REMARK";

	public static final String CONST_ENCODE = "GBK";

	public static final int EACH_IO_LINES = 1000;

	public static final String PANDIAN_CHINESE = "已盘点";

	public static final String NO_PANDIAN_CHINESE = "未盘点";

	public static final String ASSET_LV_SUMMARY_TV_FORMAT = "%s 共%d件";

	/**
	 * 有数据
	 */
	public static final int DATA_EXIST = 1;

	/**
	 * 无数据
	 */
	public static final int DATA_NO_EXIST = 0;

	/**
	 * 未找到所扫描资产
	 */
	public static final String MSG_NO_FIND_ASSET = "未找到所扫描资产";

	/**
	 * 此资产已被盘点
	 */
	public static final String MSG_ASSET_PANDIAN = "此资产已被盘点";

	/**
	 * 资产记录
	 */
	public static final String ASSET_RECORD = "ASSET_RECORD";

	/**
	 * 资产核对状态按钮
	 */
	public static final String ASSET_CHECK_BTN_STATUS = "ASSET_CHECK_BTN_STATUS";

	/**
	 * 资产核对状态一致按钮
	 */
	public static final String ASSET_CHECK_BTN_CONSIST = "ASSET_CHECK_BTN_CONSIST";

	/**
	 * 资产核对状态不一致按钮
	 */
	public static final String ASSET_CHECK_BTN_NOCONSIST= "ASSET_CHECK_BTN_NOCONSIST";

	/**
	 * 空字符
	 */
	public static final String STR_EMPTY = "";

	/**
	 * 条形码位数
	 */
	public static final int BARCODE_BIT = 16;

	/**
	 * MSG检查条形码位数是否完整
	 */
	public static final String MSG_BARCODE_BIT_VALID = "请检查数据输入是否完整";

	/**
	 * 导入的源文件不存在
	 */
	public static final String MSG_BARCODE_FILE_IMPORT_SRC_NOTEXIST = "导入的源文件不存在";

	/**
	 * 导入的目标文件存在，请先导出再再导入
	 */
	public static final String MSG_BARCODE_FILE_IMPORT_DEST_EXIST = "导入的目标文件存在，请先导出再导入";

	/**
	 * 文件导入成功
	 */
	public static final String MSG_BARCODE_FILE_IMPORT_SUCCESS = "文件导入成功";

	/**
	 * 文件导出成功
	 */
	public static final String MSG_BARCODE_FILE_EXPORT_SUCCESS = "文件导出成功";

	/**
	 * 导出的源文件不存在
	 */
	public static final String MSG_BARCODE_FILE_EXPORT_SRC_NOTEXIST = "没有需要导出的文件";

	/**
	 * 文件清除成功
	 */
	public static final String MSG_BARCODE_FILE_CLEAR_SUCCESS = "文件清除成功";

	/**
	 * 资产类型-房屋及建筑物
	 */
	public static final String ASSET_TYPE_BUILDING = "1";

	/**
	 * 资产类型-电子设备
	 */
	public static final String ASSET_TYPE_ELEC = "2";

	/**
	 * 资产类型-运输工具
	 */
	public static final String ASSET_TYPE_CONVEY = "3";

	/**
	 * 资产类型-机械工具
	 */
	public static final String ASSET_TYPE_MECH = "4";

	/**
	 * 资产类型-其他
	 */
	public static final String ASSET_TYPE_OTHER = "5";

	/**
	 * 资产类型-软件
	 */
	public static final String ASSET_TYPE_SOFT = "6";

	/**
	 * 时间格式
	 */
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * MSG盘点成功
	 */
	public static final String MSG_PANDIAN_SUCCESS = "盘点成功";

	/**
	 * 从盘点列表页面迁移到详细页面的标志
	 */
	public static final String FLG_PANDIAN_DETAIL = "FLG_PANDIAN_DETAIL";

	/**
	 * 从未盘点列表页面迁移到详细页面的标志
	 */
	public static final String FLG_NO_PANDIAN_DETAIL = "FLG_NO_PANDIAN_DETAIL";

	/**
	 * MSG重新盘点成功
	 */
	public static final String MSG_RE_PANDIAN_SUCCESS = "重新盘点成功";

	/**
	 * 备注初始化
	 */
	public static final String INIT_REMAEK = "                                                                                                    ";
}
