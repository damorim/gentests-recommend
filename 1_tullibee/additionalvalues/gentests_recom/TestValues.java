package gentests_recom;

import randoop.*;

import java.io.*;
import com.ib.client.*;
import java.net.Socket;
import java.util.*;
import java.net.Socket;
import java.util.Vector;

public class TestValues {
	/** Emmanuel (efn@cin.ufpe.br) ***/
	// covers com.ib.client.EWrapperMsgGenerator.tickOptionComputation(int tickerId,
	// int field, double impliedVol,double delta, double modelPrice, double
	// pvDividend):43 (branch true)
	// public static DataInputStream tickOptionComputationFactory() {

	// 	String action = "21", version = "5", tickerId = "13", tickType = "13", impliedVol = "2.57", delta = "2.57",
	// 			modelPrice = "2.57", pvDividend = "2.57", end = "-1";

	// 	String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + impliedVol + "\0" + delta
	// 			+ "\0" + modelPrice + "\0" + pvDividend + "\0" + end + "\0";

   //    return new DataInputStream(new StringBufferInputStream(all, eWrapperOne_marcelo()));      
	// }

	// covers com.ib.client.EClientSocket.faMsgTypeName(int faDataType):127~128
	public static DataInputStream faMsgTypeNameFactory1() {
		String switchCase = "16";
		String version = "2";
		String type = "1";
		String xml = "<?xml version='1.0'?>";
		String input = switchCase + "\0" + version + "\0" + type + "\0" + xml + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

	// covers com.ib.client.EClientSocket.faMsgTypeName(int faDataType):129~130
	public static DataInputStream faMsgTypeNameFactory2() {
		String switchCase = "16";
		String version = "2";
		String type = "2";
		String xml = "<?xml version='1.0'?>";
		String input = switchCase + "\0" + version + "\0" + type + "\0" + xml + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

	/** Fernando (fhaa@cin.ufpe.br) ***/

	// covers EReader.processMsg(2):148-156

	/** Fernando (fhaa@cin.ufpe.br) ***/

	// covers EReader.processMsg(2):148-156 (CONFIRMED)
	public static DataInputStream tickSize_fernando() {
		int version = 1;
		int tickerId = 2;
		int tickType = 3;
		int size = 4;
		String all = "2" + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + size + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg(17):776-809 (NOT CONFIRMED)
	public static DataInputStream historicalData_fernando() {
		int version = 3;
		int reqId = 1;
		String startDateStr = "21/06/2020";
		String endDateStr = "21/06/2020";
		int itemCount = 1;
		String date = "21/06/2020";
		double open = 1.00;
		double high = 2.00;
		double low = 3.00;
		double close = 4.00;
		int volume = 5;
		double WAP = 6.00;
		String hasGaps = "false";
		int barCount = 7;

		String all = "17" + "\0" + version + "\0" + reqId + "\0" + startDateStr + "\0" + endDateStr + "\0" + itemCount
				+ "\0" + date + "\0" + open + "\0" + high + "\0" + low + "\0" + close + "\0" + volume + "\0" + WAP
				+ "\0" + hasGaps + "\0" + barCount + "\0" + "-1" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg(5):340-539 (NOT CONFIRMED. Is this interval
	// correct?)
	public static DataInputStream openOrder_fernando() {
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

	/** Saulo **/
	// TODO: coloque a linha coberta em cada metodo (conforme orientacao classrooom.
	// como rafael, abaixo)
	// covers com.ib.client.EReader, processMsg, 114-123 (NOT CONFIRMED)
	public static DataInputStream disOne_saulo() {
		String action = "1";
		String part1 = "2";
		String part2 = "3";
		String part3 = "4";
		String part4 = "2.97";
		String part5 = "1";
		String end = "-1";
		String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end
				+ "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EReader, processMsg, 159-162 (CONFIRMED)
	public static DataInputStream disOne2_saulo() {
		String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "13" + "\0" + "-3.05" + "\0" + "4.45" + "\0" + "6.54"
				+ "\0" + "5.12" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// com.ib.client.EReader, processMsg, 176 (CONFIRMED)
	public static DataInputStream disOne3_saulo() {
		String all = "21" + "\0" + "2" + "\0" + "3" + "\0" + "15" + "\0" + "-3.05" + "\0" + "4.45" + "\0" + "6.54"
				+ "\0" + "5.12" + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/*** Rafael Mota ***/

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order,
	// OrderState):137-140 (NOT CONFIRMED)
	public static DataInputStream disOpenOrderBag_rafaelmota() {
		String action = "5"; // open order action
		String version = "14";

		String all = action + "\0" + version + "\0" + "3" + "\0" + "4" + "\0" + "BAG" + "\0"; // pass the m_secType as
																								// BAG

		// fill the rest of parameters needed for this version
		// inclunding the m_comboLegsDescrip parameter
		for (int i = 0; i < 61; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order,
	// OrderState):147-153 (CONFIRMED)
	public static DataInputStream disOpenOrderUnderComp_rafaelmota() {
		String action = "5"; // open order action
		String version = "20"; // version just enough to fill the UnderComp field

		String all = action + "\0" + version + "\0";

		// fill the parameters needed for this version
		// including the UnderComp values
		for (int i = 0; i < 84; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order,
	// OrderState):155-158 (CONFIRMED)
	public static DataInputStream disOpenOrderAlgo_rafaelmota() {
		String action = "5"; // open order action
		String version = "21"; // version enogh to fill the algo fields

		String all = action + "\0" + version + "\0";

		// fill the needed parameters before m_algoStrategy
		for (int i = 0; i < 74; i++) {
			all += ("1" + "\0");
		}

		// fill the parameters in a way that covers all lines at m_algoStrategy branch
		all += "algo_strategy" + "\0" + "2" + "\0" + "tag1" + "\0" + "value1" + "\0" + "tag2" + "\0" + "value2" + "\0";

		// fill the rest of the needed parameters for this version
		for (int i = 0; i < 10; i++) {
			all += ("1" + "\0");
		}
		// add end of message action number
		all += "-1" + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EWrapperMsgGenerator.openOrder(int, Contract, Order,
	// OrderState):Used to cover multiple lines
	public static EWrapper eWrapper_rafaelmota() {
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
				EWrapperMsgGenerator.openOrder(orderId, contract, order, orderState);
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

	/*** Matheus Barbosa ***/
	// covers com.ib.client.EReader.processMsg(int msgId). Case MARKET_DEPTH:722-734
	public static DataInputStream marketDepth_matheusbarbosa() {
		int switchCase = 12, version = 1, id = 2, position = 3, operation = 4, side = 5, size = 8;
		Double price = 6.70;
		String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + operation + "\0" + side + "\0"
				+ price + "\0" + size + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

	// covers com.ib.client.EReader.processMsg(int msgId). Case MARKET_DEPTH:736-749
	public static DataInputStream marketDepthL2_matheusbarbosa() {
		int switchCase = 13, version = 1, id = 3, position = 4, operation = 5, side = 6, size = 9;
		Double price = 7.80;
		String marketMaker = "marketMaker";
		String input = switchCase + "\0" + version + "\0" + id + "\0" + position + "\0" + marketMaker + "\0" + operation
				+ "\0" + side + "\0" + price + "\0" + size + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

	// covers com.ib.client.EReader.processMsg(int msgId). Case
	// NEWS_BULLETINS:751-760
	public static DataInputStream newsBulletins_matheusbarbosa() {
		int switchCase = 14, version = 1, newsMsgId = 1, newsMsgType = 2;
		String newsMessage = "newsMessage", originatingExch = "originatingExch";
		String input = switchCase + "\0" + version + "\0" + newsMsgId + "\0" + newsMsgType + "\0" + newsMessage + "\0"
				+ originatingExch + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

	public static int serverVersion_matheusbarbosa() {
		return 39;
	}

	public static EReader reader2_matheusbarbosa() {
		return new EReader(marketDepth_matheusbarbosa(), eWrapper_rafaelmota(), serverVersion_matheusbarbosa());
	}

	public static EReader reader3_matheusbarbosa() {
		return new EReader(marketDepthL2_matheusbarbosa(), eWrapper_rafaelmota(), serverVersion_matheusbarbosa());
	}

	public static EReader reader4_matheusbarbosa() {
		return new EReader(newsBulletins_matheusbarbosa(), eWrapper_rafaelmota(), serverVersion_matheusbarbosa());
	}

	/** Victor Melo **/
	// covers com.ib.client.EReader.processMsg(int msgId). Case TICK_PRICE:114-147
	public static DataInputStream readerTickPrice_victormelo() {
		String action = "1";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		double price = 20.50;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + price + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EReader.processMsg(int msgId). Case TICK_SIZE:148-156
	public static DataInputStream readerTickSize_victormelo() {
		String action = "2";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		int size = 5;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + size + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers com.ib.client.EReader.processMsg(int msgId). Case
	// TICK_OPTION_COMPUTATION:158-181
	public static DataInputStream readerTickOptionComputation_victormelo() {
		String action = "3";
		int version = 1;
		int tickerId = 213;
		int tickType = 2;
		double impliedVol = 10.00;
		String all = action + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + impliedVol + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static void eReaderTickPrice_victormelo() {
		new com.ib.client.EReader(readerTickPrice_victormelo(), eWrapper_rafaelmota(), 44);
	}

	public static void eReaderTickSize_victormelo() {
		new com.ib.client.EReader(readerTickSize_victormelo(), eWrapper_rafaelmota(), 44);
	}

	public static void eReaderTickOptionComputation_victormelo() {
		new com.ib.client.EReader(readerTickOptionComputation_victormelo(), eWrapper_rafaelmota(), 44);
	}

	/*** Eden ***/
    // com.ib.client.EReader, processMsg, 887, "default: {",
    // com.ib.client.EReader, processMsg, 822, "case REAL_TIME_BARS: {" (NOT COVERED)
    // com.ib.client.EReader, processMsg, 203, "case TICK_EFP: {"       (NOT COVERED)
  	public static DataInputStream disOne_eden() {
		String action = "01293";
		String all = action + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg:882
	public static DataInputStream disTwo_eden() {
		String all = "50" + "\0";
		for (int i = 0; i < 10; i++) {
			all += "112" + "\0";
		}
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg:203
	public static DataInputStream disThree_eden() {
		String all = "47" + "\0";
		for (int i = 0; i < 10; i++) {
			all += "113" + "\0";
		}
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/*** Filipe Melo ***/
	// covers com.ib.client.EReader:processMsg:110
	public static DataInputStream disOne_filipe() {
		return new DataInputStream(new StringBufferInputStream("-1\0"));
	}

	// covers com.ib.client.EReader:readStr:909
	public static DataInputStream disTwo_filipe() {
		return new DataInputStream(new StringBufferInputStream("1\0\0"));
	}

	// covers com.ib.client.EReader:processMsg:545
	public static DataInputStream disThree_filipe() {
		return new DataInputStream(new StringBufferInputStream("9" + "\0" + "1" + "\0" + "1" + "\0"));
	}

	/*** Claudio Carvalho ***/
    //com.ib.client.Util, VectorEqualsUnordered, 55, "if (lhsCount == 0)",
	public static Vector vectorOne_claudiocarvalho() {
		return new Vector(Arrays.asList("A", "B", "C"));
	}

	public static Vector vectorTwo_claudiocarvalho() {
		return new Vector(Arrays.asList("X", "Y", "Z"));
	}

    // com.ib.client.Util, VectorEqualsUnordered, 53, "return false;",    
	public static Vector vectorThree_claudiocarvalho() {
		return new Vector(Arrays.asList("X", "Y"));
	}

    // com.ib.client.Util, VectorEqualsUnordered, 56, "return true;",    
	public static Vector vectorFour_claudiocarvalho() {
		return new Vector();
	}


	/** Lais **/
	//  UnderComp, line 44, "if (p_other == null)" (CONFIRMED)
	public static UnderComp underCompNull_lais() {
		return null;
	}

    // UnderComp, lines 50, 53 and 56, " if (m_conId != l_theOther.m_conId)/ ()
	public static UnderComp underCompThree_lais() {
		UnderComp under = new UnderComp();
		under.m_conId = 1;
		under.m_delta = 1.0;
		under.m_price = 1.0;
		return under;
	}


    // UnderComp, lines 50, 53 and 56, "if (m_conId != l_theOther.m_conId)    
	public static UnderComp underCompThreeIf_lais() {
		UnderComp under = new UnderComp();
		under.m_conId = 2;
		under.m_delta = 2.0;
		under.m_price = 2.0;
		return under;
	}


	/*** Denini Gabriel ***/
	// Entendi que fazer um Singleton, neste caso, aumentará as chances do Randoop
	// cobrir este caso
	// covers com.ib.client.TagValue.equals line 41
	private static TagValue SingletonTagValue;

	public static TagValue denini4() {
		if (SingletonTagValue == null) {
			SingletonTagValue = new TagValue("Tag1", "Value1");
		}
		return SingletonTagValue;
	}

	public static TagValue denini5() {
		return denini4();
	}

	/** Arthur Castro **/
	public static DataInputStream disOne_arthur() {
		String action = "10";
		int integer = 2;
		String str = "3";
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + str + "\0" + str + "\0" + str + "\0" + value + "\0" + str + "\0"
				+ str + "\0" + str + "\0" + str + "\0" + str + "\0" + str + "\0" + "\0" + integer + "\0" + value + "\0"
				+ str + "\0" + str + "\0" + integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disTwo_arthur() {
		String action = "56";
		int integer = 2;
		double value = 1.999;
		String all = action + "\0" + integer + "\0" + integer + "\0" + integer + "\0" + value + "\0" + value + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disThree_arthur() {
		String action = "57";
		int integer = 2;
		String all = action + "\0" + integer + "\0" + integer + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/** Lucas Cardoso **/
	// Helper Function
	public static DataInputStream portfolioCaseDataStream_lucascardoso() {
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
		String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" + expirity + "\0"
				+ strike + "\0" + right + "\0" + multiplier + "\0" + primaryExch + "\0" + currency + "\0" + localSymbol
				+ "\0" + position + "\0" + marketPrice + "\0" + marketValue + "\0" + averageCost + "\0" + unrealizedPNL
				+ "\0" + realizedPNL + "\0" + accountName + "\0" + end + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// Helper Function
	public static DataInputStream portfolioCaseDataStream2_lucascardoso() {
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
		String all = action + "\0" + version + "\0" + conId + "\0" + symbol + "\0" + secType + "\0" + expirity + "\0"
				+ strike + "\0" + right + "\0" + currency + "\0" + localSymbol + "\0" + position + "\0" + marketPrice
				+ "\0" + marketValue + "\0" + averageCost + "\0" + unrealizedPNL + "\0" + realizedPNL + "\0"
				+ accountName + "\0" + primaryExch + "\0" + end + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// Helper Function
	public static DataInputStream acctUpdateTimeDatastream_lucascardoso() {
		String action = "8";
		String version = "6";
		String timeStamp = "qw";
		String end = "-1";
		String all = action + "\0" + version + "\0" + timeStamp + end + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// com.ib.client.EReader, processMsg, 272 - 316 (branch if 308 false)
	public static EReader reader2_lucascardoso() {
		return new EReader(portfolioCaseDataStream_lucascardoso(), eWrapper_rafaelmota(), version_marcela());
	}

	// com.ib.client.EReader, processMsg, 309 (branch if 308 true)
	public static EReader reader3_lucascardoso() {
		return new EReader(portfolioCaseDataStream2_lucascardoso(), eWrapper_rafaelmota(), version_marcela());
	}

	// com.ib.client.EReader, processMsg, 320 - 323
	public static EReader reader4_lucascardoso() {
		return new EReader(acctUpdateTimeDatastream_lucascardoso(), eWrapper_rafaelmota(), version_marcela());
	}

	/** Marcela **/

	public static DataInputStream msgId_marcela() {
		return new DataInputStream(new StringBufferInputStream("1\0"));
	}


	// covers EReader.processMsg:541-546
	public static DataInputStream nextValidIdCase_marcela() {
		String switchCase = "9";
		String version = "2";
		String orderId = "8";
		String all = switchCase + "\0" + version + "\0" + orderId + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg:761-767
	public static DataInputStream managedAcctsCase_marcela() {
		String switchCase = "15";
		String version = "2";
		String accountsList = "2,3,5,12";
		String all = switchCase + "\0" + version + "\0" + accountsList + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers EReader.processMsg:768-775
	public static DataInputStream receiveFaCase_marcela() {
		String switchCase = "16";
		String version = "2";
		String faDataType = "14";
		String xml = "<?xml version='1.0'?>";
		String all = switchCase + "\0" + version + "\0" + faDataType + "\0" + xml + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static int version_marcela() {
		return 39;
	}

	public static EReader readerNextValidIdCase_marcela() {
		return new EReader(nextValidIdCase_marcela(), eWrapper_rafaelmota(), version_marcela());
	}

	public static EReader readerManagedAcctsCase_marcela() {
		return new EReader(managedAcctsCase_marcela(), eWrapper_rafaelmota(), version_marcela());
	}

	public static EReader readerReceiveFaCase_marcela() {
		return new EReader(receiveFaCase_marcela(), eWrapper_rafaelmota(), version_marcela());
	}

	/** Aldiberg does not improve coverage **/
    // com.ib.client.EReader, processMsg, 629, "int version = readInt();", (COVERED)
	public static DataInputStream disOneOne_aldiberg() {
		// case : BOND_CONTRACT_DATA -> Ereader.processMsg(629)
		String str = "kkeaemen";
		Double dd = 7.77;
		int interino = 1;
		String action = "18";
		String input = action + "\0" + interino + "\0" + str + "\0" + str + "\0" + str + "\0" + dd + "\0" + str + "\0"
				+ str + "\0" + str + "\0" + str + "\0" + str + "\0" + interino + "\0" + interino + "\0" + interino
				+ "\0" + str + "\0" + str + "\0" + str + "\0" + str + "\0" + str + "\0" + interino + "\0" + dd + "\0"
				+ str + "\0" + str + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

    // com.ib.client.EReader, processMsg, 856, "/* int version = */readInt();",   (NOT COVERED)
	public static DataInputStream disOneTwo_aldiberg() {
		// case: ACCT_DOWNLOAD_END -> Ereader.processMsg(856)
		String action = "54";
		String interino = "1";
		String textinput = "berg";
		String input = action + "\0" + interino + "\0" + textinput + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

   // com.ib.client.EReader, processMsg, 861, "/* int version = */readInt();" (COVERED)
	public static DataInputStream disOneThree_aldiberg() {
		// case: EXECUTION_DATA_END -> Ereader.processMsg(861)
		String action = "55";
		String interino = "1";
		String input = action + "\0" + interino + "\0" + interino + "\0";
		return new DataInputStream(new StringBufferInputStream(input));
	}

   // com.ib.client.Ereader, processMsg, 858, "eWrapper().accountDownloadEnd(accountName);",    (NOT COVERED)
	public static EReader eReaderOne_aldiberg() {
		return new com.ib.client.EReader(disOneOne_aldiberg(), eWrapper_rafaelmota(), 44);
	}

   // com.ib.client.Ereader, processMsg, 864, "eWrapper().execDetailsEnd(reqId);"    (COVERED)
	public static EReader eReaderTwo_aldiberg() {
		return new com.ib.client.EReader(disOneTwo_aldiberg(), eWrapper_rafaelmota(), 44);
	}

   // com.ib.client.Ereader, processMsg, 668, "eWrapper().bondContractDetails(reqId, contract);"  (COVERED)
	public static EReader eReaderThree_aldiberg() {
		return new com.ib.client.EReader(disOneThree_aldiberg(), eWrapper_rafaelmota(), 44);
	}

	/*** Daniel Bastos ***/
	public static DataInputStream disOne_db() {
		String action = "52";
		String part1 = "2";
		String part2 = "3";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disTwo_db() {
		String action = "53";
		String part1 = "2";
		String all = action + "\0" + part1 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	// covers: case OPEN_ORDER_END (linha 850)
	public static EReader eReaderOne_db() {
		return new com.ib.client.EReader(disTwo_db(), eWrapper_rafaelmota(), 44);
	}

	// covers: case CONTRACT_DATA_END (linha 844)
	public static EReader eReaderTwo_db() {
		return new com.ib.client.EReader(disOne_db(), eWrapper_rafaelmota(), 44);
	}

	// covers: case EXECUTION_DATA (linha 582)
	public static EReader eReaderThree_db() {
		String answer = "11" + "\0" + "7" + "\0";
		for (int i = 0; i < 23; i++) {
			answer += "11" + "\0";
		}
		return new com.ib.client.EReader(new DataInputStream(new StringBufferInputStream(answer)),
				eWrapper_rafaelmota(), 44);
	}

	/*** Lucas Barros ***/

	// covers EReader.processMsg(20):548-574
	public static DataInputStream disOne2_lucasbarros() {
		return new DataInputStream(
				new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("3", "1")));
	}

	// covers EReader.processMsg(20):578-579
	public static DataInputStream disOne3_lucasbarros() {
		return new DataInputStream(
				new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("3", "0")));
	}

	// covers EReader.processMsg(20):555-557, 572-574
	public static DataInputStream disOne4_lucasbarros() {
		return new DataInputStream(
				new StringBufferInputStream(getScannerDataWithVersionAndNumberOfElements_lucasbarros("0", "1")));
	}

	private static String getScannerDataWithVersionAndNumberOfElements_lucasbarros(String version,
			String numberOfElements) {
		String action = "20";
		String tickerId = "3";
		String all = action + "\0" + version + "\0" + tickerId + "\0" + numberOfElements + "\0";

		if (Integer.parseInt(numberOfElements) > 0) {
			String rank = "1";

			all += rank + "\0";

			if (Integer.parseInt(version) >= 3) {
				String m_conId = "1";
				all += m_conId + "\0";
			}

			for (int i = 0; i < 3; i++) {
				all += "a" + "\0";
			}

			String m_strike = "2.8";
			all += m_strike + "\0";

			for (int i = 0; i < 9; i++) {
				all += "a" + "\0";
			}

			if (Integer.parseInt(version) >= 2) {
				String legsStr = "a";
				all += legsStr + "\0";
			}
		}

		return all;
	}

	/** Marcelo **/

	public static DataInputStream disOne_marcelo() {
		String action = "1";
		String part1 = "2";
		String part2 = "3";
		String part3 = "4";
		String part4 = "2.97";
		String part5 = "1";
		String end = "-1";
		String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0" + part4 + "\0" + part5 + "\0" + end
				+ "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/** Raquel Santos **/
	// ComboLeg - line 69 (CONFIRMED)
	public static ComboLeg comboIsNull_raquel() {
		return null;
	}

	// ComboLeg - line 66 (NOT CONFIRMED)
	public static ComboLeg comboEquals_raquel() {
		ComboLeg comboLeg = new ComboLeg();
		comboLeg.m_conId = 3;
		comboLeg.m_ratio = 3;
		comboLeg.m_action = "3";
		comboLeg.m_exchange = "3";
		comboLeg.m_openClose = 3;
		comboLeg.m_shortSaleSlot = 3;
		comboLeg.m_designatedLocation = "3";
		return comboLeg;
	}

	// ComboLeg - line 66 AND line 75 a 80 (NOT CONFIRMED)
	public static ComboLeg comboEqualsAndNotEquals_raquel() {
		ComboLeg comboLeg = new ComboLeg();
		comboLeg.m_conId = 3;
		comboLeg.m_ratio = 3;
		comboLeg.m_action = "3";
		comboLeg.m_exchange = "3";
		comboLeg.m_openClose = 3;
		comboLeg.m_shortSaleSlot = 3;
		comboLeg.m_designatedLocation = "3";
		return comboLeg;
	}

	// ComboLeg - line 75 a 80 (NOT CONFIRMED)
	public static ComboLeg comboNotEquals_raquel() {
		ComboLeg comboLeg = new ComboLeg();
		comboLeg.m_conId = 2;
		comboLeg.m_ratio = 2;
		comboLeg.m_openClose = 2;
		comboLeg.m_shortSaleSlot = 2;
		return comboLeg;
	}

	/** Gabriela (gab@cin.ufpe.br) **/
	// com.ib.client.ExecutionFilter, equals, 52, "if ( p_other == null )",
	public static ExecutionFilter executionFilterNull_gabriela() {
		return null;
	}


	// com.ib.client.Util, VectorEqualsUnordered, 49-50, "int lhsCount = lhs == null
	// ? 0 : lhs.size();" (first branch)
	public static Vector vectorNull_gabriela() {
		return null;
	}

	// com.ib.client.Util, VectorEqualsUnordered, 49-50, "int lhsCount = lhs == null
	// ? 0 : lhs.size();" (second branch),
	public static Vector vectorFull_gabriela() {
		Vector v = new Vector();
		v.add(3);
		return v;
	}

	/** Matheus Borba **/
	// EReader, case ACCT_VALUE, 258-269;
	public static DataInputStream orderStatus_matheusborba() {
		// first input of values
		String switchCase = "3", version = "6", id = "2", status = "status", filled = "7", remaining = "8",
				avgFillPrice = "2.64";
		String firstInput = switchCase + "\0" + version + "\0" + id + "\0" + status + "\0" + filled + "\0" + remaining
				+ "\0" + avgFillPrice + "\0";
		// second input of values, all this values are inside the if cases
		String permId = "0", parentId = "10", lastFillPrice = "6.9", clientId = "5", whyHeld = "whyHeld";
		String secondInput = permId + "\0" + parentId + "\0" + lastFillPrice + "\0" + clientId + "\0" + whyHeld + "\0";
		return new DataInputStream(new StringBufferInputStream(firstInput + secondInput));
	}

	// EReader, case ORDER_STATUS, 220-256;
	public static DataInputStream acctValue_matheusborba() {
		String switchCase = "6";
		String version = "2";
		String key = "key";
		String val = "val";
		String cur = "cur";
		String accountName = "Name";
		String input = switchCase + "\0" + version + "\0" + key + "\0" + val + "\0" + cur + "\0" + accountName + "\0";

		return new DataInputStream(new StringBufferInputStream(input));
	}

	/*** Arnaldo Morais ***/
	// TODO: (1) Vc. esta chamando metodos nao relacionado a construcao do objeto
	// retornado
	// (2) Vc. esta construindo objetos nao relacionados ao objeto retornado.

	// public static ExecutionFilter executionFilterEquals55_arnaldomorais(){
	// ExecutionFilter f1 = new ExecutionFilter();
	// f1.equals(f1);
	// return f1;
	// }

	// public static ExecutionFilter executionFilterEquals58_arnaldomorais(){
	// ExecutionFilter f1 = new ExecutionFilter();
	// ExecutionFilter f2 = new ExecutionFilter();
	// f1.equals(f2);
	// return f1;
	// }

	// public static Order orderEquals168_arnaldommorais(){
	// Order o1 = new Order();
	// o1.equals(o1);
	// return o1;
	// }

	// public static Order orderEquals171_arnaldomorais(){
	// Order o1 = new Order();
	// o1.equals(null);
	// return o1;
	// }

	/*** Igor dos Santos ***/

    // YOU CANT CALL EQUALS DIRECTLY!
    
   // com.ib.client.OrderState, equals, 59, "if (this == other)",
    // com.ib.client.OrderState, equals, 67, "if (m_commission != state.m_commission ||",
    // com.ib.client.OrderState, equals, 73, "if (Util.StringCompare(m_status, state.m_status) != 0 ||",    
	// public static OrderState equalsOne() {
	// 	OrderState orderStateOne = new OrderState("status", "initMargin", "maintMargin", "equityWithLoan", 0.5, 0.25,
	// 			0.75, "commissionCurrency", "warningText");

	// 	OrderState orderStateTwo = new OrderState("status", "initMargin", "maintMargin", "equityWithLoan", 0.53, 0.27,
	// 			0.79, "commissionCurrency", "warningText");

	// 	orderStateOne.equals(orderStateTwo);
	// 	return orderStateOne;
	// }

	// public static OrderState equalsTwo() {
	// 	OrderState orderState = new OrderState("status", "initMargin", "maintMargin", "equityWithLoan", 0.5, 0.25, 0.75,
	// 			"commissionCurrency", "warningText");

	// 	orderState.equals(orderState);
	// 	return orderState;
	// }

	// public static OrderState equalsThree() {
	// 	OrderState orderStateOne = new OrderState("status1", "initMargin", "maintMargin", "equityWithLoan", 0.5, 0.25,
	// 			0.75, "commissionCurrency", "warningText");

	// 	OrderState orderStateTwo = new OrderState("status2", "initMargin", "maintMargin", "equityWithLoan", 0.5, 0.25,
	// 			0.75, "commissionCurrency", "warningText");

	// 	orderStateOne.equals(orderStateTwo);
	// 	return orderStateOne;
	// }

	/*** Rodrigo ***/

	public static DataInputStream disOneScanner_rodrigo() {
		String action = "19";
		String part1 = "1";
		String part2 = "xmlfile";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disOneFundamental_rodrigo() {
		String action = "51";
		String part1 = "1";
		String part2 = "2";
		String part3 = "3";
		String all = action + "\0" + part1 + "\0" + part2 + "\0" + part3 + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static DataInputStream disOneTime_rodrigo() {
		String action = "49";
		String part1 = "1";
		String part2 = "101";
		String all = action + "\0" + part1 + "\0" + part2 + "\0";

		return new DataInputStream(new StringBufferInputStream(all));
	}

	public static void eReaderScanner_rodrigo() {
		new com.ib.client.EReader(disOneScanner_rodrigo(), eWrapper_rafaelmota(), 13).run();
	}

	public static void eReaderTime_rodrigo() {
		new com.ib.client.EReader(disOneTime_rodrigo(), eWrapper_rafaelmota(), 13).run();
	}

	/*** Vinicius Siqueira - vjs2@cin.ufpe.br ***/
	// line 103~105
	// com.ib.client.Contract, equals, 103, "if (Util.StringCompare(m_secType, l_theOther.m_secType) != 0) {" (COVERED)
	public static Contract ContZero_vinicius_siq() {
		Contract cont0 = new Contract();
		cont0.m_secType = "BOND";
		return cont0;
	}
	// Before I had created a method for each branch of this initializing only the
	// parameters that I wanted to test, now I created only two //methods in order
	// to cover these branches.

	// com.ib.client.Contract, equals, 107, "if (Util.StringCompare(m_symbol, l_theOther.m_symbol) != 0 ||" (COVERED)

    
	// com.ib.client.Contract, equals, 128, "if (Util.StringCompare(m_secIdType, l_theOther.m_secIdType) != 0) {" (NOT COVERED)
	// com.ib.client.Contract, equals, 132, "if (Util.StringCompare(m_secId, l_theOther.m_secId) != 0) {" (PARTIALLY)
	public static Contract ContOne_vinicius_siq() {
		Contract contrato = new Contract();

		contrato.m_conId = 37;
		contrato.m_symbol = "Suj00-sym";
		// contrato.m_secType = "BAG";
		contrato.m_secType = "BOND";
		contrato.m_expiry = "20200730-12:12:12";
		contrato.m_strike = 2.0;
		contrato.m_right = "Suj03-right";
		contrato.m_multiplier = "2";
		contrato.m_exchange = "Suj00-exc";
		contrato.m_currency = "Dollar";
		contrato.m_localSymbol = "symbol";
		contrato.m_primaryExch = "Suj00-priEx";
		contrato.m_includeExpired = false;
		contrato.m_secIdType = "RIC";
		contrato.m_secId = "38";

		return contrato;
	}

   // TODO: how this is helping??? -Marcelo
	public static Contract ContTwo_vinicius_siq() {

		Contract vazio = new Contract();
		return vazio;
	}


	/* Vinicius Thiago (vtls@cin.ufpe.br) */
	// Cover 137
	public static Contract returnContractVector1() {
		Contract cont = new Contract();
		Vector v1 = new Vector();
		v1.add(1);
		cont.m_comboLegs = v1;
		return cont;
	}

    //Cover 137
    public static Contract returnContractVector2() {
        Contract cont1 = new Contract();
        Vector v2 = new Vector();
        v2.add(2);
        cont1.m_comboLegs = v2;
        return cont1;
    }
    

	// Cover 141
	public static Contract returnContractUnder1() {
		Contract cont = new Contract();
		UnderComp under1 = new UnderComp();
		under1.m_conId = 1;
		cont.m_underComp = under1;
		return cont;
	}

	// Cover 141
	public static Contract returnContractUnder2() {
		Contract cont1 = new Contract();
		UnderComp under2 = new UnderComp();
		cont1.m_underComp = under2;
		return cont1;
	}
    


	// Galileu Santos

	public static DataInputStream msgIdBufferStreamGalileu() {
		return new DataInputStream(new StringBufferInputStream("1\0"));
	}

	/*
	 * com.ib.client.EReader, processMsg, 184 to 191, "case TICK_GENERIC: {", Select
	 * switch case TICK_GENRIC in on variable of type DataInputStream, Unable to
	 * create TICK_GENERIC, added new object DataInputStream
	 */

	public static DataInputStream tickGenericGalileu() {
		String action_TICK_GENERIC = "45", version = "2", tickerId = "7", tickType = "8", value = "2.57";
		String all = action_TICK_GENERIC + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + value + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/*
	 * com.ib.client.EReader, processMsg, 193 to 201, "case TICK_STRING: {", Select
	 * switch case TICK_STRING in on variable of type DataInputStream, Unable to
	 * create TICK_STRING, added new object DataInputStream
	 */


	public static DataInputStream tickStringGalileu() {
		String action_TICK_STRING = "46", version = "1", tickerId = "7", tickType = "5", value = "value";
		String all = action_TICK_STRING + "\0" + version + "\0" + tickerId + "\0" + tickType + "\0" + value + "\0";
		return new DataInputStream(new StringBufferInputStream(all));
	}

	/*
	 * com.ib.client.EReader, processMsg, 326 a 338, "case ERR_MSG:", Select switch
	 * case ERR_MSG with condicional TRUE and FALSE for version < 2 in on variable
	 * of type DataInputStream, Unable to create ERR_MSG and condicional version <
	 * 2, added new object DataInputStream
	 */

    public static DataInputStream errMgsGalileu() {
		String action_ERR_MSG = "4", version = "1", msg = "msg";

		// True Condition
		String errTrue = action_ERR_MSG + "\0" + version + "\0" + msg + "\0";

		// False Condition
		version = "5";
		String id = "5", errorCode = "1", errorMsg = "errorMsg";

		String errFalse = action_ERR_MSG + "\0" + version + "\0" + id + "\0" + errorCode + "\0" + errorMsg + "\0";

		return new DataInputStream(new StringBufferInputStream(errTrue + errFalse));
	}

	public static int versionGalileu() {
		return 39;
	}

	public static EReader readerTickGenericGalileu() {
		return new EReader(tickGenericGalileu(), eWrapper_rafaelmota(), versionGalileu());
	}

	public static EReader readerTickStringGalileu() {
		return new EReader(tickStringGalileu(), eWrapper_rafaelmota(), versionGalileu());
	}

	public static EReader readerErrMgsGalileu() {
		return new EReader(errMgsGalileu(), eWrapper_rafaelmota(), versionGalileu());
	}

}
<
