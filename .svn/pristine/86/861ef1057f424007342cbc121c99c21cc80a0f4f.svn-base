package cn.mldn.joy.service.back;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.SysAccount;

public interface ISysAccountServiceBack {
	/**
	 * 实现数据的分页查询操作，需要进行如下的查询：<br>
	 * 1、调用IBespeakDAO.findAllSplitByStatus()方法查询出具体的数据内容；<br>
	 * 2、调用IBespeakDAO.getAllCountByStatus()方法统计数据量。<br>
	 * 对于status的内容取值有如下的原则：
	 * 1、status = 0：表示列出被删除的管理员账号；<br>
	 * 2、status = 1：表示列出正常状态的管理员账号；<br>
	 * 3、status = 2：表示列出被禁用状态的管理员账号；<br>
	 * 4、status = 3：表示列出待审核状态的管理员账号；<br>
	 * 4、status = null：表示列出所有状态的管理员账号；<br>
	 * @param column 模糊查询列
	 * @param keyWord 模糊查询关键字
	 * @param currentPage 当前所在页
	 * @param lineSize 每页显示的数据行
	 * @param status 描述的是数据查询的类型，如果设置为null表示查询全部
	 * @return 返回的结果包含有如下数据：<br>
	 * 1、key = allSysAccount、value = ISysAccountDAO.findAllSplitByStatus()；<br>
	 * 2、key = sysAccountsCount、value = ISysAccountDAO.getAllCountByStatus()；<br>	 
	 */
	public Map<String, Object> listByStatus(String column, String keyWord, int currentPage, int lineSize,
			Integer status);
	/**
	 * 实现管理员待审核账号审核。或者一些管理员账号的信息修改,
	 * 1、要保证要更新的用户存在
	 * 2、如果要更新的旧状态和新状态一样，则直接返回成功
	 * 3、确定要更新的用户的旧状态和oldState一样
	 * @param sysid 要修改状态的管理员账号
	 * @param oldPassword 原始状态（现在的状态数据）
	 * @param newPassword 更改状态（要更改的的数据）
	 * @return 修改成功返回true，否则返回false
	 */
	public boolean editState(String phone,Integer oldState,Integer newState) ;
	/**
	 * 进行增加前数据查询的操作，本操作将执行如下调用：<br>
	 * 1、调用IRoleDAO.findAll()取得全部的角色信息；<br>
	 * 2、调用IAccountDAO.findById()取得指定用户的信息；<br>
	 * 3、调用IAccountDAO.findAllRoleByAccount()方法取得用户已经具备的角色信息；<br>
	 * @param mid 要更新的用户id数据；
	 * @return 返回的内容包含有如下组成：<br>
	 * 1、key = allRoles、value = 全部的角色；<br>
	 * 2、key = AccountRoles、value = 用户的全部的角色编号；<br>
	 * 3、key = Account、value = 查询出来的用户信息；<br>
	 */
	public Map<String,Object> editPre(String mid) ;

	/**
	 * 描述数据追加的操作处理，本操作将执行如下调用：<br>
	 * 1、查询要追加的mid的数据是否存在，调用IAccountDAO.findById()方法；<br>
	 * 2、调用IAccountDAO.doUpdate()保存用户信息；<br>
	 * 3、调用IAccountDAO.doRemoveAccountAndRole()方法删除掉已经存在的关系；<br>
	 * 4、调用IAccountDAO.doCreateAccountAndRole()保存用户和角色的关系；<br>
	 * @param vo
	 * @param rid 包括要追加的rid数据
	 * @return 用户保存成功返回true，否则返回false
	 */
	public boolean edit(SysAccount vo); 
	
	/**
	 * 进行增加前数据查询的操作，本操作将执行如下调用：<br>
	 * 1、调用IRoleDAO.findAll()取得全部的角色信息；<br>
	 * @return 返回的内容包含有如下组成：<br>
	 * 1、key = allRoles、value = 全部的角色；<br>
	 */
	public Map<String,Object> addPre() ;
	/**
	 * 描述数据追加的操作处理，本操作将执行如下调用：<br>
	 * 1、查询要追加的mid的数据是否存在，调用IAccountDAO.findById()方法；<br>
	 * 2、调用IAccountDAO.doCreate()保存用户信息；<br>
	 * 3、调用IAccountDAO.doCreateAccountAndRole()保存用户和角色的关系；<br>
	 * @param vo
	 * @param rid 包括要追加的rid数据
	 * @return 用户保存成功返回true，否则返回false
	 */
	public boolean add(SysAccount vo);
	
	/**
	 * 实现用户的状态的更新处理，调用IAccountDAO.doUpdateLocked()方法
	 * @param mid 要更新的用户编号
	 * @param locked 表示要更新后的状态
	 * @return
	 */
	public boolean editLocked(String mid,int locked) ;
	
	/**
	 * 此处为修改指定用户密码的操作处理，调用IAccountDAO.doUpdatePasswordByAdmin()方法
	 * @param mid 要修改的用户的编号  
	 * @param password 经过加密后的新密码
	 * @return 
	 */
	public boolean editPasswordByAdmin(String mid,String password) ;
	/**
	 * 实现密码的变更处理
	 * @param mid 要修改密码的当前用户
	 * @param oldPassword 原始密码（加密后的数据）
	 * @param newPassword 新的密码（加密后的数据）
	 * @return 修改成功返回true，否则返回false
	 */
	public boolean editPassword(String mid,String oldPassword,String newPassword) ;
	/**
	 * 根据用户的id查询出用户的完整数据，调用：IAccountDAO.findById()
	 * @param mid 
	 * @return
	 */
	public SysAccount get(String mid) ;
	/**
	 * 是进行用户对应的角色以及所有权限数据的查询操作，要调用如下的接口方法：<br>
	 * 1、查询所有的角色：IRoleDAO.findAllRoleFlag()；<br>
	 * 2、查询所有的权限：IActionDAO.findAllActionFlag()；<br>
	 * @param mid
	 * @return 返回的结果包含有如下的几个内容：<br>
	 * 1、key = allRoles = value = IRoleDAO.findAllRoleFlag()，Set集合；<br>
	 * 2、key = allActions = value = IActionDAO.findAllActionFlag()，Set集合；<br>
	 */
	public Map<String,Object> listAuthByAccount(String mid) ;
}
