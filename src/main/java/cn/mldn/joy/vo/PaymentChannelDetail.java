package cn.mldn.joy.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PaymentChannelDetail implements Serializable{
	private String ID ;
	private String cutomerID ;
	private String customerNum ;
	private Date tallydate ;
	private String paymentChannelID ;
	private String paymentChannel ;
	private Integer paymentSuccessAmount ;
	private Integer paymentPrice ;
	private Integer refundSuccessAmount ;
	private Integer refundPrice ;
	private Date calculatetime ;
	private Integer paymentTotalAmount;
	private Integer refundTotalAmount ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCutomerID() {
		return cutomerID;
	}
	public void setCutomerID(String cutomerID) {
		this.cutomerID = cutomerID;
	}
	public String getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}
	public Date getTallydate() {
		return tallydate;
	}
	public void setTallydate(Date tallydate) {
		this.tallydate = tallydate;
	}
	public String getPaymentChannelID() {
		return paymentChannelID;
	}
	public void setPaymentChannelID(String paymentChannelID) {
		this.paymentChannelID = paymentChannelID;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	public Integer getPaymentSuccessAmount() {
		return paymentSuccessAmount;
	}
	public void setPaymentSuccessAmount(Integer paymentSuccessAmount) {
		this.paymentSuccessAmount = paymentSuccessAmount;
	}
	public Integer getPaymentPrice() {
		return paymentPrice;
	}
	public void setPaymentPrice(Integer paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	public Integer getRefundSuccessAmount() {
		return refundSuccessAmount;
	}
	public void setRefundSuccessAmount(Integer refundSuccessAmount) {
		this.refundSuccessAmount = refundSuccessAmount;
	}
	public Integer getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(Integer refundPrice) {
		this.refundPrice = refundPrice;
	}
	public Date getCalculatetime() {
		return calculatetime;
	}
	public void setCalculatetime(Date calculatetime) {
		this.calculatetime = calculatetime;
	}
	public Integer getPaymentTotalAmount() {
		return paymentTotalAmount;
	}
	public void setPaymentTotalAmount(Integer paymentTotalAmount) {
		this.paymentTotalAmount = paymentTotalAmount;
	}
	public Integer getRefundTotalAmount() {
		return refundTotalAmount;
	}
	public void setRefundTotalAmount(Integer refundTotalAmount) {
		this.refundTotalAmount = refundTotalAmount;
	}
	@Override
	public String toString() {
		return "PaymentChannelDetail [ID=" + ID + ", cutomerID=" + cutomerID + ", customerNum=" + customerNum
				+ ", tallydate=" + tallydate + ", paymentChannelID=" + paymentChannelID + ", paymentChannel="
				+ paymentChannel + ", paymentSuccessAmount=" + paymentSuccessAmount + ", paymentPrice=" + paymentPrice
				+ ", refundSuccessAmount=" + refundSuccessAmount + ", refundPrice=" + refundPrice + ", calculatetime="
				+ calculatetime + ", paymentTotalAmount=" + paymentTotalAmount + ", refundTotalAmount="
				+ refundTotalAmount + "]\n";
	}
	
}
