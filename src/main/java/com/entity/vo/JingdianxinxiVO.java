package com.entity.vo;

import com.entity.JingdianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 景点信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
public class JingdianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点特色
	 */
	
	private String jingdiantese;
		
	/**
	 * 服务保障
	 */
	
	private String fuwubaozhang;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 个人票价
	 */
	
	private Integer gerenpiaojia;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
		
	/**
	 * 旅游路线
	 */
	
	private String lvyouluxian;
		
	/**
	 * 预订须知
	 */
	
	private String yudingxuzhi;
		
	/**
	 * 如何预订
	 */
	
	private String ruheyuding;
		
	/**
	 * 景点图片
	 */
	
	private String jingdiantupian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：景点特色
	 */
	 
	public void setJingdiantese(String jingdiantese) {
		this.jingdiantese = jingdiantese;
	}
	
	/**
	 * 获取：景点特色
	 */
	public String getJingdiantese() {
		return jingdiantese;
	}
				
	
	/**
	 * 设置：服务保障
	 */
	 
	public void setFuwubaozhang(String fuwubaozhang) {
		this.fuwubaozhang = fuwubaozhang;
	}
	
	/**
	 * 获取：服务保障
	 */
	public String getFuwubaozhang() {
		return fuwubaozhang;
	}
				
	
	/**
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：个人票价
	 */
	 
	public void setGerenpiaojia(Integer gerenpiaojia) {
		this.gerenpiaojia = gerenpiaojia;
	}
	
	/**
	 * 获取：个人票价
	 */
	public Integer getGerenpiaojia() {
		return gerenpiaojia;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
				
	
	/**
	 * 设置：旅游路线
	 */
	 
	public void setLvyouluxian(String lvyouluxian) {
		this.lvyouluxian = lvyouluxian;
	}
	
	/**
	 * 获取：旅游路线
	 */
	public String getLvyouluxian() {
		return lvyouluxian;
	}
				
	
	/**
	 * 设置：预订须知
	 */
	 
	public void setYudingxuzhi(String yudingxuzhi) {
		this.yudingxuzhi = yudingxuzhi;
	}
	
	/**
	 * 获取：预订须知
	 */
	public String getYudingxuzhi() {
		return yudingxuzhi;
	}
				
	
	/**
	 * 设置：如何预订
	 */
	 
	public void setRuheyuding(String ruheyuding) {
		this.ruheyuding = ruheyuding;
	}
	
	/**
	 * 获取：如何预订
	 */
	public String getRuheyuding() {
		return ruheyuding;
	}
				
	
	/**
	 * 设置：景点图片
	 */
	 
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
