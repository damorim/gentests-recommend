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
	
	public static Contract contractif89() {
		Contract a = new Contract();
		a.equals(null);

		return a;
	}

	public static Contract contractif93() {
		Contract a = new Contract();
		a.equals(a);

		return a;
	}

	public static Execution executionEquals71() {
		Execution a = new Execution();
		a.equals(a);

		return a;
	}

	public static Execution executionIf73() {
		Execution a = new Execution();
		a.equals(null);

		return a;
	}

	public static EWrapper eWrapperOne() {

		return new com.ib.client.EWrapper() {

			@Override
			public void error(final Exception e) {
				e.printStackTrace();
			}

			@Override
			public void error(final String str) {
			}

			@Override
			public void error(final int id, final int errorCode, final String errorMsg) {
			}

			@Override
			public void connectionClosed() {
			}

			@Override
			public void tickPrice(final int tickerId, final int field, final double price, final int canAutoExecute) {
			}

			@Override
			public void tickSize(final int tickerId, final int field, final int size) {
			}

			@Override
			public void tickOptionComputation(final int tickerId, final int field, final double impliedVol,
					final double delta, final double modelPrice, final double pvDividend) {
			}

			@Override
			public void tickGeneric(final int tickerId, final int tickType, final double value) {
			}

			@Override
			public void tickString(final int tickerId, final int tickType, final String value) {
			}

			@Override
			public void tickEFP(final int tickerId, final int tickType, final double basisPoints,
					final String formattedBasisPoints, final double impliedFuture, final int holdDays,
					final String futureExpiry, final double dividendImpact, final double dividendsToExpiry) {
			}

			@Override
			public void orderStatus(final int orderId, final String status, final int filled, final int remaining,
					final double avgFillPrice, final int permId, final int parentId, final double lastFillPrice,
					final int clientId, final String whyHeld) {
			}

			@Override
			public void openOrder(final int orderId, final Contract contract, final Order order,
					final OrderState orderState) {
			}

			@Override
			public void openOrderEnd() {
			}

			@Override
			public void updateAccountValue(final String key, final String value, final String currency,
					final String accountName) {
			}

			@Override
			public void updatePortfolio(final Contract contract, final int position, final double marketPrice,
					final double marketValue, final double averageCost, final double unrealizedPNL,
					final double realizedPNL, final String accountName) {
			}

			@Override
			public void updateAccountTime(final String timeStamp) {
			}

			@Override
			public void accountDownloadEnd(final String accountName) {
			}

			@Override
			public void nextValidId(final int orderId) {
			}

			@Override
			public void contractDetails(final int reqId, final ContractDetails contractDetails) {
			}

			@Override
			public void bondContractDetails(final int reqId, final ContractDetails contractDetails) {
			}

			@Override
			public void contractDetailsEnd(final int reqId) {
			}

			@Override
			public void execDetails(final int reqId, final Contract contract, final Execution execution) {
			}

			@Override
			public void execDetailsEnd(final int reqId) {
			}

			@Override
			public void updateMktDepth(final int tickerId, final int position, final int operation, final int side,
					final double price, final int size) {
			}

			@Override
			public void updateMktDepthL2(final int tickerId, final int position, final String marketMaker,
					final int operation, final int side, final double price, final int size) {
			}

			@Override
			public void updateNewsBulletin(final int msgId, final int msgType, final String message,
					final String origExchange) {
			}

			@Override
			public void managedAccounts(final String accountsList) {
			}

			@Override
			public void receiveFA(final int faDataType, final String xml) {
			}

			@Override
			public void historicalData(final int reqId, final String date, final double open, final double high,
					final double low, final double close, final int volume, final int count, final double WAP,
					final boolean hasGaps) {
			}

			@Override
			public void scannerParameters(final String xml) {
			}

			@Override
			public void scannerData(final int reqId, final int rank, final ContractDetails contractDetails,
					final String distance, final String benchmark, final String projection, final String legsStr) {
			}

			@Override
			public void scannerDataEnd(final int reqId) {
			}

			@Override
			public void realtimeBar(final int reqId, final long time, final double open, final double high,
					final double low, final double close, final long volume, final double wap, final int count) {
			}

			@Override
			public void currentTime(final long time) {
			}

			@Override
			public void fundamentalData(final int reqId, final String data) {
			}

			@Override
			public void deltaNeutralValidation(final int reqId, final UnderComp underComp) {
			}

			@Override
			public void tickSnapshotEnd(final int reqId) {
			}

	   	@Override
	   	public void stopRequested() {		}

        };
        
    }    
    
}
