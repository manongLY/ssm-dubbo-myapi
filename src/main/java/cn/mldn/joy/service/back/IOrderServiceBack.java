package cn.mldn.joy.service.back;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.OrderInfo;
import cn.mldn.joy.vo.PaymentInfo;
import cn.mldn.joy.vo.PaymentSN;
import cn.mldn.joy.vo.ReplyLog;

public interface IOrderServiceBack {
	public boolean addOrder(OrderInfo orderInfo,PaymentInfo paymentInfo,PaymentSN paymentSN,ReplyLog reaplyLog) ;
	public Map<String,Object> listOrderInfo(Map<String,Object> param) ;
	public Map<String,Object> showOrderInfo(String paymentPFOrderNum) ;
	public Map<String,Object> listOrderPay(Map<String,Object> param) ;
	public Map<String,Object> showOrderPay(String transactionSN) ;
	public boolean remove(Set<String> ids) ;
}
