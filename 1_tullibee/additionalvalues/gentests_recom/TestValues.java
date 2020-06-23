package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;

public class TestValues {

    //Exemplo do professor
    public static DataInputStream disOne() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }


    // Vinicius Siqueira
	// Test Contract ---------------------------------------------------------------------------------------------/
    //line 103~105
    public static Contract brchSecType() {
    	Contract cont0 = new Contract();
    	cont0.m_secType = "Suj01";
    	Contract cont1 = new Contract();
    	cont1.m_secType = "Suj02";
    			
    	cont0.equals(cont1);
    	return cont0;
    }

    //line 107~112
    public static Contract brch107() {
    	Contract cont0 = new Contract();
    	cont0.m_symbol = "Suj01-sym";
    	cont0.m_exchange = "Suj01-exc";
    	cont0.m_primaryExch = "Suj01-priEx";
    	cont0.m_currency = "Suj01-cur";
    	Contract cont1 = new Contract();
    	cont1.m_symbol = "Suj02-sym";
    	cont1.m_exchange = "Suj02-exc";
    	cont1.m_primaryExch = "Suj02-priEx";
    	cont1.m_currency = "Suj02-cur";
    			
    	cont0.equals(cont1);
    	return cont0;
    }
    
    //line 128~130
    public static Contract brchIdType() {
    	Contract cont0 = new Contract();
    	cont0.m_secIdType = "Suj01";
    	Contract cont1 = new Contract();
    	cont1.m_secIdType = "Suj02";
    			
    	cont0.equals(cont1);    	
    	return cont0;
    }

    //line 132~134
    public static Contract brchSecId() {
    	Contract cont0 = new Contract();
    	cont0.m_secId = "Suj01";
    	Contract cont1 = new Contract();
    	cont1.m_secId = "Suj02";
    			
    	cont0.equals(cont1);
    	return cont0;
    }    
	// Test Contract ---------------------------------------------------------------------------------------------/
 
   
    public static EWrapper eWrapperOne() {

        return new com.ib.client.EWrapper() {

        @Override
	   	public void error(Exception e) { e.printStackTrace(); }

	   	@Override
	   	public void error(String str) {}

	   	@Override
	   	public void error(int id, int errorCode, String errorMsg) {}

	   	@Override
	   	public void connectionClosed() {}

	   	@Override
	   	public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {}

	   	@Override
	   	public void tickSize(int tickerId, int field, int size) {}

	   	@Override
	   	public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta,
	   			double modelPrice, double pvDividend) {}

	   	@Override
	   	public void tickGeneric(int tickerId, int tickType, double value) {}

	   	@Override
	   	public void tickString(int tickerId, int tickType, String value) {}

	   	@Override
	   	public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
	   			double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
	   			double dividendsToExpiry) {}

	   	@Override
	   	public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
	   			int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {}

	   	@Override
	   	public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {}

	   	@Override
	   	public void openOrderEnd() {}

	   	@Override
	   	public void updateAccountValue(String key, String value, String currency, String accountName) {}

	   	@Override
	   	public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
	   			double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {}

	   	@Override
	   	public void updateAccountTime(String timeStamp) {}

	   	@Override
	   	public void accountDownloadEnd(String accountName) {}

	   	@Override
	   	public void nextValidId(int orderId) {}

	   	@Override
	   	public void contractDetails(int reqId, ContractDetails contractDetails) {}

	   	@Override
	   	public void bondContractDetails(int reqId, ContractDetails contractDetails) {}

	   	@Override
	   	public void contractDetailsEnd(int reqId) {}

	   	@Override
	   	public void execDetails(int reqId, Contract contract, Execution execution) {}

	   	@Override
	   	public void execDetailsEnd(int reqId) {	}

	   	@Override
	   	public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {}

	   	@Override
	   	public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side,
	   			double price, int size) {}

	   	@Override
	   	public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {}

	   	@Override
	   	public void managedAccounts(String accountsList) {}

	   	@Override
	   	public void receiveFA(int faDataType, String xml) {}

	   	@Override
	   	public void historicalData(int reqId, String date, double open, double high, double low, double close,
	   			int volume, int count, double WAP, boolean hasGaps) {}

	   	@Override
	   	public void scannerParameters(String xml) {}

	   	@Override
	   	public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
	   			String benchmark, String projection, String legsStr) {}

	   	@Override
	   	public void scannerDataEnd(int reqId) {}

	   	@Override
	   	public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
	   			long volume, double wap, int count) {}

	   	@Override
	   	public void currentTime(long time) {}

	   	@Override
	   	public void fundamentalData(int reqId, String data) {}

	   	@Override
	   	public void deltaNeutralValidation(int reqId, UnderComp underComp) {}

	   	@Override
	   	public void tickSnapshotEnd(int reqId) {}

	   	@Override
	   	public void stopRequested() {}

        };
        
    }    
    
}
