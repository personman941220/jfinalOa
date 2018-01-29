package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOaBumph<M extends BaseOaBumph<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("id");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public M setSenderId(java.lang.String senderId) {
		set("sender_id", senderId);
		return (M)this;
	}

	public java.lang.String getSenderId() {
		return get("sender_id");
	}

	public M setSenderName(java.lang.String senderName) {
		set("sender_name", senderName);
		return (M)this;
	}

	public java.lang.String getSenderName() {
		return get("sender_name");
	}

	public M setSenderOrgid(java.lang.String senderOrgid) {
		set("sender_orgid", senderOrgid);
		return (M)this;
	}

	public java.lang.String getSenderOrgid() {
		return get("sender_orgid");
	}

	public M setSenderOrgname(java.lang.String senderOrgname) {
		set("sender_orgname", senderOrgname);
		return (M)this;
	}

	public java.lang.String getSenderOrgname() {
		return get("sender_orgname");
	}

	public M setDocType(java.lang.String docType) {
		set("doc_type", docType);
		return (M)this;
	}

	public java.lang.String getDocType() {
		return get("doc_type");
	}

	public M setDocNum(java.lang.String docNum) {
		set("doc_num", docNum);
		return (M)this;
	}

	public java.lang.String getDocNum() {
		return get("doc_num");
	}

	public M setDocNumSource(java.lang.String docNumSource) {
		set("doc_num_source", docNumSource);
		return (M)this;
	}

	public java.lang.String getDocNumSource() {
		return get("doc_num_source");
	}

	public M setDocNumYear(java.lang.String docNumYear) {
		set("doc_num_year", docNumYear);
		return (M)this;
	}

	public java.lang.String getDocNumYear() {
		return get("doc_num_year");
	}

	public M setDocNumN(java.lang.Integer docNumN) {
		set("doc_num_n", docNumN);
		return (M)this;
	}

	public java.lang.Integer getDocNumN() {
		return get("doc_num_n");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public M setIfSubmit(java.lang.String ifSubmit) {
		set("if_submit", ifSubmit);
		return (M)this;
	}

	public java.lang.String getIfSubmit() {
		return get("if_submit");
	}

	public M setIfSend(java.lang.String ifSend) {
		set("if_send", ifSend);
		return (M)this;
	}

	public java.lang.String getIfSend() {
		return get("if_send");
	}

	public M setIfComplete(java.lang.String ifComplete) {
		set("if_complete", ifComplete);
		return (M)this;
	}

	public java.lang.String getIfComplete() {
		return get("if_complete");
	}

	public M setProcInsId(java.lang.String procInsId) {
		set("proc_ins_id", procInsId);
		return (M)this;
	}

	public java.lang.String getProcInsId() {
		return get("proc_ins_id");
	}

	public M setFirstLeaderAudit(java.lang.String firstLeaderAudit) {
		set("first_leader_audit", firstLeaderAudit);
		return (M)this;
	}

	public java.lang.String getFirstLeaderAudit() {
		return get("first_leader_audit");
	}

	public M setSecondLeaderAudit(java.lang.String secondLeaderAudit) {
		set("second_leader_audit", secondLeaderAudit);
		return (M)this;
	}

	public java.lang.String getSecondLeaderAudit() {
		return get("second_leader_audit");
	}

	public M setCreateTime(java.lang.String createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.lang.String getCreateTime() {
		return get("create_time");
	}

	public M setSendTime(java.lang.String sendTime) {
		set("send_time", sendTime);
		return (M)this;
	}

	public java.lang.String getSendTime() {
		return get("send_time");
	}

}
