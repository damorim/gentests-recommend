package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;
import java.util.Vector;

public class TestValues {

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

    // Os seguintes metodos cobrem as linhas 137, 138, 141, 143, 146 e 150

    public static Contract linha137() {
    	Contract cont = new Contract();
    	Contract cont1 = new Contract();
    	Vector v1 = new Vector();
    	v1.add(1);
    	Vector v2 = new Vector();
    	v1.add(2);  	
    	cont.m_comboLegs = v1;
    	cont1.m_comboLegs = v2;

    	cont.equals(cont1);

    	return cont;
    }

    public static Contract linha141e146(){
    	UnderComp under1 = new UnderComp();
    	under1.m_conId = 1;
    	UnderComp under2 = new UnderComp();

    	Contract cont = new Contract();
    	Contract cont1 = new Contract();

    	cont.m_underComp = under1;
    	cont1.m_underComp = under2;

    	cont.equals(cont1);

    	return cont;
    }

    public static Contract linha141False(){
    	UnderComp under1 = new UnderComp();

    	Contract cont = new Contract();
    	Contract cont1 = new Contract();

    	cont.m_underComp = under1;
    	cont1.m_underComp = under1;

    	cont.equals(cont1);

    	return cont;	
    }

    public static Contract linha142(){
    	UnderComp under1 = new UnderComp();
    	under1.m_conId = 1;
    	UnderComp under2 = null;

    	Contract cont = new Contract();
    	Contract cont1 = new Contract();

    	cont.m_underComp = under1;
    	cont1.m_underComp = under2;

    	cont.equals(cont1);

    	return cont;
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
