package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOaNoticeUser<M extends BaseOaNoticeUser<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("id");
	}

	public M setUserId(java.lang.String userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}

	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public M setNoticeId(java.lang.String noticeId) {
		set("notice_id", noticeId);
		return (M)this;
	}

	public java.lang.String getNoticeId() {
		return get("notice_id");
	}

	public M setIfSign(java.lang.String ifSign) {
		set("if_sign", ifSign);
		return (M)this;
	}

	public java.lang.String getIfSign() {
		return get("if_sign");
	}

	public M setSignTime(java.lang.String signTime) {
		set("sign_time", signTime);
		return (M)this;
	}

	public java.lang.String getSignTime() {
		return get("sign_time");
	}

}
