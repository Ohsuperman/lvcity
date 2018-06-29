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
	 * ��ʵ��
	 */
	private static final MessageService instance = new MessageServiceImpl();

	/**
	 * ȡ��ʵ��
	 * 
	 * @return ʵ������
	 */
	public static MessageService getInstance() {
		return instance;
	}

	/**
	 * ���췽��
	 */
	private MessageServiceImpl() {
	}

	@Override
	public int MessageCount() {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
				Connection conn = null;
				//�������������ڱ������ݿ��ѯ���
				int result = 0;
				try{
					//�������ݿ⹤�����getConnection������ȡ�����ݿ����Ӷ��󣬲���ֵ�����ݿ����Ӷ������
					conn = DBUtils.getConnection();
					//����userDao��ʵ�������
					MessageDao messageDao = new MessageDaoImpl(conn);
					
					//����dao�е�banarCount�������������ݿ��ѯ�����������ֵ����ѯ�������
					result = messageDao.messageCount();	
				
				} catch (Exception e) {
					System.out.println("��ѯͳ������message����"+e.getMessage());
				} finally {
					//�������ݿ⹤�����closeConnection�������ر�����
					DBUtils.closeConnection(conn);
				}
				//�������ݿ��ѯ���
				return result;
			}

	@Override
	public int addMessage(int mid,String tel,String sex,String name,String message) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		//�������������ڱ������ݿ��ѯ���
		int result = 0;
		try{
			//�������ݿ⹤�����getConnection������ȡ�����ݿ����Ӷ��󣬲���ֵ�����ݿ����Ӷ������
			conn = DBUtils.getConnection();
			DBUtils.beginTransaction(conn);
			//����messageDao��ʵ�������
			MessageDao MessageDao = new MessageDaoImpl(conn);
			//����dao�е�selectAll�������������ݿ��ѯ�����������ֵ����ѯ�������
			result = MessageDao.addMessage(mid, tel, sex, name, message);		
		    DBUtils.commit(conn);
		} catch (Exception e) {
			System.out.println("����message����"+e.getMessage());
		} finally {
			//�������ݿ⹤�����closeConnection�������ر�����
			DBUtils.closeConnection(conn);
		}
		//�������ݿ��ѯ���
		return result;
		
			}

	@Override
	public int updateMessage(Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMessage(Message message) {
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
		Connection conn = null;
		//�������������ڱ������ݿ��ѯ���
		int result = 0;
		try{
			//�������ݿ⹤�����getConnection������ȡ�����ݿ����Ӷ��󣬲���ֵ�����ݿ����Ӷ������
			conn = DBUtils.getConnection();
			DBUtils.beginTransaction(conn);
			//����messageDao��ʵ�������
			MessageDao MessageDao = new MessageDaoImpl(conn);
			//����dao�е�selectAll�������������ݿ��ѯ�����������ֵ����ѯ�������
			result = MessageDao.deleteMessage(message);
		    DBUtils.commit(conn);
		} catch (Exception e) {
			System.out.println("ɾ��Message����"+e.getMessage());
		} finally {
			//�������ݿ⹤�����closeConnection�������ر�����
			DBUtils.closeConnection(conn);
		}
		//�������ݿ��ѯ���
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
		//�������ݿ����Ӷ������ڱ������ݿ����Ӷ���
				Connection conn = null;
				//�������������ڱ������ݿ��ѯ���
				List<Message> messages = null;
				try{
					//�������ݿ⹤�����getConnection������ȡ�����ݿ����Ӷ��󣬲���ֵ�����ݿ����Ӷ������
					conn = DBUtils.getConnection();
					//����userDao��ʵ�������
					MessageDao messageDao = new MessageDaoImpl(conn);
					//����dao�е�selectAll�������������ݿ��ѯ�����������ֵ����ѯ�������
					messages = messageDao.findAllMessage(map);			
				
				} catch (Exception e) {
					System.out.println("��ѯ����banar����"+e.getMessage());
				} finally {
					//�������ݿ⹤�����closeConnection�������ر�����
					DBUtils.closeConnection(conn);
				}
				//�������ݿ��ѯ���
				return messages;
}


}
