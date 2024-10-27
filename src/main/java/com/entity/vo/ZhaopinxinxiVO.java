package com.entity.vo;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 招聘信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-28 08:43:10
 */
public class ZhaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位类型
	 */
	
	private String gangweileixing;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 学历要求
	 */
	
	private String xueliyaoqiu;
		
	/**
	 * 办公环境
	 */
	
	private String bangonghuanjing;
		
	/**
	 * 岗位性质
	 */
	
	private String gangweixingzhi;
		
	/**
	 * 薪资待遇
	 */
	
	private String xinzidaiyu;
		
	/**
	 * 工作经验
	 */
	
	private String gongzuojingyan;
		
	/**
	 * 工作时间
	 */
	
	private String gongzuoshijian;
		
	/**
	 * 就业城市
	 */
	
	private String jiuyechengshi;
		
	/**
	 * 上班地点
	 */
	
	private String shangbandidian;
		
	/**
	 * 企业编号
	 */
	
	private String qiyebianhao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 岗位介绍
	 */
	
	private String gangweijieshao;
				
	
	/**
	 * 设置：岗位类型
	 */
	 
	public void setGangweileixing(String gangweileixing) {
		this.gangweileixing = gangweileixing;
	}
	
	/**
	 * 获取：岗位类型
	 */
	public String getGangweileixing() {
		return gangweileixing;
	}
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：学历要求
	 */
	 
	public void setXueliyaoqiu(String xueliyaoqiu) {
		this.xueliyaoqiu = xueliyaoqiu;
	}
	
	/**
	 * 获取：学历要求
	 */
	public String getXueliyaoqiu() {
		return xueliyaoqiu;
	}
				
	
	/**
	 * 设置：办公环境
	 */
	 
	public void setBangonghuanjing(String bangonghuanjing) {
		this.bangonghuanjing = bangonghuanjing;
	}
	
	/**
	 * 获取：办公环境
	 */
	public String getBangonghuanjing() {
		return bangonghuanjing;
	}
				
	
	/**
	 * 设置：岗位性质
	 */
	 
	public void setGangweixingzhi(String gangweixingzhi) {
		this.gangweixingzhi = gangweixingzhi;
	}
	
	/**
	 * 获取：岗位性质
	 */
	public String getGangweixingzhi() {
		return gangweixingzhi;
	}
				
	
	/**
	 * 设置：薪资待遇
	 */
	 
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：薪资待遇
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：工作经验
	 */
	 
	public void setGongzuojingyan(String gongzuojingyan) {
		this.gongzuojingyan = gongzuojingyan;
	}
	
	/**
	 * 获取：工作经验
	 */
	public String getGongzuojingyan() {
		return gongzuojingyan;
	}
				
	
	/**
	 * 设置：工作时间
	 */
	 
	public void setGongzuoshijian(String gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	
	/**
	 * 获取：工作时间
	 */
	public String getGongzuoshijian() {
		return gongzuoshijian;
	}
				
	
	/**
	 * 设置：就业城市
	 */
	 
	public void setJiuyechengshi(String jiuyechengshi) {
		this.jiuyechengshi = jiuyechengshi;
	}
	
	/**
	 * 获取：就业城市
	 */
	public String getJiuyechengshi() {
		return jiuyechengshi;
	}
				
	
	/**
	 * 设置：上班地点
	 */
	 
	public void setShangbandidian(String shangbandidian) {
		this.shangbandidian = shangbandidian;
	}
	
	/**
	 * 获取：上班地点
	 */
	public String getShangbandidian() {
		return shangbandidian;
	}
				
	
	/**
	 * 设置：企业编号
	 */
	 
	public void setQiyebianhao(String qiyebianhao) {
		this.qiyebianhao = qiyebianhao;
	}
	
	/**
	 * 获取：企业编号
	 */
	public String getQiyebianhao() {
		return qiyebianhao;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：岗位介绍
	 */
	 
	public void setGangweijieshao(String gangweijieshao) {
		this.gangweijieshao = gangweijieshao;
	}
	
	/**
	 * 获取：岗位介绍
	 */
	public String getGangweijieshao() {
		return gangweijieshao;
	}
			
}
