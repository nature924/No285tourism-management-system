package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 景点信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
@TableName("jingdianxinxi")
public class JingdianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingdianxinxiEntity() {
		
	}
	
	public JingdianxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
