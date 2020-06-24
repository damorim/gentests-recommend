package gentests_recom;

import randoop.*;
import java.io.*;
import com.ib.client.*;

public class TestValues {

	// // case TICK_SIZE
	// public static DataInputStream disOne() {

	// int version = 1;
	// int tickerId = 2;
	// int tickType = 3;
	// int size = 4;
	// String all = "2" + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0"
	// + size + "\0" + "-1" + "\0";
	// return new DataInputStream(new StringBufferInputStream(all));
	// }

	// case HISTORICAL_DATA
	// public static DataInputStream disOne() {
	// int version = 3;
	// int reqId = 1;
	// String startDateStr = "21/06/2020";
	// String endDateStr = "21/06/2020";
	// int itemCount = 1;
	// String date = "21/06/2020";
	// double open = 1.00;
	// double high = 2.00;
	// double low = 3.00;
	// double close = 4.00;
	// int volume = 5;
	// double WAP = 6.00;
	// String hasGaps = "false";
	// int barCount = 7;

	// String all = "17" + "\0" + version + "\0" + reqId + "\0" + startDateStr +
	// "\0" + endDateStr + "\0" + itemCount
	// + "\0" + date + "\0" + open + "\0" + high + "\0" + low + "\0" + close + "\0"
	// + volume + "\0" + WAP
	// + "\0" + hasGaps + "\0" + barCount + "\0" + "-1" + "\0";
	// return new DataInputStream(new StringBufferInputStream(all));
	// }

	// case OPEN_ORDER
	public static DataInputStream disOne() {
		int version = 22;

		int m_orderId = 1;

		// version >= 17
		int m_conId = 2;

		String m_symbol = "3";
		String m_secType = "4";
		String m_expiry = "5";
		double m_strike = 6.00;
		String m_right = "7";
		String m_exchange = "8";
		String m_currency = "9";

		// version >= 2
		String m_localSymbol = "10";

		String m_action = "11";
		int m_totalQuantity = 12;
		String m_orderType = "13";
		double m_lmtPrice = 14.00;
		double m_auxPrice = 15.00;
		String m_tif = "16";
		String m_ocaGroup = "17";
		String m_account = "18";
		String m_openClose = "19";
		int m_origin = 20;
		String m_orderRef = "21";

		// version >= 3
		int m_clientId = 22;

		// version >= 4
		int m_permId = 23;

		// version >= 18
		int m_outsideRth = 1;

		int m_hidden = 1;
		double m_discretionaryAmt = 24.00;

		// version >= 5
		String m_goodAfterTime = "25";

		// version >= 6
		String skip = "0";

		// version >= 7
		String m_faGroup = "26";
		String m_faMethod = "27";
		String m_faPercentage = "28";
		String m_faProfile = "29";

		// version >= 8
		String m_goodTillDate = "30";

		// version >= 9
		String m_rule80A = "31";
		double m_percentOffset = 32.00;
		String m_settlingFirm = "33";
		int m_shortSaleSlot = 34;
		String m_designatedLocation = "35";
		int m_auctionStrategy = 36;
		double m_startingPrice = 37.00;
		double m_stockRefPrice = 38.00;
		double m_delta = 39.00;
		double m_stockRangeLower = 40.00;
		double m_stockRangeUpper = 41.00;
		int m_displaySize = 42;
		int m_blockOrder = 1;
		int m_sweepToFill = 1;
		int m_allOrNone = 1;
		int m_minQty = 43;
		int m_ocaType = 44;
		int m_eTradeOnly = 1;
		int m_firmQuoteOnly = 1;
		double m_nbboPriceCap = 45.00;

		// version >= 10
		int m_parentId = 46;
		int m_triggerMethod = 47;

		// version >= 11
		double m_volatility = 48.00;
		int m_volatilityType = 49;
		String m_deltaNeutralOrderType = "51";
		double m_deltaNeutralAuxPrice = 52.00;
		int m_continuousUpdate = 53;
		int m_referencePriceType = 56;

		// version >= 13
		double m_trailStopPrice = 57.00;

		// version >= 14
		double m_basisPoints = 58.00;
		int m_basisPointsType = 59;
		String m_comboLegsDescrip = "Descrição";

		// version >= 15
		int m_scaleInitLevelSize = 60;
		int m_scaleSubsLevelSize = 61;
		String m_scalePriceIncrement = "62.00";

		// version >= 19
		String m_clearingAccount = "63";
		String m_clearingIntent = "64";

		// version >= 22
		int m_notHeld = 1;

		// version >= 20
		int if_boolean = 1;
		int m_conId_1 = 65;
		double m_delta_1 = 66.00;
		double m_price = 67.00;

		// version >= 21
		String m_algoStrategy = "strategy";
		int algoParamsCount = 1;
		String m_tag = "69";
		String m_value = "70";

		// version >= 16
		int m_whatIf = 1;
		String m_status = "71";
		String m_initMargin = "72";
		String m_maintMargin = "73";
		String m_equityWithLoan = "74";
		String m_commission = "75";
		String m_minCommission = "76";
		String m_maxCommission = "77";
		String m_commissionCurrency = "78";
		String m_warningText = "79";

		String all = "5" + "\0" + version + "\0" + m_orderId + "\0" + m_conId + "\0" + m_symbol + "\0" + m_secType
				+ "\0" + m_expiry + "\0" + m_strike + "\0" + m_right + "\0" + m_exchange + "\0" + m_currency + "\0"
				+ m_localSymbol + "\0" + m_action + "\0" + m_totalQuantity + "\0" + m_orderType + "\0" + m_lmtPrice
				+ "\0" + m_auxPrice + "\0" + m_tif + "\0" + m_ocaGroup + "\0" + m_account + "\0" + m_openClose + "\0"
				+ m_origin + "\0" + m_orderRef + "\0" + m_clientId + "\0" + m_permId + "\0" + m_outsideRth + "\0"
				+ m_hidden + "\0" + m_discretionaryAmt + "\0" + m_goodAfterTime + "\0" + skip + "\0" + m_faGroup + "\0"
				+ m_faMethod + "\0" + m_faPercentage + "\0" + m_faProfile + "\0" + m_goodTillDate + "\0" + m_rule80A
				+ "\0" + m_percentOffset + "\0" + m_settlingFirm + "\0" + m_shortSaleSlot + "\0" + m_designatedLocation
				+ "\0" + m_auctionStrategy + "\0" + m_startingPrice + "\0" + m_stockRefPrice + "\0" + m_delta + "\0"
				+ m_stockRangeLower + "\0" + m_stockRangeUpper + "\0" + m_displaySize + "\0" + m_blockOrder + "\0"
				+ m_sweepToFill + "\0" + m_allOrNone + "\0" + m_minQty + "\0" + m_ocaType + "\0" + m_eTradeOnly + "\0"
				+ m_firmQuoteOnly + "\0" + m_nbboPriceCap + "\0" + m_parentId + "\0" + m_triggerMethod + "\0"
				+ m_volatility + "\0" + m_volatilityType + "\0" + m_deltaNeutralOrderType + "\0"
				+ m_deltaNeutralAuxPrice + "\0" + m_continuousUpdate + "\0" + m_referencePriceType + "\0"
				+ m_trailStopPrice + "\0" + m_basisPoints + "\0" + m_basisPointsType + "\0" + m_comboLegsDescrip + "\0"
				+ m_scaleInitLevelSize + "\0" + m_scaleSubsLevelSize + "\0" + m_scalePriceIncrement + "\0"
				+ m_clearingAccount + "\0" + m_clearingIntent + "\0" + m_notHeld + "\0" + if_boolean + "\0" + m_conId_1
				+ "\0" + m_delta_1 + "\0" + m_price + "\0" + m_algoStrategy + "\0" + algoParamsCount + "\0" + m_tag
				+ "\0" + m_value + "\0" + m_whatIf + "\0" + m_status + "\0" + m_initMargin + "\0" + m_maintMargin + "\0"
				+ m_equityWithLoan + "\0" + m_commission + "\0" + m_minCommission + "\0" + m_maxCommission + "\0"
				+ m_commissionCurrency + "\0" + m_warningText + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static EWrapper eWrapperOne() {

		return new com.ib.client.EWrapper() {

			@Override
			public void error(Exception e) {
				e.printStackTrace();
			}

			@Override
			public void error(String str) {
			}

			@Override
			public void error(int id, int errorCode, String errorMsg) {
			}

			@Override
			public void connectionClosed() {
			}

			@Override
			public void tickPrice(int tickerId, int field, double price, int canAutoExecute) {
			}

			@Override
			public void tickSize(int tickerId, int field, int size) {
			}

			@Override
			public void tickOptionComputation(int tickerId, int field, double impliedVol, double delta,
					double modelPrice, double pvDividend) {
			}

			@Override
			public void tickGeneric(int tickerId, int tickType, double value) {
			}

			@Override
			public void tickString(int tickerId, int tickType, String value) {
			}

			@Override
			public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints,
					double impliedFuture, int holdDays, String futureExpiry, double dividendImpact,
					double dividendsToExpiry) {
			}

			@Override
			public void orderStatus(int orderId, String status, int filled, int remaining, double avgFillPrice,
					int permId, int parentId, double lastFillPrice, int clientId, String whyHeld) {
			}

			@Override
			public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {
			}

			@Override
			public void openOrderEnd() {
			}

			@Override
			public void updateAccountValue(String key, String value, String currency, String accountName) {
			}

			@Override
			public void updatePortfolio(Contract contract, int position, double marketPrice, double marketValue,
					double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {
			}

			@Override
			public void updateAccountTime(String timeStamp) {
			}

			@Override
			public void accountDownloadEnd(String accountName) {
			}

			@Override
			public void nextValidId(int orderId) {
			}

			@Override
			public void contractDetails(int reqId, ContractDetails contractDetails) {
			}

			@Override
			public void bondContractDetails(int reqId, ContractDetails contractDetails) {
			}

			@Override
			public void contractDetailsEnd(int reqId) {
			}

			@Override
			public void execDetails(int reqId, Contract contract, Execution execution) {
			}

			@Override
			public void execDetailsEnd(int reqId) {
			}

			@Override
			public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {
			}

			@Override
			public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side,
					double price, int size) {
			}

			@Override
			public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {
			}

			@Override
			public void managedAccounts(String accountsList) {
			}

			@Override
			public void receiveFA(int faDataType, String xml) {
			}

			@Override
			public void historicalData(int reqId, String date, double open, double high, double low, double close,
					int volume, int count, double WAP, boolean hasGaps) {
			}

			@Override
			public void scannerParameters(String xml) {
			}

			@Override
			public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance,
					String benchmark, String projection, String legsStr) {
			}

			@Override
			public void scannerDataEnd(int reqId) {
			}

			@Override
			public void realtimeBar(int reqId, long time, double open, double high, double low, double close,
					long volume, double wap, int count) {
			}

			@Override
			public void currentTime(long time) {
			}

			@Override
			public void fundamentalData(int reqId, String data) {
			}

			@Override
			public void deltaNeutralValidation(int reqId, UnderComp underComp) {
			}

			@Override
			public void tickSnapshotEnd(int reqId) {
			}

			@Override
			public void stopRequested() {
			}

		};

	}

}
