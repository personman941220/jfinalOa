///**
// * @author Lion
// * @date 2017年1月24日 下午12:02:35
// * @qq 439635374
// */
//package #(package);
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.shiro.authc.credential.DefaultPasswordService;
//import org.apache.shiro.authc.credential.PasswordService;
//
//import com.jfinal.aop.Before;
//import com.jfinal.kit.StrKit;
//import com.jfinal.plugin.activerecord.Page;
//import com.jfinal.plugin.activerecord.Record;
//import com.pointlion.sys.interceptor.MainPageTitleInterceptor;
//import com.pointlion.sys.mvc.common.base.BaseController;
//import com.pointlion.sys.mvc.common.model.SysOrg;
//import com.pointlion.sys.mvc.common.model.SysUser;
//import com.pointlion.sys.mvc.common.utils.UuidUtil;
//
//@Before(MainPageTitleInterceptor.class)
//public class #(className) extends BaseController {
//	
//	/***
//	 * 列表页面
//	 */
//	public void getListPage(){
//    	render("/WEB-INF/admin/#(classNameSmall)/list.html");
//    }
//	/***
//     * 获取分页数据
//     **/
//    public void listData(){
//    	String curr = getPara("pageNumber");
//    	String pageSize = getPara("pageSize");
//    	String orgid = getPara("orgid");
//    	Page<Record> page = #(className).dao.getPage(Integer.valueOf(curr),Integer.valueOf(pageSize),orgid);
//    	renderPage(page.getList(),"",page.getTotalRow());
//    }
//    /***
//     * 保存
//     */
//    public void save(){
//    	#(className) o = getModel(#(className).class);
//    	if(StrKit.notBlank(o.getId())){
//    		o.update();
//    	}else{
//    		o.setId(UuidUtil.getUUID());
//    		o.save();
//    	}
//    	renderSuccess();
//    }
//    /***
//     * 获取编辑页面
//     */
//    public void getEditPage(){
//    	//添加和修改
//    	String id = getPara("id");
//    	if(StrKit.notBlank(id)){//修改
//    		SysUser o = SysUser.dao.getById(id);
//    		setAttr("o", o);
//    	}
//    	render("/WEB-INF/admin/user/edit.html");
//    }
//    /***
//     * 删除
//     * @throws Exception
//     */
//    public void delete() throws Exception{
//		String ids = getPara("ids");
//    	//执行删除
//		#(className).dao.deleteByIds(ids);
//    	renderSuccess("删除成功!");
//    }
//    
//    /**************************************************************************/
//	private String pageTitle = "请设置功能名称";//模块页面标题
//	private String breadHomeMethod = "getListPage";//面包屑首页方法
//	
//	public Map<String,String> getPageTitleBread() {
//		Map<String,String> pageTitleBread = new HashMap<String,String>();
//		pageTitleBread.put("pageTitle", pageTitle);
//		pageTitleBread.put("breadHomeMethod", breadHomeMethod);
//		return pageTitleBread;
//	}
//}
