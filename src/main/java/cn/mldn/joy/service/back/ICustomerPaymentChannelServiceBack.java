package cn.mldn.joy.service.back;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.CustomerPaymentChannel;

public interface ICustomerPaymentChannelServiceBack {
	public Map<String,Object> list() ;
	
	public boolean add(CustomerPaymentChannel vo) ;
	
	public boolean removeById(String id) ;
	
	public Map<String,Object> listSplit(String paymentMode,String paymentChannelCode,int currentPage,int lineSize) ;
	
	public boolean remove(Set<String> ids) ;
}
