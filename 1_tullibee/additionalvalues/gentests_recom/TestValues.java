package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;
import java.util.Vector;

public class TestValues {
  
  
  /** Marcela **/
  
	public static DataInputStream msgId() {
		return new DataInputStream(new StringBufferInputStream("1\0"));
	}


	public static DataInputStream nextValidIdCase() {
		String switchCase = "9";
		String version = "2";
		String orderId = "8";
		String all = switchCase+"\0"+version+"\0"+orderId+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream managedAcctsCase() {
		String switchCase = "15";
		String version = "2";
		String accountsList = "2,3,5,12";
		String all = switchCase+"\0"+version+"\0"+accountsList+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream receiveFaCase() {
		String switchCase = "16";
		String version = "2";
		String faDataType = "14";
		String xml = "<?xml version='1.0'?>";
		String all = switchCase+"\0"+version+"\0"+faDataType+"\0"+xml+"\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static int version() {
		return 39;
	}

	public static EReader readerNextValidIdCase() {
		return new EReader(nextValidIdCase(), eWrapperOne(), version());
	}

	public static EReader readerManagedAcctsCase() {
		return new EReader(managedAcctsCase(), eWrapperOne(), version());
	}

	public static EReader readerReceiveFaCase() {
		return new EReader(receiveFaCase(), eWrapperOne(), version());
	}

  
  /** Aldiberg  does not improve coverage **/

    public static DataInputStream disOneOne() {
		//BOND_CONTRACT_DATA
		String str = "kkeaemen";
		Double dd = 7.77;
		int interino = 1;
		String action = "18";
		String input = action + "\0" + interino + "\0"+ str +"\0" + str + "\0" + 
		str +"\0" + dd + "\0"+ str +"\0" + str + "\0"+ str +"\0" +
		str + "\0"+ str +"\0" + interino + "\0"+ 
		interino +"\0" + interino + "\0"+ 
		str +"\0" +  str +"\0" + str + "\0"+ str +"\0" +
		str +"\0" + interino + "\0"+ dd +"\0" +  str +"\0" + str + "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

	public static DataInputStream disOneTwo() {
		//ACCT_DOWNLOAD_END
		String action = "54";
		String interino = "1";
		String textinput = "berg";
		String input =  action + "\0"+ interino + "\0" + textinput+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}

	public static DataInputStream disOneThree() {
		//EXECUTION_DATA_END
		String action = "55";
		String interino = "1";
		String input =  action + "\0"+ interino +"\0" + interino+ "\0";
        return new DataInputStream(new StringBufferInputStream(input));
	}
	public static void eReaderOne() {
         new com.ib.client.EReader(disOneOne(), eWrapperOne(), 44).run();
	}
	public static void eReaderTwo() {
         new com.ib.client.EReader(disOneTwo(), eWrapperOne(), 44).run();
	}
	public static void eReaderThree() {
         new com.ib.client.EReader(disOneThree(), eWrapperOne(), 44).run();
    }

    /** Marcelo 35% **/
  
   
    public static DataInputStream disOne() {
        String action = "1";
        String part1 = "2";
        String part2 = "3";
        String part3 = "4";
        String part4 = "2.97";
        String part5 = "1";
        String end = "-1";
        String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }


    public static EWrapper eWrapperOne() {

        return new com.ib.client.EWrapper() {

	   	@Override
	   	public void error(Exception e) { e.printStackTrace(); }

	   	@Override
	   	public void error(String str) {}

	   	@Override
	   	public void error(int id, int errorCode, String errorMsg) {	}

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
	   	public void tickGeneric(int tickerId, int tickType, double value) {	}

	   	@Override
	   	public void tickString(int tickerId, int tickType, String value) {	}

	   	@Override
	   	public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
	   			double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
	   			double dividendsToExpiry) {	}

	   	@Override
	   	public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
	   			int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {	}

	   	@Override
	   	public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {	}

	   	@Override
	   	public void openOrderEnd() {}

	   	@Override
	   	public void updateAccountValue(String key, String value, String currency, String accountName) {	}

	   	@Override
	   	public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
	   			double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {	}

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
	   	public void contractDetailsEnd(int reqId) {	}

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
	   	public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {	}

	   	@Override
	   	public void managedAccounts(String accountsList) {	}

	   	@Override
	   	public void receiveFA(int faDataType, String xml) {	}

	   	@Override
	   	public void historicalData(int reqId, String date, double open, double high, double low, double close,
	   			int volume, int count, double WAP, boolean hasGaps) {	}

	   	@Override
	   	public void scannerParameters(String xml) {	}

	   	@Override
	   	public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
	   			String benchmark, String projection, String legsStr) {	}

	   	@Override
	   	public void scannerDataEnd(int reqId) {	}

	   	@Override
	   	public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
	   			long volume, double wap, int count) {	}

	   	@Override
	   	public void currentTime(long time) {	}

	   	@Override
	   	public void fundamentalData(int reqId, String data) {	}

	   	@Override
	   	public void deltaNeutralValidation(int reqId, UnderComp underComp) {	}

	   	@Override
	   	public void tickSnapshotEnd(int reqId) {	}

	   	@Override
	   	public void stopRequested() {		}

        };
        
	}
	
	public static ExecutionFilter executionFilterNull() {
		return null;
	}
 
	public static Vector vectorNull() {
		return null;
	}

	public static Vector vectorFull() {
		Vector v = new Vector();
		v.add(3);
		return v;
	}
}
