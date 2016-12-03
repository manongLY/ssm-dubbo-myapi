package cn.mldn.joy.service.back;

import java.util.Map;
import java.util.Set;

import cn.mldn.joy.vo.PaymentChannel;

public interface IPaymentChannelServiceBack {
	/**
	 * 渠道管理列表分页显示(精确查询)
	 * @param currentPage 当前页数
	 * @param lineSize 每页显示数量
	 * @param channelName 渠道名称
	 * @param channlCode 渠道代码
	 * @param paymentMode 支付方式
	 * @param channelState 渠道状态
	 * @return Map
	 * Key = allPaymentChannels ,Value= IPaymentChannelDAO.findAll();
	 * Key = paymentChannelCount ,Value= IPaymentChannelDAO.getAllCount();
	 */
	public Map<String,Object> list(int currentPage, int lineSize,
			String channelName,String channlCode,String paymentMode,String channelState);
	/**
	 * 渠道管理列表分页显示(模糊查询)
	 * @param currentPage 当前页数
	 * @param lineSize 每页显示数量
	 * @param channelName 渠道名称
	 * @param channlCode 渠道代码
	 * @param paymentMode 支付方式
	 * @param channelState 渠道状态
	 * @return Map
	 * Key = allPaymentChannels ,Value= IPaymentChannelDAO.findAll();
	 * Key = paymentChannelCount ,Value= IPaymentChannelDAO.getAllCount();
	 */
	public Map<String,Object> listByFuzzy(int currentPage, int lineSize,
			String channelName,String channlCode,String paymentMode,String channelState);
	
	public boolean add(PaymentChannel vo);
	
	public boolean edit(PaymentChannel vo);
	
	public boolean remove(Set<String> ids);
	
	public PaymentChannel get(String id);
}
