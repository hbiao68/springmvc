package hb.account.service;

import hb.account.model.User;
import hb.page.Page;

import java.util.List;
/**
 * 用户管理的service
 */
public interface UserService {

	/**
	 * 分页全查测试
	 * @param page
	 * @return
	 */
	public List<User> findAll(Page<User> page) throws Exception;
	
	/**
	 * 查询所有用户(带分页)
	 * @return 用户结果集
	 * @throws Exception 
	 */
	public List<User> queryAllUser(User user) throws Exception;

	/**
	 * 添加用户
	 * @param user 用户实体
	 * @return true表示添加成功，false表示失败
	 * @throws Exception 
	 */
	public boolean insertUser(User user) throws Exception;

	/**
	 * 通过条件查询user
	 * @param user user对象的属性作为查询条件
	 * @return 合格条件的 用户对象
	 * @throws Exception 
	 */
	public List<User> queryUserByObj(User user) throws Exception;
	
	/**
	 * 通过id查询一条
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	public User queryUserByUserid(String userid) throws Exception;

	/**
	 * 用户的修改
	 * @param user 传入要修改的user实体
	 * @return true表示修改成功 false表示修改失败
	 */
	public boolean updateUser(User user) throws Exception;

	/**
	 * 用户的删除
	 * @param user 要删除的用户实体
	 * @return true删除成功  false删除失败
	 */
	public boolean deleteUser(User user) throws Exception;

	/**
	 * 查询用户总数
	 * @return 
	 * @throws Exception
	 */
	public int queryUserCount() throws Exception;

	/**
	 * 批量删除用户
	 * @param userids
	 * @return
	 * @throws Exception
	 */
	public boolean deleteUsersById(String userids) throws Exception;
}
