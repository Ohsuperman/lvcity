package com.neuedu.lvcity.service.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.dao.MessageDao;
import com.neuedu.lvcity.dao.impl.MessageDaoImpl;
import com.neuedu.lvcity.model.Message;
import com.neuedu.lvcity.service.MessageService;

public class MessageServiceImpl implements MessageService{
	
	/**
	 * 类实例
	 */
	private static final MessageService instance = new MessageServiceImpl();

	/**
	 * 取得实例
	 * 
	 * @return 实例对象
	 */
	public static MessageService getInstance() {
		return instance;
	}

	/**
	 * 构造方法
	 */
	private MessageServiceImpl() {
	}

	@Override
	public int MessageCount() {
		//声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				//声明变量，用于保存数据库查询结果
				int result = 0;
				try{
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋值给数据库连接对象变量
					conn = DBUtils.getConnection();
					//创建userDao的实现类对象
					MessageDao messageDao = new MessageDaoImpl(conn);
					
					//调用dao中的banarCount方法，进行数据库查询操作，结果赋值给查询结果变量
					result = messageDao.messageCount();	
				
				} catch (Exception e) {
					System.out.println("查询统计所有message错误"+e.getMessage());
				} finally {
					//调用数据库工具类的closeConnection方法，关闭连接
					DBUtils.closeConnection(conn);
				}
				//返回数据库查询结果
				return result;
			}

	@Override
	public int addMessage(int mid,String tel,String sex,String name,String message) {
		//声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;
		//声明变量，用于保存数据库查询结果
		int result = 0;
		try{
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋值给数据库连接对象变量
			conn = DBUtils.getConnection();
			DBUtils.beginTransaction(conn);
			//创建messageDao的实现类对象
			MessageDao MessageDao = new MessageDaoImpl(conn);
			//调用dao中的selectAll方法，进行数据库查询操作，结果赋值给查询结果变量
			result = MessageDao.addMessage(mid, tel, sex, name, message);		
		    DBUtils.commit(conn);
		} catch (Exception e) {
			System.out.println("增加message错误"+e.getMessage());
		} finally {
			//调用数据库工具类的closeConnection方法，关闭连接
			DBUtils.closeConnection(conn);
		}
		//返回数据库查询结果
		return result;
		
			}

	@Override
	public int updateMessage(Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMessage(Message message) {
		//声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;
		//声明变量，用于保存数据库查询结果
		int result = 0;
		try{
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋值给数据库连接对象变量
			conn = DBUtils.getConnection();
			DBUtils.beginTransaction(conn);
			//创建messageDao的实现类对象
			MessageDao MessageDao = new MessageDaoImpl(conn);
			//调用dao中的selectAll方法，进行数据库查询操作，结果赋值给查询结果变量
			result = MessageDao.deleteMessage(message);
		    DBUtils.commit(conn);
		} catch (Exception e) {
			System.out.println("删除Message错误"+e.getMessage());
		} finally {
			//调用数据库工具类的closeConnection方法，关闭连接
			DBUtils.closeConnection(conn);
		}
		//返回数据库查询结果
		return result;
	}
	@Override
	public Message findOneMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findAllMessage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		//声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				//声明变量，用于保存数据库查询结果
				List<Message> messages = null;
				try{
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋值给数据库连接对象变量
					conn = DBUtils.getConnection();
					//创建userDao的实现类对象
					MessageDao messageDao = new MessageDaoImpl(conn);
					//调用dao中的selectAll方法，进行数据库查询操作，结果赋值给查询结果变量
					messages = messageDao.findAllMessage(map);			
				
				} catch (Exception e) {
					System.out.println("查询所有banar错误"+e.getMessage());
				} finally {
					//调用数据库工具类的closeConnection方法，关闭连接
					DBUtils.closeConnection(conn);
				}
				//返回数据库查询结果
				return messages;
}


}
