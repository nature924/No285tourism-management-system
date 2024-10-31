package com.entity.vo;

import com.entity.DingpiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订票信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public class DingpiaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点名称
	 */
	
	private String jingdianmingcheng;
		
	/**
	 * 观光日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guanguangriqi;
		
	/**
	 * 个人票价
	 */
	
	private String gerenpiaojia;
		
	/**
	 * 购买票数
	 */
	
	private String goumaipiaoshu;
		
	/**
	 * 总费用
	 */
	
	private String zongfeiyong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 生成订单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchengdingdanshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：景点名称
	 */
	 
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
				
	
	/**
	 * 设置：观光日期
	 */
	 
	public void setGuanguangriqi(Date guanguangriqi) {
		this.guanguangriqi = guanguangriqi;
	}
	
	/**
	 * 获取：观光日期
	 */
	public Date getGuanguangriqi() {
		return guanguangriqi;
	}
				
	
	/**
	 * 设置：个人票价
	 */
	 
	public void setGerenpiaojia(String gerenpiaojia) {
		this.gerenpiaojia = gerenpiaojia;
	}
	
	/**
	 * 获取：个人票价
	 */
	public String getGerenpiaojia() {
		return gerenpiaojia;
	}
				
	
	/**
	 * 设置：购买票数
	 */
	 
	public void setGoumaipiaoshu(String goumaipiaoshu) {
		this.goumaipiaoshu = goumaipiaoshu;
	}
	
	/**
	 * 获取：购买票数
	 */
	public String getGoumaipiaoshu() {
		return goumaipiaoshu;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(String zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public String getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：生成订单时间
	 */
	 
	public void setShengchengdingdanshijian(Date shengchengdingdanshijian) {
		this.shengchengdingdanshijian = shengchengdingdanshijian;
	}
	
	/**
	 * 获取：生成订单时间
	 */
	public Date getShengchengdingdanshijian() {
		return shengchengdingdanshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
