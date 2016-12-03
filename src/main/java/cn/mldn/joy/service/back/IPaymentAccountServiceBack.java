package cn.mldn.joy.service.back;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.PaymentAccount;

public interface IPaymentAccountServiceBack {
	public Map<String,Object> list() ;
	
	public PaymentAccount get(String id) ;
	
	public boolean add(PaymentAccount vo) ;
	
	public boolean edit(PaymentAccount vo) ;
	
	public boolean remove(Set<String> ids) ;
	
	public boolean removeById(String id) ;
	
	public Map<String,Object> listSplit(String name,String cellphone,String mail,String accountType,String accountState,int currentPage,int lineSize) ;
	public Map<String,Object> listByFuzzy(String name,String cellphone,String mail,String accountType,String accountState,int currentPage,int lineSize) ;
}
