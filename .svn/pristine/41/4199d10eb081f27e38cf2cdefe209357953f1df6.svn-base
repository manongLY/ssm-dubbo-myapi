package cn.mldn.joy.service.back;

import java.util.Map;

import cn.mldn.joy.vo.TransactionLogSearch;

public interface ITransactionLogServiceBack {
	/**
	 * 渠道管理列表分页显示(精确查询)
	 * @param transactionSN    		交易流水号 <br>
	 * @param paymentPFOrderNum  	支付订单号<br>
	 * @param customerOrderNum		商户订单号<br>
	 * @param platformCunstomerID	平台商户号<br>
	 * @param paymentChannel		支付渠道<br>
	 * @param paymentMode			支付方式<br>
	 * @param transactionType		交易类型<br>
	 * @param startTime				要查询的开始时间<br>
	 * @param endTime				要查询的结束时间<br>
	 * @param lineSize				每页显示数量<br>
	 * @param currentPage			当前页数<br>
	 * @return Map
	 * Key = allTransactionLogs ,Value= ITransactionLogDAO.findAll();
	 * Key = transactionLogCount ,Value= ITransactionLogDAO.getAllCount();
	 */
	public Map<String,Object> list(TransactionLogSearch vo);
	/**
	 * 渠道管理列表分页显示(精确查询)
	 * @param transactionSN    		交易流水号 <br>
	 * @param paymentPFOrderNum  	支付订单号<br>
	 * @param customerOrderNum		商户订单号<br>
	 * @param platformCunstomerID	平台商户号<br>
	 * @param paymentChannel		支付渠道<br>
	 * @param paymentMode			支付方式<br>
	 * @param transactionType		交易类型<br>
	 * @param startTime				要查询的开始时间<br>
	 * @param endTime				要查询的结束时间<br>
	 * @param lineSize				每页显示数量<br>
	 * @param currentPage			当前页数<br>
	 * @return Map
	 * Key = allTransactionLogs ,Value= ITransactionLogDAO.findAll();
	 * Key = transactionLogCount ,Value= ITransactionLogDAO.getAllCount();
	 */
	public Map<String,Object> listByFuzzy(TransactionLogSearch vo);
	/**
	 * 通过商户订单号取得相应的交易日志的全部信息
	 * @param customerOrderNum
	 * @return
	 */
	public Map<String,Object> getByCustomerOrderNum(String customerOrderNum);
}
