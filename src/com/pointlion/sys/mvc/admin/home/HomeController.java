/**
 * @author Lion
 * @date 2017年1月24日 下午12:02:35
 * @qq 439635374
 */
package com.pointlion.sys.mvc.admin.home;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;
import com.pointlion.sys.mvc.admin.bumph.BumphService;
import com.pointlion.sys.mvc.admin.chat.SysFriend;
import com.pointlion.sys.mvc.admin.cstmsetting.SysCustomSetting;
import com.pointlion.sys.mvc.admin.login.SessionUtil;
import com.pointlion.sys.mvc.admin.menu.SysMenu;
import com.pointlion.sys.mvc.admin.notice.NoticeService;
import com.pointlion.sys.mvc.admin.role.SysRole;
import com.pointlion.sys.mvc.admin.user.SysUser;
import com.pointlion.sys.mvc.common.base.BaseController;
import com.pointlion.sys.plugin.shiro.ShiroKit;
import com.pointlion.sys.plugin.shiro.ext.SimpleUser;

/***
 * 首页控制器
 */
public class HomeController extends BaseController {
	static BumphService bumphService = new BumphService();
	static NoticeService noticeService = new NoticeService();
	/***
	 * 登陆成功获取首页
	 */
    public void index(){
    	SimpleUser user = ShiroKit.getLoginUser();
    	String username = user.getUsername();
    	SysUser u = SysUser.dao.getByUsername(username);
    	SessionUtil.setUsernameToSession(this.getRequest(), username);
    	//加载个性化设置
    	SysCustomSetting setting = SysCustomSetting.dao.getCstmSettingByUsername(username);
    	if(setting==null){
    		setAttr("setting", SysCustomSetting.dao.getDefaultCstmSetting());
    	}else{
    		setAttr("setting", setting);
    	}
    	List<SysUser> friends = SysFriend.dao.getUserFriend(u.getId());
    	setAttr("friends", friends);//我的好友
    	setAttr("userName", user.getName());//我的姓名
    	setAttr("userEmail", user.getEmail());//我的邮箱
    	//内部发文待办
    	List<Record> BumphList = bumphService.getToDoListByKey(username);
    	setAttr("BumphList", BumphList);
    	//获取首页通知公告
    	setAttr("NoticeList",noticeService.getMyNotice(user.getId()));
    	//查询所有有权限的菜单
    	List<SysMenu> mlist = SysRole.dao.getRoleAuthByUserid(u.getId(), "1","#root");//规定只有四级菜单 在这里暂定为A,B,C,D
    	for(SysMenu a : mlist){
    		List<SysMenu> blist = SysRole.dao.getRoleAuthByUserid(u.getId(), "1",a.getId());//A下面的菜单
    		a.setChildren(blist);
    		for(SysMenu b : blist){
    			List<SysMenu> clist = SysRole.dao.getRoleAuthByUserid(u.getId(), "1",b.getId());//B下面的菜单
    			b.setChildren(clist);
    			for(SysMenu c : clist){
        			List<SysMenu> dlist = SysRole.dao.getRoleAuthByUserid(u.getId(), "1",c.getId());//B下面的菜单
        			c.setChildren(dlist);
        		}
    		}
    	}
    	setAttr("mlist", mlist);
    	render("/WEB-INF/admin/home/index.html");
    }
    /***
     * 首页内容页
     */
    public void getMyHome(){
    	render("/WEB-INF/admin/home/myHome.html");
    }
    /**
     * 内容页
     * */
    public void content(){
    	render("/WEB-INF/admin/home/content.html");
    }
    /***
     * 获取消息中心最新消息
     */
    public void getSiteMessageTipPage(){
    	render("/WEB-INF/admin/home/siteMessageTip.html");
    }
}