package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;

public class TestValues {

    public static DataInputStream disOne() {
        return new DataInputStream(new StringBufferInputStream("1\0"));
    }

    
    // public static DataInputStream disOne() {
    //     String action = "1";
    //     String part1 = "2";
    //     String part2 = "3";
    //     String part3 = "4";
    //     String part4 = "2.97";
    //     String part5 = "1";
    //     String end = "-1";
    //     String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end + "\0";
    //     return new DataInputStream(new StringBufferInputStream(all));        
    // }
	
	
    public static DataInputStream portfolioCaseDataStream() {
        String action = "7";
	String version = "7";
	String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
	String strike = "1.42";
	String right = "d";
	String multiplier = "e";
	String primaryExch = "f";
	String currency = "g";
	String localSymbol = "h";
	String position = "1";
	String marketPrice = "1.5";
	String marketValue = "2.1";
	String averageCost = "1.1";
        String unrealizedPNL = "2.2";
	String realizedPNL = "3.1";
	String accountName = "i";
	String end = "-1";
	String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
		+ expirity + "\0" + strike + "\0" + right + "\0" + multiplier + "\0" + primaryExch + "\0"
		+ currency + "\0" + localSymbol + "\0" + position + "\0" + marketPrice + "\0" + marketValue + "\0"
		+ averageCost + "\0" + unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }

    public static DataInputStream portfolioCaseDataStream2() {
        String action = "7";
	String version = "6";
	String conId = "1";
        String symbol = "a";
        String secType = "b";
        String expirity = "c";
	String strike = "1.42";
	String right = "d";
	String currency = "g";
	String localSymbol = "h";
	String position = "1";
	String marketPrice = "1.5";
	String marketValue = "2.1";
	String averageCost = "1.1";
        String unrealizedPNL = "2.2";
	String realizedPNL = "3.1";
	String accountName = "i";
	String primaryExch = "ds";
	String end = "-1";
	String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" 
		+ expirity + "\0" + strike + "\0" + right + "\0" + currency + "\0" + localSymbol + "\0" 
		+ position + "\0" + marketPrice + "\0" + marketValue + "\0"+ averageCost + "\0" 
		+ unrealizedPNL + "\0" + realizedPNL + "\0" + accountName + "\0" + primaryExch + "\0" + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }

    public static DataInputStream acctUpdateTimeDatastream() {
        String action = "8";
	String version = "6";
	String timeStamp = "qw";
	String end = "-1";
	String all = action + "\0" + version + "\0" + timeStamp + end + "\0";
        return new DataInputStream(new StringBufferInputStream(all));        
    }

    public static int version() {
	return 39;
    }

	// public static EReader reader() {
	// 	return new EReader(disOne(),eWrapperOne(), 39);
	// }

    public static EReader reader2() {
	return new EReader(portfolioCaseDataStream(),eWrapperOne(), version());
    }

    public static EReader reader3() {
	return new EReader(portfolioCaseDataStream2(),eWrapperOne(), version());
    }

    public static EReader reader4() {
	return new EReader(acctUpdateTimeDatastream(), eWrapperOne(), version());
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
    
}
