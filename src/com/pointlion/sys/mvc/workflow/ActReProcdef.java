package com.pointlion.sys.mvc.workflow;

import com.jfinal.plugin.activerecord.Page;
import com.pointlion.sys.mvc.base.BaseActReProcdef;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ActReProcdef extends BaseActReProcdef<ActReProcdef> {
	public static final ActReProcdef dao = new ActReProcdef();
	
	/***
	 * 查询分页
	 * @param curr
	 * @param pagesize
	 * @return
	 */
	public Page<ActReProcdef> getDefPage(Integer curr , Integer pagesize){
		return ActReProcdef.dao.paginate(curr, pagesize, "select * ", " from (select def.*,dep.DEPLOY_TIME_ from act_re_procdef def ,act_re_deployment dep where def.DEPLOYMENT_ID_=dep.ID_ ORDER BY VERSION_ DESC) a group by KEY_");
	}
}
