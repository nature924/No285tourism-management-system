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
 * 订票信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 10:00:42
 */
@TableName("dingpiaoxinxi")
public class DingpiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingpiaoxinxiEntity() {
		
	}
	
	public DingpiaoxinxiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 观光日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
