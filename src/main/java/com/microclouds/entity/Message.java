package com.microclouds.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author https://github.com/Fanqie22
 * @since 2019-01-17
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 
	 */
	@TableField(value="from_real_name")
	private String fromRealName;

	/**
	 * 
	 */
	@TableField(value="from_user_id")
	private Integer fromUserId;

	/**
	 * 
	 */
	@TableField(value="to_user_id")
	private Integer toUserId;

	/**
	 * 
	 */
	private String content;

	/**
	 * 
	 */
	@TableField(value="send_date")
	private Date sendDate;

	/**
	 * 
	 */
	private String type;

	/**
	 * 
	 */
	@TableField(value="del_flag")
	private Integer delFlag;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFromRealName() {
		return fromRealName;
	}

	public void setFromRealName(String fromRealName) {
		this.fromRealName = fromRealName;
	}

	public Integer getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(Integer fromUserId) {
		this.fromUserId = fromUserId;
	}

	public Integer getToUserId() {
		return toUserId;
	}

	public void setToUserId(Integer toUserId) {
		this.toUserId = toUserId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

}
