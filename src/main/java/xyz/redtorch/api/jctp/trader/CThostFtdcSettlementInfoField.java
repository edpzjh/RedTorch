/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcSettlementInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSettlementInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSettlementInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSettlementInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_SequenceNo_get(swigCPtr, this);
  }

  public void setContent(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_Content_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSettlementInfoField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSettlementInfoField(), true);
  }

}